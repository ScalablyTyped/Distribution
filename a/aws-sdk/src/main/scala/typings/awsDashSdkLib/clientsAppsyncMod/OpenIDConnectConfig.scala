package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIDConnectConfig extends js.Object {
  /**
    * The number of milliseconds a token is valid after being authenticated.
    */
  var authTTL: js.UndefOr[Long] = js.undefined
  /**
    * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * The number of milliseconds a token is valid after being issued to a user.
    */
  var iatTTL: js.UndefOr[Long] = js.undefined
  /**
    * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of iss in the ID token.
    */
  var issuer: String
}

object OpenIDConnectConfig {
  @scala.inline
  def apply(
    issuer: String,
    authTTL: js.UndefOr[Long] = js.undefined,
    clientId: String = null,
    iatTTL: js.UndefOr[Long] = js.undefined
  ): OpenIDConnectConfig = {
    val __obj = js.Dynamic.literal(issuer = issuer)
    if (!js.isUndefined(authTTL)) __obj.updateDynamic("authTTL")(authTTL)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (!js.isUndefined(iatTTL)) __obj.updateDynamic("iatTTL")(iatTTL)
    __obj.asInstanceOf[OpenIDConnectConfig]
  }
}

