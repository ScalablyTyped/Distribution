package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProvider extends js.Object {
  var cacheTTLInSeconds: js.UndefOr[Double] = js.undefined
  var enableCache: Boolean
}

object TokenProvider {
  @scala.inline
  def apply(enableCache: Boolean, cacheTTLInSeconds: js.UndefOr[Double] = js.undefined): TokenProvider = {
    val __obj = js.Dynamic.literal(enableCache = enableCache.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheTTLInSeconds)) __obj.updateDynamic("cacheTTLInSeconds")(cacheTTLInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProvider]
  }
}

