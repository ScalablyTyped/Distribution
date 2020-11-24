package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpDataSourceConfig extends js.Object {
  
  /**
    * The authorization config in case the HTTP endpoint requires authorization.
    */
  var authorizationConfig: js.UndefOr[AuthorizationConfig] = js.native
  
  /**
    * The HTTP URL endpoint. You can either specify the domain name or IP, and port combination, and the URL scheme must be HTTP or HTTPS. If the port is not specified, AWS AppSync uses the default port 80 for the HTTP endpoint and port 443 for HTTPS endpoints.
    */
  var endpoint: js.UndefOr[String] = js.native
}
object HttpDataSourceConfig {
  
  @scala.inline
  def apply(): HttpDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpDataSourceConfig]
  }
  
  @scala.inline
  implicit class HttpDataSourceConfigOps[Self <: HttpDataSourceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizationConfig(value: AuthorizationConfig): Self = this.set("authorizationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationConfig: Self = this.set("authorizationConfig", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
  }
}
