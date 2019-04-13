package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionProfileConfigResult extends js.Object {
  /**
    * The current version of the field-level encryption profile configuration result. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return the field-level encryption profile configuration information.
    */
  var FieldLevelEncryptionProfileConfig: js.UndefOr[FieldLevelEncryptionProfileConfig] = js.undefined
}

object GetFieldLevelEncryptionProfileConfigResult {
  @scala.inline
  def apply(
    ETag: java.lang.String = null,
    FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig = null
  ): GetFieldLevelEncryptionProfileConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryptionProfileConfig != null) __obj.updateDynamic("FieldLevelEncryptionProfileConfig")(FieldLevelEncryptionProfileConfig)
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileConfigResult]
  }
}

