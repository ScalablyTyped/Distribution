package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import typings.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupInput
  extends StObject
     with Accessor
     with InputBase {
  
  /**
  		 * The field inputs contained within the group.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-GroupInput.html#inputs)
  		 */
  val inputs: js.Array[FieldInput | RelationshipInput] = js.native
  
  /**
  		 * The group's label.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-GroupInput.html#label)
  		 */
  val label: String = js.native
  
  var state: expanded | collapsed = js.native
  
  val `type`: group = js.native
  
  /**
  		 * The group's visibility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-GroupInput.html#visible)
  		 */
  val visible: Boolean = js.native
}
