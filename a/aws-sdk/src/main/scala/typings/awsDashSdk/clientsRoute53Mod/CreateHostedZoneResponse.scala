package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHostedZoneResponse extends js.Object {
  /**
    * A complex type that contains information about the CreateHostedZone request.
    */
  var ChangeInfo: typings.awsDashSdk.clientsRoute53Mod.ChangeInfo = js.native
  /**
    * A complex type that describes the name servers for this hosted zone.
    */
  var DelegationSet: typings.awsDashSdk.clientsRoute53Mod.DelegationSet = js.native
  /**
    * A complex type that contains general information about the hosted zone.
    */
  var HostedZone: typings.awsDashSdk.clientsRoute53Mod.HostedZone = js.native
  /**
    * The unique URL representing the new hosted zone.
    */
  var Location: ResourceURI = js.native
  /**
    * A complex type that contains information about an Amazon VPC that you associated with this hosted zone.
    */
  var VPC: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.VPC] = js.native
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
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any], DelegationSet = DelegationSet.asInstanceOf[js.Any], HostedZone = HostedZone.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    if (VPC != null) __obj.updateDynamic("VPC")(VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostedZoneResponse]
  }
}

