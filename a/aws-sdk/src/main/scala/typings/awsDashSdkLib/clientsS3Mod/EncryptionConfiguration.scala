package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  /**
    * The ID of the AWS KMS key for the AWS Region where the destination bucket resides. Amazon S3 uses this key to encrypt the replica object. 
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

