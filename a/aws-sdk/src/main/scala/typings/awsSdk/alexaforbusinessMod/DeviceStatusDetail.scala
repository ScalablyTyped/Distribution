package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStatusDetail extends js.Object {
  /**
    * The device status detail code.
    */
  var Code: js.UndefOr[DeviceStatusDetailCode] = js.native
  /**
    * The list of available features on the device.
    */
  var Feature: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Feature] = js.native
}

object DeviceStatusDetail {
  @scala.inline
  def apply(Code: DeviceStatusDetailCode = null, Feature: Feature = null): DeviceStatusDetail = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Feature != null) __obj.updateDynamic("Feature")(Feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStatusDetail]
  }
}

