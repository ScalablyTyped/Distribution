package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerCapabilities
  extends StObject
     with Object {
  
  /**
    * Describes what attachment capabilities are enabled on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var attachment: SubtypeGroupLayerCapabilitiesAttachment
  
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var data: SubtypeGroupLayerCapabilitiesData
  
  /**
    * Describes editing capabilities that can be performed on the features in the layer via [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var editing: SubtypeGroupLayerCapabilitiesEditing
  
  /**
    * Describes the metadata contained on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var metadata: SubtypeGroupLayerCapabilitiesMetadata
  
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var operations: SubtypeGroupLayerCapabilitiesOperations
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var query: SubtypeGroupLayerCapabilitiesQuery
  
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var queryRelated: SubtypeGroupLayerCapabilitiesQueryRelated
}
object SubtypeGroupLayerCapabilities {
  
  inline def apply(
    attachment: SubtypeGroupLayerCapabilitiesAttachment,
    constructor: js.Function,
    data: SubtypeGroupLayerCapabilitiesData,
    editing: SubtypeGroupLayerCapabilitiesEditing,
    hasOwnProperty: PropertyKey => Boolean,
    metadata: SubtypeGroupLayerCapabilitiesMetadata,
    operations: SubtypeGroupLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: SubtypeGroupLayerCapabilitiesQuery,
    queryRelated: SubtypeGroupLayerCapabilitiesQueryRelated
  ): SubtypeGroupLayerCapabilities = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerCapabilities]
  }
  
  extension [Self <: SubtypeGroupLayerCapabilities](x: Self) {
    
    inline def setAttachment(value: SubtypeGroupLayerCapabilitiesAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setData(value: SubtypeGroupLayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditing(value: SubtypeGroupLayerCapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: SubtypeGroupLayerCapabilitiesMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: SubtypeGroupLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: SubtypeGroupLayerCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryRelated(value: SubtypeGroupLayerCapabilitiesQueryRelated): Self = StObject.set(x, "queryRelated", value.asInstanceOf[js.Any])
  }
}
