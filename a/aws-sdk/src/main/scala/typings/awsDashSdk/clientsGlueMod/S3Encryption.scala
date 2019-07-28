package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Encryption extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsDashSdk.clientsGlueMod.KmsKeyArn] = js.undefined
  /**
    * The encryption mode to use for Amazon S3 data.
    */
  var S3EncryptionMode: js.UndefOr[typings.awsDashSdk.clientsGlueMod.S3EncryptionMode] = js.undefined
}

object S3Encryption {
  @scala.inline
  def apply(KmsKeyArn: KmsKeyArn = null, S3EncryptionMode: S3EncryptionMode = null): S3Encryption = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn)
    if (S3EncryptionMode != null) __obj.updateDynamic("S3EncryptionMode")(S3EncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Encryption]
  }
}

