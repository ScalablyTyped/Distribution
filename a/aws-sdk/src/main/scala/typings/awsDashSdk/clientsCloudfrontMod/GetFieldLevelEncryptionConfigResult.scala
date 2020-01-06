package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryptionConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionConfig] = js.native
}

object GetFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryptionConfig: FieldLevelEncryptionConfig = null): GetFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryptionConfig != null) __obj.updateDynamic("FieldLevelEncryptionConfig")(FieldLevelEncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigResult]
  }
}

