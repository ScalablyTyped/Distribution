package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProvider extends js.Object {
  var cacheTTLInSeconds: js.UndefOr[scala.Double] = js.undefined
  var enableCache: js.UndefOr[scala.Boolean] = js.undefined
}

object TokenProvider {
  @scala.inline
  def apply(
    cacheTTLInSeconds: scala.Int | scala.Double = null,
    enableCache: js.UndefOr[scala.Boolean] = js.undefined
  ): TokenProvider = {
    val __obj = js.Dynamic.literal()
    if (cacheTTLInSeconds != null) __obj.updateDynamic("cacheTTLInSeconds")(cacheTTLInSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCache)) __obj.updateDynamic("enableCache")(enableCache)
    __obj.asInstanceOf[TokenProvider]
  }
}

