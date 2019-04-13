package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptRequest extends js.Object {
  /**
    * Name-value pair that specifies the encryption context to be used for authenticated encryption. If used here, the same value must be supplied to the Decrypt API or decryption will fail. For more information, see Encryption Context.
    */
  var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  /**
    * A unique identifier for the customer master key (CMK). To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType
  /**
    * Data to be encrypted.
    */
  var Plaintext: PlaintextType
}

object EncryptRequest {
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    Plaintext: PlaintextType,
    EncryptionContext: EncryptionContextType = null,
    GrantTokens: GrantTokenList = null
  ): EncryptRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId, Plaintext = Plaintext.asInstanceOf[js.Any])
    if (EncryptionContext != null) __obj.updateDynamic("EncryptionContext")(EncryptionContext)
    if (GrantTokens != null) __obj.updateDynamic("GrantTokens")(GrantTokens)
    __obj.asInstanceOf[EncryptRequest]
  }
}

