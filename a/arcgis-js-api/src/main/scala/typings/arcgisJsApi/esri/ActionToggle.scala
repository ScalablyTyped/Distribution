package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionToggle
  extends StObject
     with ActionBase {
  
  /**
  		 * Specifies the type of action.
  		 *
  		 * @default "toggle"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html#type)
  		 */
  @JSName("type")
  val type_ActionToggle: toggle = js.native
  
  /**
  		 * Indicates the value of whether the action is toggled on/off.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html#value)
  		 */
  var value: Boolean = js.native
}
