package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.document
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GamepadSettings
  extends StObject
     with Accessor {
  
  /**
  		 * A readonly collection of all gamepads detected.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadSettings.html#devices)
  		 */
  val devices: Collection[GamepadInputDevice] = js.native
  
  /**
  		 * Determines what focus is required for gamepad events to be dispatched.
  		 *
  		 * @default document
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-input-gamepad-GamepadSettings.html#enabledFocusMode)
  		 */
  var enabledFocusMode: document | view | none_ = js.native
}
