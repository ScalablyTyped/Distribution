package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnclaimDeviceResponse extends js.Object {
  /**
    * The device's final claim state.
    */
  var State: js.UndefOr[__string] = js.undefined
}

object UnclaimDeviceResponse {
  @scala.inline
  def apply(State: __string = null): UnclaimDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[UnclaimDeviceResponse]
  }
}

