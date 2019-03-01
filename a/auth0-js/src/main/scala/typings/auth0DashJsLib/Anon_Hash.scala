package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  /**
    * makes parseHash perform or skip `id_token` verification.
    * We **strongly** recommend validating the `id_token` yourself if you disable the verification.
    */
  var _idTokenVerification: js.UndefOr[java.lang.String] = js.undefined
  /**
    * the url hash.
    * @default window.location.hash
    */
  var hash: java.lang.String
  /** value originally sent in `nonce` parameter to {@link authorize} to prevent replay attacks */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /** value originally sent in `state` parameter to {@link authorize} to mitigate XSRF */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Hash {
  @scala.inline
  def apply(
    hash: java.lang.String,
    _idTokenVerification: java.lang.String = null,
    nonce: java.lang.String = null,
    state: java.lang.String = null
  ): Anon_Hash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    if (_idTokenVerification != null) __obj.updateDynamic("_idTokenVerification")(_idTokenVerification)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Hash]
  }
}

