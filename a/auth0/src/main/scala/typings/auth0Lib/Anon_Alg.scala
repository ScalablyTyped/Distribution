package typings
package auth0Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alg extends js.Object {
  // The algorithm used to sign the JsonWebToken
  var alg: js.UndefOr[auth0Lib.auth0LibStrings.HS256 | auth0Lib.auth0LibStrings.RS256] = js.undefined
  // The amount of time (in seconds) that the token will be valid after being issued
  var lifetime_in_seconds: js.UndefOr[scala.Double] = js.undefined
  var scopes: js.UndefOr[js.Object] = js.undefined
}

object Anon_Alg {
  @scala.inline
  def apply(
    alg: auth0Lib.auth0LibStrings.HS256 | auth0Lib.auth0LibStrings.RS256 = null,
    lifetime_in_seconds: scala.Int | scala.Double = null,
    scopes: js.Object = null
  ): Anon_Alg = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (lifetime_in_seconds != null) __obj.updateDynamic("lifetime_in_seconds")(lifetime_in_seconds.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[Anon_Alg]
  }
}

