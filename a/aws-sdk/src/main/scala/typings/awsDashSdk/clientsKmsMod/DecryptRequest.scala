package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptRequest extends js.Object {
  /**
    * Ciphertext to be decrypted. The blob includes metadata.
    */
  var CiphertextBlob: CiphertextType
  /**
    * The encryption context. If this was specified in the Encrypt function, it must be specified here or the decryption operation will fail. For more information, see Encryption Context.
    */
  var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
}

object DecryptRequest {
  @scala.inline
  def apply(
    CiphertextBlob: CiphertextType,
    EncryptionContext: EncryptionContextType = null,
    GrantTokens: GrantTokenList = null
  ): DecryptRequest = {
    val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
    if (EncryptionContext != null) __obj.updateDynamic("EncryptionContext")(EncryptionContext)
    if (GrantTokens != null) __obj.updateDynamic("GrantTokens")(GrantTokens)
    __obj.asInstanceOf[DecryptRequest]
  }
}

