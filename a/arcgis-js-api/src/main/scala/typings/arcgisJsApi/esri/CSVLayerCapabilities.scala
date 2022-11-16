package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVLayerCapabilities extends StObject {
  
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var data: CSVLayerCapabilitiesData
  
  /**
    * Describes editing capabilities that can be performed on the features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var editing: CSVLayerCapabilitiesEditing
  
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var operations: CSVLayerCapabilitiesOperations
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var query: CSVLayerCapabilitiesQuery
  
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var queryRelated: CSVLayerCapabilitiesQueryRelated
}
object CSVLayerCapabilities {
  
  inline def apply(
    data: CSVLayerCapabilitiesData,
    editing: CSVLayerCapabilitiesEditing,
    operations: CSVLayerCapabilitiesOperations,
    query: CSVLayerCapabilitiesQuery,
    queryRelated: CSVLayerCapabilitiesQueryRelated
  ): CSVLayerCapabilities = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVLayerCapabilities]
  }
  
  extension [Self <: CSVLayerCapabilities](x: Self) {
    
    inline def setData(value: CSVLayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditing(value: CSVLayerCapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: CSVLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: CSVLayerCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryRelated(value: CSVLayerCapabilitiesQueryRelated): Self = StObject.set(x, "queryRelated", value.asInstanceOf[js.Any])
  }
}
