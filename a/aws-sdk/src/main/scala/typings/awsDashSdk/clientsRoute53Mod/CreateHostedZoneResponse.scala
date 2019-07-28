package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHostedZoneResponse extends js.Object {
  /**
    * A complex type that contains information about the CreateHostedZone request.
    */
  var ChangeInfo: typings.awsDashSdk.clientsRoute53Mod.ChangeInfo
  /**
    * A complex type that describes the name servers for this hosted zone.
    */
  var DelegationSet: typings.awsDashSdk.clientsRoute53Mod.DelegationSet
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZone: typings.awsDashSdk.clientsRoute53Mod.HostedZone
  /**
    * The unique URL representing the new hosted zone.
    */
  var Location: ResourceURI
  /**
    * A complex type that contains information about an Amazon VPC that you associated with this hosted zone.
    */
  var VPC: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.VPC] = js.undefined
}

object CreateHostedZoneResponse {
  @scala.inline
  def apply(
    ChangeInfo: ChangeInfo,
    DelegationSet: DelegationSet,
    HostedZone: HostedZone,
    Location: ResourceURI,
    VPC: VPC = null
  ): CreateHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo, DelegationSet = DelegationSet, HostedZone = HostedZone, Location = Location)
    if (VPC != null) __obj.updateDynamic("VPC")(VPC)
    __obj.asInstanceOf[CreateHostedZoneResponse]
  }
}

