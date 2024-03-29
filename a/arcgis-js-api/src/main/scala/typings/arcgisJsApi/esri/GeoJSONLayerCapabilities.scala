package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerCapabilities extends StObject {
  
  /**
  		 * Describes characteristics of the data in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
  		 */
  var data: GeoJSONLayerCapabilitiesData
  
  /**
  		 * Describes editing capabilities that can be performed on the features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
  		 */
  var editing: GeoJSONLayerCapabilitiesEditing
  
  /**
  		 * Describes operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
  		 */
  var operations: GeoJSONLayerCapabilitiesOperations
  
  /**
  		 * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
  		 */
  var query: GeoJSONLayerCapabilitiesQuery
  
  /**
  		 * Indicates if the layer's query operation supports querying features or records related to features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
  		 */
  var queryRelated: GeoJSONLayerCapabilitiesQueryRelated
}
object GeoJSONLayerCapabilities {
  
  inline def apply(
    data: GeoJSONLayerCapabilitiesData,
    editing: GeoJSONLayerCapabilitiesEditing,
    operations: GeoJSONLayerCapabilitiesOperations,
    query: GeoJSONLayerCapabilitiesQuery,
    queryRelated: GeoJSONLayerCapabilitiesQueryRelated
  ): GeoJSONLayerCapabilities = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeoJSONLayerCapabilities] (val x: Self) extends AnyVal {
    
    inline def setData(value: GeoJSONLayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditing(value: GeoJSONLayerCapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: GeoJSONLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: GeoJSONLayerCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryRelated(value: GeoJSONLayerCapabilitiesQueryRelated): Self = StObject.set(x, "queryRelated", value.asInstanceOf[js.Any])
  }
}
