package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceCapabilities
  extends StObject
     with Object {
  
  /**
    * Describes operations supported by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var operations: ArcGISImageServiceCapabilitiesOperations
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations supported by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var query: ArcGISImageServiceCapabilitiesQuery
}
object ArcGISImageServiceCapabilities {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    operations: ArcGISImageServiceCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: ArcGISImageServiceCapabilitiesQuery
  ): ArcGISImageServiceCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilities]
  }
  
  extension [Self <: ArcGISImageServiceCapabilities](x: Self) {
    
    inline def setOperations(value: ArcGISImageServiceCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ArcGISImageServiceCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
