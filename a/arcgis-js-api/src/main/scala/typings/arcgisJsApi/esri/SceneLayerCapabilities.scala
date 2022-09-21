package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerCapabilities
  extends StObject
     with Object {
  
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var data: SceneLayerCapabilitiesData
  
  /**
    * Describes editing capabilities that can be performed on the features in the layer via [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var editing: SceneLayerCapabilitiesEditing
  
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var operations: SceneLayerCapabilitiesOperations
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#capabilities)
    */
  var query: SceneLayerCapabilitiesQuery
}
object SceneLayerCapabilities {
  
  inline def apply(
    constructor: js.Function,
    data: SceneLayerCapabilitiesData,
    editing: SceneLayerCapabilitiesEditing,
    hasOwnProperty: PropertyKey => Boolean,
    operations: SceneLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: SceneLayerCapabilitiesQuery
  ): SceneLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLayerCapabilities]
  }
  
  extension [Self <: SceneLayerCapabilities](x: Self) {
    
    inline def setData(value: SceneLayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditing(value: SceneLayerCapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: SceneLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: SceneLayerCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
