package typings.auth0Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash extends js.Object {
  /**
    * makes parseHash perform or skip `id_token` verification.
    * We **strongly** recommend validating the `id_token` yourself if you disable the verification.
    */
  var _idTokenVerification: js.UndefOr[String] = js.undefined
  /**
    * the url hash.
    * @default window.location.hash
    */
  var hash: String
  /** value originally sent in `nonce` parameter to {@link authorize} to prevent replay attacks */
  var nonce: js.UndefOr[String] = js.undefined
  /** value originally sent in `state` parameter to {@link authorize} to mitigate XSRF */
  var state: js.UndefOr[String] = js.undefined
}

object AnonHash {
  @scala.inline
  def apply(hash: String, _idTokenVerification: String = null, nonce: String = null, state: String = null): AnonHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    if (_idTokenVerification != null) __obj.updateDynamic("_idTokenVerification")(_idTokenVerification.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash]
  }
}

