package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSOperationsGetFeature
  extends StObject
     with Object {
  
  /**
    * Value of the output format parameter to send with the GetFeature call.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSOperations)
    */
  var outputFormat: String
  
  /**
    * Indicates if the GetFeature request supports pagination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSOperations)
    */
  var supportsPagination: Boolean
  
  /**
    * The URL to the GetFeature endpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSOperations)
    */
  var url: String
}
object WFSOperationsGetFeature {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    outputFormat: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsPagination: Boolean,
    url: String
  ): WFSOperationsGetFeature = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), outputFormat = outputFormat.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsPagination = supportsPagination.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSOperationsGetFeature]
  }
  
  extension [Self <: WFSOperationsGetFeature](x: Self) {
    
    inline def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
