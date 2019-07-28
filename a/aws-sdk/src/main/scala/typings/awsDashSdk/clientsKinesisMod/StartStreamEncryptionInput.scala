package typings.awsDashSdk.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartStreamEncryptionInput extends js.Object {
  /**
    * The encryption type to use. The only valid value is KMS.
    */
  var EncryptionType: typings.awsDashSdk.clientsKinesisMod.EncryptionType
  /**
    * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.   Key ARN example: arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012    Alias ARN example: arn:aws:kms:us-east-1:123456789012:alias/MyAliasName    Globally unique key ID example: 12345678-1234-1234-1234-123456789012    Alias name example: alias/MyAliasName    Master key owned by Kinesis Data Streams: alias/aws/kinesis   
    */
  var KeyId: typings.awsDashSdk.clientsKinesisMod.KeyId
  /**
    * The name of the stream for which to start encrypting records.
    */
  var StreamName: typings.awsDashSdk.clientsKinesisMod.StreamName
}

object StartStreamEncryptionInput {
  @scala.inline
  def apply(EncryptionType: EncryptionType, KeyId: KeyId, StreamName: StreamName): StartStreamEncryptionInput = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId, StreamName = StreamName)
  
    __obj.asInstanceOf[StartStreamEncryptionInput]
  }
}

