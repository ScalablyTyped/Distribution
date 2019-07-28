package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryptionConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionConfig] = js.undefined
}

object GetFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryptionConfig: FieldLevelEncryptionConfig = null): GetFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryptionConfig != null) __obj.updateDynamic("FieldLevelEncryptionConfig")(FieldLevelEncryptionConfig)
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigResult]
  }
}

