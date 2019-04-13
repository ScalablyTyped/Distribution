package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDeviceResponse extends js.Object {
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: js.UndefOr[DeviceId] = js.undefined
}

object RegisterDeviceResponse {
  @scala.inline
  def apply(DeviceId: DeviceId = null): RegisterDeviceResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceId != null) __obj.updateDynamic("DeviceId")(DeviceId)
    __obj.asInstanceOf[RegisterDeviceResponse]
  }
}

