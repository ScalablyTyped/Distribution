package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacilityLayerInfoProperties extends StObject {
  
  /**
  		 * The field name from the layer that defines the facility unique ID for a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#facilityIdField)
  		 */
  var facilityIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * Identifies an operational layer in a map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#layerId)
  		 */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field name from the layer that defines the facility name for a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#nameField)
  		 */
  var nameField: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field name from the layer that records the unique ID of a feature's associated site and can be used to identify a feature's associated site feature in floor-aware maps.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#siteIdField)
  		 */
  var siteIdField: js.UndefOr[String] = js.undefined
  
  /**
  		 * This value references the numeric ID of the sublayer if the Facility layer is a map service sublayer instead of a feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#sublayerId)
  		 */
  var sublayerId: js.UndefOr[Double] = js.undefined
}
object FacilityLayerInfoProperties {
  
  inline def apply(): FacilityLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacilityLayerInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FacilityLayerInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setFacilityIdField(value: String): Self = StObject.set(x, "facilityIdField", value.asInstanceOf[js.Any])
    
    inline def setFacilityIdFieldUndefined: Self = StObject.set(x, "facilityIdField", js.undefined)
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
    
    inline def setSiteIdField(value: String): Self = StObject.set(x, "siteIdField", value.asInstanceOf[js.Any])
    
    inline def setSiteIdFieldUndefined: Self = StObject.set(x, "siteIdField", js.undefined)
    
    inline def setSublayerId(value: Double): Self = StObject.set(x, "sublayerId", value.asInstanceOf[js.Any])
    
    inline def setSublayerIdUndefined: Self = StObject.set(x, "sublayerId", js.undefined)
  }
}
