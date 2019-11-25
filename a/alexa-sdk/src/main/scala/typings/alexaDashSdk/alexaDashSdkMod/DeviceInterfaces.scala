package typings.alexaDashSdk.alexaDashSdkMod

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
    val __obj = js.Dynamic.literal(AudioPlayer = AudioPlayer.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeviceInterfaces]
  }
}

