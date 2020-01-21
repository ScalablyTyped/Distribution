package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(authorizationConfig: AuthorizationConfig = null, endpoint: String = null): HttpDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    if (authorizationConfig != null) __obj.updateDynamic("authorizationConfig")(authorizationConfig.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDataSourceConfig]
  }
}

