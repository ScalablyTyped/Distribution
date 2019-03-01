package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseHashOptions extends js.Object {
  var _idTokenVerification: js.UndefOr[scala.Boolean] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object ParseHashOptions {
  @scala.inline
  def apply(
    _idTokenVerification: js.UndefOr[scala.Boolean] = js.undefined,
    hash: java.lang.String = null,
    nonce: java.lang.String = null,
    state: java.lang.String = null
  ): ParseHashOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_idTokenVerification)) __obj.updateDynamic("_idTokenVerification")(_idTokenVerification)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ParseHashOptions]
  }
}

