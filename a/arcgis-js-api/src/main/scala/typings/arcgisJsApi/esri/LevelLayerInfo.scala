package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelLayerInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The field name from the layer that defines the unique ID of a feature's associated facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#facilityIdField)
  		 */
  var facilityIdField: String = js.native
  
  /**
  		 * The id for an operational layer in the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#layerId)
  		 */
  var layerId: String = js.native
  
  /**
  		 * The field name from the layer that defines a unique ID for the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#levelIdField)
  		 */
  var levelIdField: String = js.native
  
  /**
  		 * The field name from the layer that defines the level floor number in a particular facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#levelNumberField)
  		 */
  var levelNumberField: String = js.native
  
  /**
  		 * The field name from the layer that defines the level name of a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#longNameField)
  		 */
  var longNameField: String = js.native
  
  /**
  		 * The field name from the layer that defines the level short name of a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#shortNameField)
  		 */
  var shortNameField: String = js.native
  
  /**
  		 * This value references the numeric ID of the sublayer if the Level layer is a map service sublayer instead of a feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#sublayerId)
  		 */
  var sublayerId: Double = js.native
  
  /**
  		 * The field name from the layer that defines the order of display and reference to floors in the [Indoor Positioning System](https://doc.arcgis.com/en/indoors/android/configure-indoor-positioning.htm).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#verticalOrderField)
  		 */
  var verticalOrderField: String = js.native
}
