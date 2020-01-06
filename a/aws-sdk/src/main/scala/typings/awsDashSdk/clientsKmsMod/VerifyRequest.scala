package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyRequest extends js.Object {
  /**
    * A list of grant tokens. For more information, see Grant Tokens in the AWS Key Management Service Developer Guide.
    */
  var GrantTokens: js.UndefOr[GrantTokenList] = js.native
  /**
    * Identifies the asymmetric CMK that will be used to verify the signature. This must be the same CMK that was used to generate the signature. If you specify a different CMK, the signature verification fails. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". To specify a CMK in a different AWS account, you must use the key ARN or alias ARN. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey. To get the alias name and alias ARN, use ListAliases.
    */
  var KeyId: KeyIdType = js.native
  /**
    * Specifies the message that was signed, or a hash digest of that message. Messages can be 0-4096 bytes. To verify a larger message, provide a hash digest of the message. If the digest of the message specified here is different from the message digest that was signed, the signature verification fails.
    */
  var Message: PlaintextType = js.native
  /**
    * Tells AWS KMS whether the value of the Message parameter is a message or message digest. To indicate a message, enter RAW. To indicate a message digest, enter DIGEST.
    */
  var MessageType: js.UndefOr[typings.awsDashSdk.clientsKmsMod.MessageType] = js.native
  /**
    * The signature that the Sign operation generated.
    */
  var Signature: CiphertextType = js.native
  /**
    * The signing algorithm that was used to sign the message. If you submit a different algorithm, the signature verification fails.
    */
  var SigningAlgorithm: SigningAlgorithmSpec = js.native
}

object VerifyRequest {
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    Message: PlaintextType,
    Signature: CiphertextType,
    SigningAlgorithm: SigningAlgorithmSpec,
    GrantTokens: GrantTokenList = null,
    MessageType: MessageType = null
  ): VerifyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any])
    if (GrantTokens != null) __obj.updateDynamic("GrantTokens")(GrantTokens.asInstanceOf[js.Any])
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyRequest]
  }
}

