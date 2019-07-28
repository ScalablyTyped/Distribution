package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedZone extends js.Object {
  /**
    * The value that you specified for CallerReference when you created the hosted zone.
    */
  var CallerReference: Nonce
  /**
    * A complex type that includes the Comment and PrivateZone elements. If you omitted the HostedZoneConfig and Comment elements from the request, the Config and Comment elements don't appear in the response.
    */
  var Config: js.UndefOr[HostedZoneConfig] = js.undefined
  /**
    * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
    */
  var Id: ResourceId
  /**
    * If the hosted zone was created by another service, the service that created the hosted zone. When a hosted zone is created by another service, you can't edit or delete it using Route 53. 
    */
  var LinkedService: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.LinkedService] = js.undefined
  /**
    * The name of the domain. For public hosted zones, this is the name that you have registered with your DNS registrar. For information about how to specify characters other than a-z, 0-9, and - (hyphen) and how to specify internationalized domain names, see CreateHostedZone.
    */
  var Name: DNSName
  /**
    * The number of resource record sets in the hosted zone.
    */
  var ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.undefined
}

object HostedZone {
  @scala.inline
  def apply(
    CallerReference: Nonce,
    Id: ResourceId,
    Name: DNSName,
    Config: HostedZoneConfig = null,
    LinkedService: LinkedService = null,
    ResourceRecordSetCount: js.UndefOr[HostedZoneRRSetCount] = js.undefined
  ): HostedZone = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, Id = Id, Name = Name)
    if (Config != null) __obj.updateDynamic("Config")(Config)
    if (LinkedService != null) __obj.updateDynamic("LinkedService")(LinkedService)
    if (!js.isUndefined(ResourceRecordSetCount)) __obj.updateDynamic("ResourceRecordSetCount")(ResourceRecordSetCount)
    __obj.asInstanceOf[HostedZone]
  }
}

