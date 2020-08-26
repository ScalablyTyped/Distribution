package typings.auth0Js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  /**
    * makes parseHash perform or skip `id_token` verification.
    * We **strongly** recommend validating the `id_token` yourself if you disable the verification.
    */
  var _idTokenVerification: js.UndefOr[String] = js.native
  /**
    * the url hash.
    * @default window.location.hash
    */
  var hash: String = js.native
  /** value originally sent in `nonce` parameter to {@link authorize} to prevent replay attacks */
  var nonce: js.UndefOr[String] = js.native
  /** value originally sent in `state` parameter to {@link authorize} to mitigate XSRF */
  var state: js.UndefOr[String] = js.native
}

object Hash {
  @scala.inline
  def apply(hash: String): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  @scala.inline
  implicit class HashOps[Self <: Hash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def set_idTokenVerification(value: String): Self = this.set("_idTokenVerification", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_idTokenVerification: Self = this.set("_idTokenVerification", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

