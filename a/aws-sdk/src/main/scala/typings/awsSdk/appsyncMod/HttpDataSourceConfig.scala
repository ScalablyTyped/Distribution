package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpDataSourceConfig extends StObject {
  
  /**
    * The authorization config in case the HTTP endpoint requires authorization.
    */
  var authorizationConfig: js.UndefOr[AuthorizationConfig] = js.undefined
  
  /**
    * The HTTP URL endpoint. You can either specify the domain name or IP, and port combination, and the URL scheme must be HTTP or HTTPS. If the port is not specified, AWS AppSync uses the default port 80 for the HTTP endpoint and port 443 for HTTPS endpoints.
    */
  var endpoint: js.UndefOr[String] = js.undefined
}
object HttpDataSourceConfig {
  
  @scala.inline
  def apply(): HttpDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpDataSourceConfig]
  }
  
  @scala.inline
  implicit class HttpDataSourceConfigMutableBuilder[Self <: HttpDataSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationConfig(value: AuthorizationConfig): Self = StObject.set(x, "authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationConfigUndefined: Self = StObject.set(x, "authorizationConfig", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
