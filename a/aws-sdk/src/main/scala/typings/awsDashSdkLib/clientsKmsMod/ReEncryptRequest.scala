package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReEncryptRequest extends js.Object {
  /**
    * Ciphertext of the data to reencrypt.
    */
  var CiphertextBlob: CiphertextType
  /**
    * Encryption context to use when the data is reencrypted.
    */
  var DestinationEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  /**
    * A unique identifier for the CMK that is used to reencrypt the data. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var DestinationKeyId: KeyIdType
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  /**
    * Encryption context used to encrypt and decrypt the data specified in the CiphertextBlob parameter.
    */
  var SourceEncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
}

object ReEncryptRequest {
  @scala.inline
  def apply(
    CiphertextBlob: CiphertextType,
    DestinationKeyId: KeyIdType,
    DestinationEncryptionContext: EncryptionContextType = null,
    GrantTokens: GrantTokenList = null,
    SourceEncryptionContext: EncryptionContextType = null
  ): ReEncryptRequest = {
    val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId)
    if (DestinationEncryptionContext != null) __obj.updateDynamic("DestinationEncryptionContext")(DestinationEncryptionContext)
    if (GrantTokens != null) __obj.updateDynamic("GrantTokens")(GrantTokens)
    if (SourceEncryptionContext != null) __obj.updateDynamic("SourceEncryptionContext")(SourceEncryptionContext)
    __obj.asInstanceOf[ReEncryptRequest]
  }
}

