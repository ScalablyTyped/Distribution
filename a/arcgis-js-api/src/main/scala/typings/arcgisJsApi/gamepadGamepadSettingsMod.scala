package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.gamepadGamepadSettings
import typings.arcgisJsApi.esri.gamepadGamepadSettingsConstructor
import typings.arcgisJsApi.esri.gamepadGamepadSettingsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gamepadGamepadSettingsMod extends Shortcut {
  
  @JSImport("esri/views/navigation/gamepad/GamepadSettings", JSImport.Namespace)
  @js.native
  val ^ : gamepadGamepadSettingsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/navigation/gamepad/GamepadSettings", JSImport.Namespace)
  @js.native
  class Class () extends gamepadGamepadSettings {
    def this(properties: gamepadGamepadSettingsProperties) = this()
  }
  
  type _To = gamepadGamepadSettingsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `gamepadGamepadSettingsMod.foo` */
  override def _to: gamepadGamepadSettingsConstructor = ^
}
