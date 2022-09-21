package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInfoProperties extends StObject {
  
  /**
    * The token service URL used to generate tokens for ArcGIS Server Admin resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#adminTokenServiceUrl)
    */
  var adminTokenServiceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Version of the ArcGIS Server or Portal deployed on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#currentVersion)
    */
  var currentVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasPortal)
    */
  var hasPortal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is an [ArcGIS Server](https://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasServer)
    */
  var hasServer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server)
    */
  var server: js.UndefOr[String] = js.undefined
  
  /**
    * Validity of short-lived token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#shortLivedTokenValidity)
    */
  var shortLivedTokenValidity: js.UndefOr[Double] = js.undefined
  
  /**
    * The token service URL used to generate tokens for the secured resources on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#tokenServiceUrl)
    */
  var tokenServiceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the server is configured to work with web tier authentication.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#webTierAuth)
    */
  var webTierAuth: js.UndefOr[Boolean] = js.undefined
}
object ServerInfoProperties {
  
  inline def apply(): ServerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerInfoProperties]
  }
  
  extension [Self <: ServerInfoProperties](x: Self) {
    
    inline def setAdminTokenServiceUrl(value: String): Self = StObject.set(x, "adminTokenServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setAdminTokenServiceUrlUndefined: Self = StObject.set(x, "adminTokenServiceUrl", js.undefined)
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setHasPortal(value: Boolean): Self = StObject.set(x, "hasPortal", value.asInstanceOf[js.Any])
    
    inline def setHasPortalUndefined: Self = StObject.set(x, "hasPortal", js.undefined)
    
    inline def setHasServer(value: Boolean): Self = StObject.set(x, "hasServer", value.asInstanceOf[js.Any])
    
    inline def setHasServerUndefined: Self = StObject.set(x, "hasServer", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setShortLivedTokenValidity(value: Double): Self = StObject.set(x, "shortLivedTokenValidity", value.asInstanceOf[js.Any])
    
    inline def setShortLivedTokenValidityUndefined: Self = StObject.set(x, "shortLivedTokenValidity", js.undefined)
    
    inline def setTokenServiceUrl(value: String): Self = StObject.set(x, "tokenServiceUrl", value.asInstanceOf[js.Any])
    
    inline def setTokenServiceUrlUndefined: Self = StObject.set(x, "tokenServiceUrl", js.undefined)
    
    inline def setWebTierAuth(value: Boolean): Self = StObject.set(x, "webTierAuth", value.asInstanceOf[js.Any])
    
    inline def setWebTierAuthUndefined: Self = StObject.set(x, "webTierAuth", js.undefined)
  }
}
