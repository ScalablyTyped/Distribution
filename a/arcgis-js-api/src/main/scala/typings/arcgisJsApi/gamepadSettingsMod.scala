package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GamepadSettings
import typings.arcgisJsApi.esri.GamepadSettingsConstructor
import typings.arcgisJsApi.esri.GamepadSettingsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadSettingsMod extends Shortcut {
  
  @JSImport("esri/views/input/gamepad/GamepadSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GamepadSettingsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/input/gamepad/GamepadSettings", JSImport.Namespace)
  @js.native
  /**
    * Gamepad input specific configuration settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadSettings.html)
    */
  open class Class ()
    extends StObject
       with GamepadSettings {
    def this(properties: GamepadSettingsProperties) = this()
  }
  
  type _To = js.Object & GamepadSettingsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `gamepadSettingsMod.foo` */
  override def _to: js.Object & GamepadSettingsConstructor = ^
}
