package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnTemplate
  extends StObject
     with ColumnTemplateBase {
  
  /**
  		 * Indicates whether the field is editable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplate.html#editable)
  		 */
  var editable: Boolean = js.native
  
  /**
  		 * Indicates whether a field requires a value.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplate.html#required)
  		 */
  var required: Boolean = js.native
  
  /**
  		 * The 'type' of column that the template represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplate.html#type)
  		 */
  @JSName("type")
  val type_ColumnTemplate: column = js.native
}
