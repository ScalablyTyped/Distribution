package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProvider extends js.Object {
  var cacheTTLInSeconds: js.UndefOr[Double] = js.undefined
  var enableCache: js.UndefOr[Boolean] = js.undefined
}

object TokenProvider {
  @scala.inline
  def apply(cacheTTLInSeconds: Int | Double = null, enableCache: js.UndefOr[Boolean] = js.undefined): TokenProvider = {
    val __obj = js.Dynamic.literal()
    if (cacheTTLInSeconds != null) __obj.updateDynamic("cacheTTLInSeconds")(cacheTTLInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCache)) __obj.updateDynamic("enableCache")(enableCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenProvider]
  }
}

