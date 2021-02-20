package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerInfoProperties extends StObject {
  
  /**
    * The token service URL used to generate tokens for ArcGIS Server Admin resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#adminTokenServiceUrl)
    */
  var adminTokenServiceUrl: js.UndefOr[String] = js.native
  
  /**
    * Version of the ArcGIS Server deployed on this server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#currentVersion)
    */
  var currentVersion: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is a [Portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasPortal)
    */
  var hasPortal: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the [server](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server) is an [ArcGIS Server](https://enterprise.arcgis.com/en/server/latest/get-started/windows/what-is-arcgis-for-server-.htm) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#hasServer)
    */
  var hasServer: js.UndefOr[Boolean] = js.native
  
  /**
    * The server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#server)
    */
  var server: js.UndefOr[String] = js.native
  
  /**
    * Validity of short-lived token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#shortLivedTokenValidity)
    */
  var shortLivedTokenValidity: js.UndefOr[Double] = js.native
  
  /**
    * The token service URL used to generate tokens for the secured resources on the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html#tokenServiceUrl)
    */
  var tokenServiceUrl: js.UndefOr[String] = js.native
}
object ServerInfoProperties {
  
  @scala.inline
  def apply(): ServerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerInfoProperties]
  }
  
  @scala.inline
  implicit class ServerInfoPropertiesMutableBuilder[Self <: ServerInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminTokenServiceUrl(value: String): Self = StObject.set(x, "adminTokenServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminTokenServiceUrlUndefined: Self = StObject.set(x, "adminTokenServiceUrl", js.undefined)
    
    @scala.inline
    def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    @scala.inline
    def setHasPortal(value: Boolean): Self = StObject.set(x, "hasPortal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPortalUndefined: Self = StObject.set(x, "hasPortal", js.undefined)
    
    @scala.inline
    def setHasServer(value: Boolean): Self = StObject.set(x, "hasServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasServerUndefined: Self = StObject.set(x, "hasServer", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    @scala.inline
    def setShortLivedTokenValidity(value: Double): Self = StObject.set(x, "shortLivedTokenValidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortLivedTokenValidityUndefined: Self = StObject.set(x, "shortLivedTokenValidity", js.undefined)
    
    @scala.inline
    def setTokenServiceUrl(value: String): Self = StObject.set(x, "tokenServiceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenServiceUrlUndefined: Self = StObject.set(x, "tokenServiceUrl", js.undefined)
  }
}
