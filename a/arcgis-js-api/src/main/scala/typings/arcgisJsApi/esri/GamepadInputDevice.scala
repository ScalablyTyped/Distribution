package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.std.Gamepad
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
  val native: Gamepad = js.native
}

@JSGlobal("__esri.GamepadInputDevice")
@js.native
object GamepadInputDevice extends TopLevel[GamepadInputDeviceConstructor]

