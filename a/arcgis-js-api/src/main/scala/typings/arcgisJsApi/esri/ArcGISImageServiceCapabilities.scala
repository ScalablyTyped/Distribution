package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceCapabilities extends StObject {
  
  /**
    * Describes operations supported by the ImageryLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var operations: ArcGISImageServiceCapabilitiesOperations
  
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations supported by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var query: ArcGISImageServiceCapabilitiesQuery
}
object ArcGISImageServiceCapabilities {
  
  inline def apply(operations: ArcGISImageServiceCapabilitiesOperations, query: ArcGISImageServiceCapabilitiesQuery): ArcGISImageServiceCapabilities = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcGISImageServiceCapabilities] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: ArcGISImageServiceCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: ArcGISImageServiceCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
