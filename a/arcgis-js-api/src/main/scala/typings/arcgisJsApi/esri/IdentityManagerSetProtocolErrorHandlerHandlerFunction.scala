package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerSetProtocolErrorHandlerHandlerFunction
  extends StObject
     with Object {
  
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resourceUrl: String,
    serverInfo: ServerInfo
  ): IdentityManagerSetProtocolErrorHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resourceUrl = resourceUrl.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerSetProtocolErrorHandlerHandlerFunction]
  }
  
  @scala.inline
  implicit class IdentityManagerSetProtocolErrorHandlerHandlerFunctionMutableBuilder[Self <: IdentityManagerSetProtocolErrorHandlerHandlerFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
  }
}
