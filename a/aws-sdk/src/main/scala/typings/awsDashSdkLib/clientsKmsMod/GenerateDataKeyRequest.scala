package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateDataKeyRequest extends js.Object {
  /**
    * A set of key-value pairs that represents additional authenticated data. For more information, see Encryption Context in the AWS Key Management Service Developer Guide.
    */
  var EncryptionContext: js.UndefOr[EncryptionContextType] = js.undefined
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.undefined
  /**
    * An identifier for the CMK that encrypts the data key. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType
  /**
    * The length of the data key. Use AES_128 to generate a 128-bit symmetric key, or AES_256 to generate a 256-bit symmetric key.
    */
  var KeySpec: js.UndefOr[DataKeySpec] = js.undefined
  /**
    * The length of the data key in bytes. For example, use the value 64 to generate a 512-bit data key (64 bytes is 512 bits). For common key lengths (128-bit and 256-bit symmetric keys), we recommend that you use the KeySpec field instead of this one.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
}

object GenerateDataKeyRequest {
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    EncryptionContext: EncryptionContextType = null,
    GrantTokens: GrantTokenList = null,
    KeySpec: DataKeySpec = null,
    NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
  ): GenerateDataKeyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId)
    if (EncryptionContext != null) __obj.updateDynamic("EncryptionContext")(EncryptionContext)
    if (GrantTokens != null) __obj.updateDynamic("GrantTokens")(GrantTokens)
    if (KeySpec != null) __obj.updateDynamic("KeySpec")(KeySpec.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfBytes)) __obj.updateDynamic("NumberOfBytes")(NumberOfBytes)
    __obj.asInstanceOf[GenerateDataKeyRequest]
  }
}

