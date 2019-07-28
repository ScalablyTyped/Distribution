package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneResponse extends js.Object {
  /**
    * A complex type that lists the Amazon Route 53 name servers for the specified hosted zone.
    */
  var DelegationSet: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.DelegationSet] = js.undefined
  /**
    * A complex type that contains general information about the specified hosted zone.
    */
  var HostedZone: typings.awsDashSdk.clientsRoute53Mod.HostedZone
  /**
    * A complex type that contains information about the VPCs that are associated with the specified hosted zone.
    */
  var VPCs: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.VPCs] = js.undefined
}

object GetHostedZoneResponse {
  @scala.inline
  def apply(HostedZone: HostedZone, DelegationSet: DelegationSet = null, VPCs: VPCs = null): GetHostedZoneResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone)
    if (DelegationSet != null) __obj.updateDynamic("DelegationSet")(DelegationSet)
    if (VPCs != null) __obj.updateDynamic("VPCs")(VPCs)
    __obj.asInstanceOf[GetHostedZoneResponse]
  }
}

