package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProvider extends js.Object {
  var cacheTTLInSeconds: js.UndefOr[scala.Double] = js.undefined
  var enableCache: scala.Boolean
}

object TokenProvider {
  @scala.inline
  def apply(enableCache: scala.Boolean, cacheTTLInSeconds: scala.Int | scala.Double = null): TokenProvider = {
    val __obj = js.Dynamic.literal(enableCache = enableCache)
    if (cacheTTLInSeconds != null) __obj.updateDynamic("cacheTTLInSeconds")(cacheTTLInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProvider]
  }
}

