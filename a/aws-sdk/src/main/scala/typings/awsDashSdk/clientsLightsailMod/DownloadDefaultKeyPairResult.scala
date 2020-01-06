package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadDefaultKeyPairResult extends js.Object {
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.native
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.native
}

object DownloadDefaultKeyPairResult {
  @scala.inline
  def apply(privateKeyBase64: Base64 = null, publicKeyBase64: Base64 = null): DownloadDefaultKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (privateKeyBase64 != null) __obj.updateDynamic("privateKeyBase64")(privateKeyBase64.asInstanceOf[js.Any])
    if (publicKeyBase64 != null) __obj.updateDynamic("publicKeyBase64")(publicKeyBase64.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadDefaultKeyPairResult]
  }
}

