package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerSetRedirectionHandlerHandlerFunction
  extends StObject
     with Object {
  
  /**
    * The URL of the secure resource that triggers the redirection to the ArcGIS.com sign-in page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var resourceUrl: String
  
  /**
    * The application URL where the sign-in page redirects after a successful login.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var returnUrlParamName: String
  
  /**
    * The ServerInfo object describing the server where the secure resource is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var serverInfo: ServerInfo
  
  /**
    * URL of the sign-in page where users will be redirected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var signInPage: String
}
object IdentityManagerSetRedirectionHandlerHandlerFunction {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    resourceUrl: String,
    returnUrlParamName: String,
    serverInfo: ServerInfo,
    signInPage: String
  ): IdentityManagerSetRedirectionHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resourceUrl = resourceUrl.asInstanceOf[js.Any], returnUrlParamName = returnUrlParamName.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any], signInPage = signInPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerSetRedirectionHandlerHandlerFunction]
  }
  
  extension [Self <: IdentityManagerSetRedirectionHandlerHandlerFunction](x: Self) {
    
    inline def setResourceUrl(value: String): Self = StObject.set(x, "resourceUrl", value.asInstanceOf[js.Any])
    
    inline def setReturnUrlParamName(value: String): Self = StObject.set(x, "returnUrlParamName", value.asInstanceOf[js.Any])
    
    inline def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
    
    inline def setSignInPage(value: String): Self = StObject.set(x, "signInPage", value.asInstanceOf[js.Any])
  }
}
