package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSLayerCapabilities extends StObject {
  
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var data: WFSLayerCapabilitiesData
  
  /**
    * Describes editing capabilities that can be performed on the features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var editing: WFSLayerCapabilitiesEditing
  
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var operations: WFSLayerCapabilitiesOperations
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var query: WFSLayerCapabilitiesQuery
  
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html#capabilities)
    */
  var queryRelated: WFSLayerCapabilitiesQueryRelated
}
object WFSLayerCapabilities {
  
  inline def apply(
    data: WFSLayerCapabilitiesData,
    editing: WFSLayerCapabilitiesEditing,
    operations: WFSLayerCapabilitiesOperations,
    query: WFSLayerCapabilitiesQuery,
    queryRelated: WFSLayerCapabilitiesQueryRelated
  ): WFSLayerCapabilities = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSLayerCapabilities]
  }
  
  extension [Self <: WFSLayerCapabilities](x: Self) {
    
    inline def setData(value: WFSLayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditing(value: WFSLayerCapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: WFSLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: WFSLayerCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryRelated(value: WFSLayerCapabilitiesQueryRelated): Self = StObject.set(x, "queryRelated", value.asInstanceOf[js.Any])
  }
}
