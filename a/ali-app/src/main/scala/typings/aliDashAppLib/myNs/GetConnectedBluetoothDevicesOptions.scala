package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: aliDashAppLib.Anon_Devices with ErrMsgResponse): scala.Unit
}

