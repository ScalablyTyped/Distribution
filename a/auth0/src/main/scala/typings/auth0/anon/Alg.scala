package typings.auth0.anon

import typings.auth0.auth0Strings.HS256
import typings.auth0.auth0Strings.RS256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alg extends js.Object {
  // The algorithm used to sign the JsonWebToken
  var alg: js.UndefOr[HS256 | RS256] = js.undefined
  // The amount of time (in seconds) that the token will be valid after being issued
  var lifetime_in_seconds: js.UndefOr[Double] = js.undefined
  var scopes: js.UndefOr[js.Object] = js.undefined
}

object Alg {
  @scala.inline
  def apply(
    alg: HS256 | RS256 = null,
    lifetime_in_seconds: js.UndefOr[Double] = js.undefined,
    scopes: js.Object = null
  ): Alg = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (!js.isUndefined(lifetime_in_seconds)) __obj.updateDynamic("lifetime_in_seconds")(lifetime_in_seconds.get.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
}

