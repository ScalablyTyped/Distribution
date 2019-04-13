package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEncryptionConfigRequest extends js.Object {
  /**
    * An AWS KMS customer master key (CMK) in one of the following formats:    Alias - The name of the key. For example, alias/MyKey.    Key ID - The KMS key ID of the key. For example, ae4aa6d49-a4d8-9df9-a475-4ff6d7898456.    ARN - The full Amazon Resource Name of the key ID or alias. For example, arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456. Use this format to specify a key in a different account.   Omit this key if you set Type to NONE.
    */
  var KeyId: js.UndefOr[EncryptionKeyId] = js.undefined
  /**
    * The type of encryption. Set to KMS to use your own key for encryption. Set to NONE for default encryption.
    */
  var Type: EncryptionType
}

object PutEncryptionConfigRequest {
  @scala.inline
  def apply(Type: EncryptionType, KeyId: EncryptionKeyId = null): PutEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[PutEncryptionConfigRequest]
  }
}

