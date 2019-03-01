package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInterfaces extends js.Object {
  var AudioPlayer: js.Any
  var Display: js.Any
}

object DeviceInterfaces {
  @scala.inline
  def apply(AudioPlayer: js.Any, Display: js.Any): DeviceInterfaces = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AudioPlayer")(AudioPlayer)
    __obj.updateDynamic("Display")(Display)
    __obj.asInstanceOf[DeviceInterfaces]
  }
}

