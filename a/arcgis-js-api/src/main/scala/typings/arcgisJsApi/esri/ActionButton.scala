package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionButton
  extends StObject
     with ActionBase {
  
  /**
  		 * The URL to an image that will be used to represent the action.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#image)
  		 */
  var image: String = js.native
  
  /**
  		 * Specifies the type of action.
  		 *
  		 * @default "button"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#type)
  		 */
  @JSName("type")
  val type_ActionButton: button = js.native
}
