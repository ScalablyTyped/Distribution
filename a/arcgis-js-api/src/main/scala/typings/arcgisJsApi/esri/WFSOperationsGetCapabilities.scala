package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSOperationsGetCapabilities extends StObject {
  
  /**
    * The URL to the GetCapabilities endpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSOperations)
    */
  var url: String
}
object WFSOperationsGetCapabilities {
  
  inline def apply(url: String): WFSOperationsGetCapabilities = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSOperationsGetCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WFSOperationsGetCapabilities] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
