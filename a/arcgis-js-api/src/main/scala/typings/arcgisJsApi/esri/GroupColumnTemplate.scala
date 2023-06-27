package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupColumnTemplate
  extends StObject
     with ColumnTemplateBase {
  
  /**
  		 * A collection of [field column templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html) and/or [group column templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-GroupColumnTemplate.html) that represent an ordered list of column templates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-GroupColumnTemplate.html#columnTemplates)
  		 */
  var columnTemplates: js.Array[FieldColumnTemplate | GroupColumnTemplate] = js.native
  
  /**
  		 * The 'type' of column that the template represents.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-GroupColumnTemplate.html#type)
  		 */
  @JSName("type")
  val type_GroupColumnTemplate: group = js.native
}
