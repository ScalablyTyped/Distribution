package typings.auth0.mod

import typings.auth0.anon.Description
import typings.auth0.auth0Strings.HS256
import typings.auth0.auth0Strings.RS256
import typings.auth0.auth0Strings.access_token
import typings.auth0.auth0Strings.access_token_authz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceServer extends js.Object {
  /**
    * Allows issuance of refresh tokens for this entity.
    */
  var allow_offline_access: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables the enforcement of the authorization policies.
    */
  var enforce_policies: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the resource server.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the resource server.
    */
  var identifier: js.UndefOr[String] = js.undefined
  /**
    * A friendly name for the resource server.
    */
  var name: js.UndefOr[String] = js.undefined
  var scopes: js.UndefOr[js.Array[Description]] = js.undefined
  /**
    * The algorithm used to sign tokens.
    */
  var signing_alg: js.UndefOr[HS256 | RS256] = js.undefined
  /**
    * The secret used to sign tokens when using symmetric algorithms.
    */
  var signing_secret: js.UndefOr[String] = js.undefined
  /**
    * Flag this entity as capable of skipping consent.
    */
  var skip_consent_for_verifiable_first_party_clients: js.UndefOr[Boolean] = js.undefined
  /**
    * The dialect for the access token.
    */
  var token_dialect: js.UndefOr[access_token | access_token_authz] = js.undefined
  /**
    * The amount of time (in seconds) that the token will be valid after being issued.
    */
  var token_lifetime: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time (in seconds) that the token will be valid after being issued from browser based flows. Value cannot be larger than token_lifetime..
    */
  var token_lifetime_for_web: js.UndefOr[Double] = js.undefined
}

object ResourceServer {
  @scala.inline
  def apply(
    allow_offline_access: js.UndefOr[Boolean] = js.undefined,
    enforce_policies: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    identifier: String = null,
    name: String = null,
    scopes: js.Array[Description] = null,
    signing_alg: HS256 | RS256 = null,
    signing_secret: String = null,
    skip_consent_for_verifiable_first_party_clients: js.UndefOr[Boolean] = js.undefined,
    token_dialect: access_token | access_token_authz = null,
    token_lifetime: js.UndefOr[Double] = js.undefined,
    token_lifetime_for_web: js.UndefOr[Double] = js.undefined
  ): ResourceServer = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_offline_access)) __obj.updateDynamic("allow_offline_access")(allow_offline_access.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enforce_policies)) __obj.updateDynamic("enforce_policies")(enforce_policies.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (signing_alg != null) __obj.updateDynamic("signing_alg")(signing_alg.asInstanceOf[js.Any])
    if (signing_secret != null) __obj.updateDynamic("signing_secret")(signing_secret.asInstanceOf[js.Any])
    if (!js.isUndefined(skip_consent_for_verifiable_first_party_clients)) __obj.updateDynamic("skip_consent_for_verifiable_first_party_clients")(skip_consent_for_verifiable_first_party_clients.get.asInstanceOf[js.Any])
    if (token_dialect != null) __obj.updateDynamic("token_dialect")(token_dialect.asInstanceOf[js.Any])
    if (!js.isUndefined(token_lifetime)) __obj.updateDynamic("token_lifetime")(token_lifetime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token_lifetime_for_web)) __obj.updateDynamic("token_lifetime_for_web")(token_lifetime_for_web.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServer]
  }
}

