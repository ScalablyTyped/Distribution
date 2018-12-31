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
    * The amount of time (in seconds) that the token will be valid after being issued.
    */
  var token_lifetime: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of time (in seconds) that the token will be valid after being issued from browser based flows. Value cannot be larger than token_lifetime..
    */
  var token_lifetime_for_web: js.UndefOr[scala.Double] = js.undefined
}

