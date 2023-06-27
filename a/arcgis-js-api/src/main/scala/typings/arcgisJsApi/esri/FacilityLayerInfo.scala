package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacilityLayerInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The field name from the layer that defines the facility unique ID for a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#facilityIdField)
  		 */
  var facilityIdField: String = js.native
  
  /**
  		 * Identifies an operational layer in a map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#layerId)
  		 */
  var layerId: String = js.native
  
  /**
  		 * The field name from the layer that defines the facility name for a feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#nameField)
  		 */
  var nameField: String = js.native
  
  /**
  		 * The field name from the layer that records the unique ID of a feature's associated site and can be used to identify a feature's associated site feature in floor-aware maps.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#siteIdField)
  		 */
  var siteIdField: String = js.native
  
  /**
  		 * This value references the numeric ID of the sublayer if the Facility layer is a map service sublayer instead of a feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FacilityLayerInfo.html#sublayerId)
  		 */
  var sublayerId: Double = js.native
}
