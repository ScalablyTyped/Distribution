package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServer extends js.Object {
  /**
    * Allows issuance of refresh tokens for this entity.
    */
  var allow_offline_access: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables the enforcement of the authorization policies.
    */
  var enforce_policies: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the resource server.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The identifier of the resource server.
    */
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A friendly name for the resource server.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var scopes: js.UndefOr[js.Array[auth0Lib.Anon_Description]] = js.undefined
  /**
    * The algorithm used to sign tokens.
    */
  var signing_alg: js.UndefOr[auth0Lib.auth0LibStrings.HS256 | auth0Lib.auth0LibStrings.RS256] = js.undefined
  /**
    * The secret used to sign tokens when using symmetric algorithms.
    */
  var signing_secret: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Flag this entity as capable of skipping consent.
    */
  var skip_consent_for_verifiable_first_party_clients: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The dialect for the access token.
    */
  var token_dialect: js.UndefOr[
    auth0Lib.auth0LibStrings.access_token | auth0Lib.auth0LibStrings.access_token_authz
  ] = js.undefined
  /**
    * The amount of time (in seconds) that the token will be valid after being issued.
    */
  var token_lifetime: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of time (in seconds) that the token will be valid after being issued from browser based flows. Value cannot be larger than token_lifetime..
    */
  var token_lifetime_for_web: js.UndefOr[scala.Double] = js.undefined
}

object ResourceServer {
  @scala.inline
  def apply(
    allow_offline_access: js.UndefOr[scala.Boolean] = js.undefined,
    enforce_policies: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    identifier: java.lang.String = null,
    name: java.lang.String = null,
    scopes: js.Array[auth0Lib.Anon_Description] = null,
    signing_alg: auth0Lib.auth0LibStrings.HS256 | auth0Lib.auth0LibStrings.RS256 = null,
    signing_secret: java.lang.String = null,
    skip_consent_for_verifiable_first_party_clients: js.UndefOr[scala.Boolean] = js.undefined,
    token_dialect: auth0Lib.auth0LibStrings.access_token | auth0Lib.auth0LibStrings.access_token_authz = null,
    token_lifetime: scala.Int | scala.Double = null,
    token_lifetime_for_web: scala.Int | scala.Double = null
  ): ResourceServer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_offline_access)) __obj.updateDynamic("allow_offline_access")(allow_offline_access)
    if (!js.isUndefined(enforce_policies)) __obj.updateDynamic("enforce_policies")(enforce_policies)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (name != null) __obj.updateDynamic("name")(name)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    if (signing_alg != null) __obj.updateDynamic("signing_alg")(signing_alg.asInstanceOf[js.Any])
    if (signing_secret != null) __obj.updateDynamic("signing_secret")(signing_secret)
    if (!js.isUndefined(skip_consent_for_verifiable_first_party_clients)) __obj.updateDynamic("skip_consent_for_verifiable_first_party_clients")(skip_consent_for_verifiable_first_party_clients)
    if (token_dialect != null) __obj.updateDynamic("token_dialect")(token_dialect.asInstanceOf[js.Any])
    if (token_lifetime != null) __obj.updateDynamic("token_lifetime")(token_lifetime.asInstanceOf[js.Any])
    if (token_lifetime_for_web != null) __obj.updateDynamic("token_lifetime_for_web")(token_lifetime_for_web.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServer]
  }
}

