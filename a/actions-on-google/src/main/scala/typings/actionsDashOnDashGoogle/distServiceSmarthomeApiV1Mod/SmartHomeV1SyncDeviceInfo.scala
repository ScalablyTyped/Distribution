package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1SyncDeviceInfo extends js.Object {
  var hwVersion: String
  var manufacturer: String
  var model: String
  var swVersion: String
}

object SmartHomeV1SyncDeviceInfo {
  @scala.inline
  def apply(hwVersion: String, manufacturer: String, model: String, swVersion: String): SmartHomeV1SyncDeviceInfo = {
    val __obj = js.Dynamic.literal(hwVersion = hwVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], swVersion = swVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmartHomeV1SyncDeviceInfo]
  }
}

