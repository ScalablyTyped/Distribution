package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The value of the ETag header that you received when updating the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * Return the results of updating the configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryption] = js.undefined
}

object UpdateFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryption: FieldLevelEncryption = null): UpdateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryption != null) __obj.updateDynamic("FieldLevelEncryption")(FieldLevelEncryption)
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigResult]
  }
}

