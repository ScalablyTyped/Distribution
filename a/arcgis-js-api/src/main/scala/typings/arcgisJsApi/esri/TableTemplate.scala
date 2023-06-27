package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableTemplate
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * A collection of [field column templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-FieldColumnTemplate.html) and/or [group column templates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-GroupColumnTemplate.html) that represent an ordered list of column templates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html#columnTemplates)
  		 */
  var columnTemplates: js.Array[FieldColumnTemplate | GroupColumnTemplate] = js.native
}
