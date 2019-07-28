package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hsm extends js.Object {
  /**
    * The Availability Zone that contains the HSM.
    */
  var AvailabilityZone: js.UndefOr[ExternalAz] = js.undefined
  /**
    * The identifier (ID) of the cluster that contains the HSM.
    */
  var ClusterId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.ClusterId] = js.undefined
  /**
    * The identifier (ID) of the HSM's elastic network interface (ENI).
    */
  var EniId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.EniId] = js.undefined
  /**
    * The IP address of the HSM's elastic network interface (ENI).
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  /**
    * The HSM's identifier (ID).
    */
  var HsmId: typings.awsDashSdk.clientsCloudhsmv2Mod.HsmId
  /**
    * The HSM's state.
    */
  var State: js.UndefOr[HsmState] = js.undefined
  /**
    * A description of the HSM's state.
    */
  var StateMessage: js.UndefOr[String] = js.undefined
  /**
    * The subnet that contains the HSM's elastic network interface (ENI).
    */
  var SubnetId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.SubnetId] = js.undefined
}

object Hsm {
  @scala.inline
  def apply(
    HsmId: HsmId,
    AvailabilityZone: ExternalAz = null,
    ClusterId: ClusterId = null,
    EniId: EniId = null,
    EniIp: IpAddress = null,
    State: HsmState = null,
    StateMessage: String = null,
    SubnetId: SubnetId = null
  ): Hsm = {
    val __obj = js.Dynamic.literal(HsmId = HsmId)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (EniId != null) __obj.updateDynamic("EniId")(EniId)
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateMessage != null) __obj.updateDynamic("StateMessage")(StateMessage)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[Hsm]
  }
}

