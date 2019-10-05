package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionAtRestOptions extends js.Object {
  /**
    * Specifies the option to enable Encryption At Rest.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    *  Specifies the KMS Key ID for Encryption At Rest options.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsEsMod.KmsKeyId] = js.undefined
}

object EncryptionAtRestOptions {
  @scala.inline
  def apply(Enabled: js.UndefOr[scala.Boolean] = js.undefined, KmsKeyId: KmsKeyId = null): EncryptionAtRestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    __obj.asInstanceOf[EncryptionAtRestOptions]
  }
}

