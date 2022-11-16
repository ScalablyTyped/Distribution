package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerSetProtocolErrorHandlerHandlerFunction extends StObject {
  
  /**
    * The secure resource URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    */
  var resourceUrl: String
  
  /**
    * ServerInfo object describing the server where the secure resource is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    */
  var serverInfo: ServerInfo
}
object IdentityManagerSetProtocolErrorHandlerHandlerFunction {
  
  inline def apply(resourceUrl: String, serverInfo: ServerInfo): IdentityManagerSetProtocolErrorHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal(resourceUrl = resourceUrl.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerSetProtocolErrorHandlerHandlerFunction]
  }
  
  extension [Self <: IdentityManagerSetProtocolErrorHandlerHandlerFunction](x: Self) {
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
  }
}
