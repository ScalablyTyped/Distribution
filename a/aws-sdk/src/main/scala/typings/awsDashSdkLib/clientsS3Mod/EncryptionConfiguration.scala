package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  /**
    * Specifies the AWS KMS Key ID (Key ARN or Alias ARN) for the destination bucket. Amazon S3 uses this key to encrypt replica objects.
    */
  var ReplicaKmsKeyID: js.UndefOr[ReplicaKmsKeyID] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(ReplicaKmsKeyID: ReplicaKmsKeyID = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ReplicaKmsKeyID != null) __obj.updateDynamic("ReplicaKmsKeyID")(ReplicaKmsKeyID)
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

