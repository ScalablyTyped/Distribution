package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamepadInputDevice extends Accessor {
  /**
    * The native Gamepad object exposed by the browser.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadInputDevice.html#native)
    */
  val native: stdLib.Gamepad = js.native
}

@JSGlobal("__esri.GamepadInputDevice")
@js.native
/**
  * Properties and configuration of a gamepad.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadInputDevice.html)
  */
class GamepadInputDeviceCls () extends GamepadInputDevice {
  def this(properties: GamepadInputDeviceProperties) = this()
}

