package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionOptions extends js.Object {
  /**
    * The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
    */
  var KmsKeyId: js.UndefOr[__string] = js.undefined
  /**
    * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS).
    */
  var UseAwsOwnedKey: __boolean
}

object EncryptionOptions {
  @scala.inline
  def apply(UseAwsOwnedKey: __boolean, KmsKeyId: __string = null): EncryptionOptions = {
    val __obj = js.Dynamic.literal(UseAwsOwnedKey = UseAwsOwnedKey)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    __obj.asInstanceOf[EncryptionOptions]
  }
}

