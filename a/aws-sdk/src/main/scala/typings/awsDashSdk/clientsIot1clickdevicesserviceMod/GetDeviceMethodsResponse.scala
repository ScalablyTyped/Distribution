package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeviceMethodsResponse extends js.Object {
  /**
    * List of available device APIs.
    */
  var DeviceMethods: js.UndefOr[__listOfDeviceMethod] = js.native
}

object GetDeviceMethodsResponse {
  @scala.inline
  def apply(DeviceMethods: __listOfDeviceMethod = null): GetDeviceMethodsResponse = {
    val __obj = js.Dynamic.literal()
    if (DeviceMethods != null) __obj.updateDynamic("DeviceMethods")(DeviceMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceMethodsResponse]
  }
}

