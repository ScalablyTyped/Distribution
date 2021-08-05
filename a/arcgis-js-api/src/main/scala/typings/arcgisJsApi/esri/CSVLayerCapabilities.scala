package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVLayerCapabilities
  extends StObject
     with Object {
  
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
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
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
    constructor: js.Function,
    data: CSVLayerCapabilitiesData,
    editing: CSVLayerCapabilitiesEditing,
    hasOwnProperty: PropertyKey => Boolean,
    operations: CSVLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: CSVLayerCapabilitiesQuery,
    queryRelated: CSVLayerCapabilitiesQueryRelated
  ): CSVLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
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
