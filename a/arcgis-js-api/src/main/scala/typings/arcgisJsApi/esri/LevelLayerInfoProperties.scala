package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelLayerInfoProperties extends StObject {
  
  /**
  		 * The field name from the layer that defines the unique ID of a feature's associated facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#facilityIdField)
  		 */
  var facilityIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The id for an operational layer in the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#layerId)
  		 */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field name from the layer that defines a unique ID for the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#levelIdField)
  		 */
  var levelIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field name from the layer that defines the level floor number in a particular facility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#levelNumberField)
  		 */
  var levelNumberField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field name from the layer that defines the level name of a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#longNameField)
  		 */
  var longNameField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field name from the layer that defines the level short name of a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#shortNameField)
  		 */
  var shortNameField: js.UndefOr[String] = js.undefined
  
  /**
  		 * This value references the numeric ID of the sublayer if the Level layer is a map service sublayer instead of a feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#sublayerId)
  		 */
  var sublayerId: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The field name from the layer that defines the order of display and reference to floors in the [Indoor Positioning System](https://doc.arcgis.com/en/indoors/android/configure-indoor-positioning.htm).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LevelLayerInfo.html#verticalOrderField)
  		 */
  var verticalOrderField: js.UndefOr[String] = js.undefined
}
object LevelLayerInfoProperties {
  
  inline def apply(): LevelLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelLayerInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LevelLayerInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setFacilityIdField(value: String): Self = StObject.set(x, "facilityIdField", value.asInstanceOf[js.Any])
    
    inline def setFacilityIdFieldUndefined: Self = StObject.set(x, "facilityIdField", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLevelIdField(value: String): Self = StObject.set(x, "levelIdField", value.asInstanceOf[js.Any])
    
    inline def setLevelIdFieldUndefined: Self = StObject.set(x, "levelIdField", js.undefined)
    
    inline def setLevelNumberField(value: String): Self = StObject.set(x, "levelNumberField", value.asInstanceOf[js.Any])
    
    inline def setLevelNumberFieldUndefined: Self = StObject.set(x, "levelNumberField", js.undefined)
    
    inline def setLongNameField(value: String): Self = StObject.set(x, "longNameField", value.asInstanceOf[js.Any])
    
    inline def setLongNameFieldUndefined: Self = StObject.set(x, "longNameField", js.undefined)
    
    inline def setShortNameField(value: String): Self = StObject.set(x, "shortNameField", value.asInstanceOf[js.Any])
    
    inline def setShortNameFieldUndefined: Self = StObject.set(x, "shortNameField", js.undefined)
    
    inline def setSublayerId(value: Double): Self = StObject.set(x, "sublayerId", value.asInstanceOf[js.Any])
    
    inline def setSublayerIdUndefined: Self = StObject.set(x, "sublayerId", js.undefined)
    
    inline def setVerticalOrderField(value: String): Self = StObject.set(x, "verticalOrderField", value.asInstanceOf[js.Any])
    
    inline def setVerticalOrderFieldUndefined: Self = StObject.set(x, "verticalOrderField", js.undefined)
  }
}
