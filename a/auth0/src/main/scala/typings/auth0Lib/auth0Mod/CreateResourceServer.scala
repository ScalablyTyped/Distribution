package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceServer extends ResourceServer {
  /**
    * The identifier of the client.
    */
  @JSName("identifier")
  var identifier_CreateResourceServer: java.lang.String
}

object CreateResourceServer {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    allow_offline_access: js.UndefOr[scala.Boolean] = js.undefined,
    enforce_policies: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    name: java.lang.String = null,
    scopes: js.Array[auth0Lib.Anon_Description] = null,
    signing_alg: auth0Lib.auth0LibStrings.HS256 | auth0Lib.auth0LibStrings.RS256 = null,
    signing_secret: java.lang.String = null,
    skip_consent_for_verifiable_first_party_clients: js.UndefOr[scala.Boolean] = js.undefined,
    token_dialect: auth0Lib.auth0LibStrings.access_token | auth0Lib.auth0LibStrings.access_token_authz = null,
    token_lifetime: scala.Int | scala.Double = null,
    token_lifetime_for_web: scala.Int | scala.Double = null
  ): CreateResourceServer = {
    val __obj = js.Dynamic.literal(identifier = identifier)
    if (!js.isUndefined(allow_offline_access)) __obj.updateDynamic("allow_offline_access")(allow_offline_access)
    if (!js.isUndefined(enforce_policies)) __obj.updateDynamic("enforce_policies")(enforce_policies)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (signing_alg != null) __obj.updateDynamic("signing_alg")(signing_alg.asInstanceOf[js.Any])
    if (signing_secret != null) __obj.updateDynamic("signing_secret")(signing_secret)
    if (!js.isUndefined(skip_consent_for_verifiable_first_party_clients)) __obj.updateDynamic("skip_consent_for_verifiable_first_party_clients")(skip_consent_for_verifiable_first_party_clients)
    if (token_dialect != null) __obj.updateDynamic("token_dialect")(token_dialect.asInstanceOf[js.Any])
    if (token_lifetime != null) __obj.updateDynamic("token_lifetime")(token_lifetime.asInstanceOf[js.Any])
    if (token_lifetime_for_web != null) __obj.updateDynamic("token_lifetime_for_web")(token_lifetime_for_web.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceServer]
  }
}

