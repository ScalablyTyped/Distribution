package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHsmRequest extends js.Object {
  /**
    * The identifier (ID) of the cluster that contains the HSM that you are deleting.
    */
  var ClusterId: typings.awsDashSdk.clientsCloudhsmv2Mod.ClusterId
  /**
    * The identifier (ID) of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.EniId] = js.undefined
  /**
    * The IP address of the elastic network interface (ENI) of the HSM that you are deleting.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  /**
    * The identifier (ID) of the HSM that you are deleting.
    */
  var HsmId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.HsmId] = js.undefined
}

object DeleteHsmRequest {
  @scala.inline
  def apply(ClusterId: ClusterId, EniId: EniId = null, EniIp: IpAddress = null, HsmId: HsmId = null): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (EniId != null) __obj.updateDynamic("EniId")(EniId)
    if (EniIp != null) __obj.updateDynamic("EniIp")(EniIp)
    if (HsmId != null) __obj.updateDynamic("HsmId")(HsmId)
    __obj.asInstanceOf[DeleteHsmRequest]
  }
}

