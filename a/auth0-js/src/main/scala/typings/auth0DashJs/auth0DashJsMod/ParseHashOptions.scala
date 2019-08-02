package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseHashOptions extends js.Object {
  /** indicates that you want to allow IdP-Initiated flows. See {@link https://auth0.com/docs/protocols/saml/idp-initiated-sso#lock-auth0-js} */
  var __enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.undefined
  var _idTokenVerification: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object ParseHashOptions {
  @scala.inline
  def apply(
    __enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.undefined,
    _idTokenVerification: js.UndefOr[Boolean] = js.undefined,
    hash: String = null,
    nonce: String = null,
    state: String = null
  ): ParseHashOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(__enableIdPInitiatedLogin)) __obj.updateDynamic("__enableIdPInitiatedLogin")(__enableIdPInitiatedLogin)
    if (!js.isUndefined(_idTokenVerification)) __obj.updateDynamic("_idTokenVerification")(_idTokenVerification)
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ParseHashOptions]
  }
}

