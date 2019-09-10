package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3EncryptionConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS KMS). You must provide a KmsKeyArn if you specify SSE_KMS as the ObjectEncryptionType.  KmsKeyArn is not required if you specify SSE_S3 as the ObjectEncryptionType.
    */
  var KmsKeyArn: js.UndefOr[Arn] = js.undefined
  /**
    * The Amazon S3 object encryption type. To learn more about server-side encryption options in Amazon S3, see Protecting Data Using Server-Side Encryption in the Amazon S3 Developer Guide.
    */
  var ObjectEncryptionType: S3ObjectEncryptionType
}

object S3EncryptionConfiguration {
  @scala.inline
  def apply(ObjectEncryptionType: S3ObjectEncryptionType, KmsKeyArn: Arn = null): S3EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(ObjectEncryptionType = ObjectEncryptionType.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn)
    __obj.asInstanceOf[S3EncryptionConfiguration]
  }
}

