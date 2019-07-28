package typings.auth0DashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
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

object Anon_Hash {
  @scala.inline
  def apply(hash: String, _idTokenVerification: String = null, nonce: String = null, state: String = null): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash)
    if (_idTokenVerification != null) __obj.updateDynamic("_idTokenVerification")(_idTokenVerification)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Hash]
  }
}

