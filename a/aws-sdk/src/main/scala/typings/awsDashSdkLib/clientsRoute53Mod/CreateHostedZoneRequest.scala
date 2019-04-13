package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHostedZoneRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreateHostedZone requests to be retried without the risk of executing the operation twice. You must use a unique CallerReference string every time you submit a CreateHostedZone request. CallerReference can be any unique string, for example, a date/time stamp.
    */
  var CallerReference: Nonce
  /**
    * If you want to associate a reusable delegation set with this hosted zone, the ID that Amazon Route 53 assigned to the reusable delegation set when you created it. For more information about reusable delegation sets, see CreateReusableDelegationSet.
    */
  var DelegationSetId: js.UndefOr[ResourceId] = js.undefined
  /**
    * (Optional) A complex type that contains the following optional values:   For public and private hosted zones, an optional comment   For private hosted zones, an optional PrivateZone element   If you don't specify a comment or the PrivateZone element, omit HostedZoneConfig and the other elements.
    */
  var HostedZoneConfig: js.UndefOr[HostedZoneConfig] = js.undefined
  /**
    * The name of the domain. Specify a fully qualified domain name, for example, www.example.com. The trailing dot is optional; Amazon Route 53 assumes that the domain name is fully qualified. This means that Route 53 treats www.example.com (without a trailing dot) and www.example.com. (with a trailing dot) as identical. If you're creating a public hosted zone, this is the name you have registered with your DNS registrar. If your domain name is registered with a registrar other than Route 53, change the name servers for your domain to the set of NameServers that CreateHostedZone returns in DelegationSet.
    */
  var Name: DNSName
  /**
    * (Private hosted zones only) A complex type that contains information about the Amazon VPC that you're associating with this hosted zone. You can specify only one Amazon VPC when you create a private hosted zone. To associate additional Amazon VPCs with the hosted zone, use AssociateVPCWithHostedZone after you create a hosted zone.
    */
  var VPC: js.UndefOr[VPC] = js.undefined
}

object CreateHostedZoneRequest {
  @scala.inline
  def apply(
    CallerReference: Nonce,
    Name: DNSName,
    DelegationSetId: ResourceId = null,
    HostedZoneConfig: HostedZoneConfig = null,
    VPC: VPC = null
  ): CreateHostedZoneRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, Name = Name)
    if (DelegationSetId != null) __obj.updateDynamic("DelegationSetId")(DelegationSetId)
    if (HostedZoneConfig != null) __obj.updateDynamic("HostedZoneConfig")(HostedZoneConfig)
    if (VPC != null) __obj.updateDynamic("VPC")(VPC)
    __obj.asInstanceOf[CreateHostedZoneRequest]
  }
}

