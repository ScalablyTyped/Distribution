package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSOperationsGetFeature extends StObject {
  
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
  
  inline def apply(outputFormat: String, supportsPagination: Boolean, url: String): WFSOperationsGetFeature = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSOperationsGetFeature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WFSOperationsGetFeature] (val x: Self) extends AnyVal {
    
    inline def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
