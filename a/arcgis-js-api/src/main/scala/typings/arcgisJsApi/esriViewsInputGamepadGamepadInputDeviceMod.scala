package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GamepadInputDevice
import typings.arcgisJsApi.esri.GamepadInputDeviceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsInputGamepadGamepadInputDeviceMod {
  
  @JSImport("esri/views/input/gamepad/GamepadInputDevice", JSImport.Namespace)
  @js.native
  /**
    * Properties and configuration of a gamepad.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadInputDevice.html)
    */
  open class ^ ()
    extends StObject
       with GamepadInputDevice {
    def this(properties: GamepadInputDeviceProperties) = this()
  }
}
