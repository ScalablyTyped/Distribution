package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyPairResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the new key pair you just created.
    */
  var keyPair: js.UndefOr[KeyPair] = js.undefined
  /**
    * An array of key-value pairs containing information about the results of your create key pair request.
    */
  var operation: js.UndefOr[Operation] = js.undefined
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.undefined
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.undefined
}

object CreateKeyPairResult {
  @scala.inline
  def apply(
    keyPair: KeyPair = null,
    operation: Operation = null,
    privateKeyBase64: Base64 = null,
    publicKeyBase64: Base64 = null
  ): CreateKeyPairResult = {
    val __obj = js.Dynamic.literal()
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (privateKeyBase64 != null) __obj.updateDynamic("privateKeyBase64")(privateKeyBase64)
    if (publicKeyBase64 != null) __obj.updateDynamic("publicKeyBase64")(publicKeyBase64)
    __obj.asInstanceOf[CreateKeyPairResult]
  }
}

