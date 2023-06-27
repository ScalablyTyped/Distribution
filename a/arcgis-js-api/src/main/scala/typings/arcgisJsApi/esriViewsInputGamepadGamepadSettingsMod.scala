package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GamepadSettings
import typings.arcgisJsApi.esri.GamepadSettingsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsInputGamepadGamepadSettingsMod {
  
  @JSImport("esri/views/input/gamepad/GamepadSettings", JSImport.Namespace)
  @js.native
  /**
  		 * Gamepad input specific configuration settings.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadSettings.html)
  		 */
  open class ^ ()
    extends StObject
       with GamepadSettings {
    def this(properties: GamepadSettingsProperties) = this()
  }
}
