package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateDataKeyPairWithoutPlaintextResponse extends js.Object {
  /**
    * Specifies the CMK that encrypted the private key in the data key pair. You must specify a symmetric CMK. You cannot use an asymmetric CMK.  To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  /**
    * The type of data key pair that was generated.
    */
  var KeyPairSpec: js.UndefOr[DataKeyPairSpec] = js.native
  /**
    * The encrypted copy of the private key. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var PrivateKeyCiphertextBlob: js.UndefOr[CiphertextType] = js.native
  /**
    * The public key (in plaintext).
    */
  var PublicKey: js.UndefOr[PublicKeyType] = js.native
}

object GenerateDataKeyPairWithoutPlaintextResponse {
  @scala.inline
  def apply(
    KeyId: KeyIdType = null,
    KeyPairSpec: DataKeyPairSpec = null,
    PrivateKeyCiphertextBlob: CiphertextType = null,
    PublicKey: PublicKeyType = null
  ): GenerateDataKeyPairWithoutPlaintextResponse = {
    val __obj = js.Dynamic.literal()
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    if (KeyPairSpec != null) __obj.updateDynamic("KeyPairSpec")(KeyPairSpec.asInstanceOf[js.Any])
    if (PrivateKeyCiphertextBlob != null) __obj.updateDynamic("PrivateKeyCiphertextBlob")(PrivateKeyCiphertextBlob.asInstanceOf[js.Any])
    if (PublicKey != null) __obj.updateDynamic("PublicKey")(PublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateDataKeyPairWithoutPlaintextResponse]
  }
}

