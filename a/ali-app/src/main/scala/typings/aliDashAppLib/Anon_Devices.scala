package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Devices extends js.Object {
  var devices: js.Array[aliDashAppLib.myNs.BluetoothDevice]
}

object Anon_Devices {
  @scala.inline
  def apply(devices: js.Array[aliDashAppLib.myNs.BluetoothDevice]): Anon_Devices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("devices")(devices)
    __obj.asInstanceOf[Anon_Devices]
  }
}

