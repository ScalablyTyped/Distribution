package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FinalizeDeviceClaimResponse extends js.Object {
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[__string] = js.undefined
}

object FinalizeDeviceClaimResponse {
  @scala.inline
  def apply(State: __string = null): FinalizeDeviceClaimResponse = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[FinalizeDeviceClaimResponse]
  }
}

