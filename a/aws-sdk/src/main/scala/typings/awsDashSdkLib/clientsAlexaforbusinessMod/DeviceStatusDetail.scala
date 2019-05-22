package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceStatusDetail extends js.Object {
  /**
    * The device status detail code.
    */
  var Code: js.UndefOr[DeviceStatusDetailCode] = js.undefined
  /**
    * The list of available features on the device.
    */
  var Feature: js.UndefOr[Feature] = js.undefined
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

