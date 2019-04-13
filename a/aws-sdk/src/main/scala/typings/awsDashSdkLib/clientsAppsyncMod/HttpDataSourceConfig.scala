package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpDataSourceConfig extends js.Object {
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
  def apply(authorizationConfig: AuthorizationConfig = null, endpoint: String = null): HttpDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    if (authorizationConfig != null) __obj.updateDynamic("authorizationConfig")(authorizationConfig)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    __obj.asInstanceOf[HttpDataSourceConfig]
  }
}

