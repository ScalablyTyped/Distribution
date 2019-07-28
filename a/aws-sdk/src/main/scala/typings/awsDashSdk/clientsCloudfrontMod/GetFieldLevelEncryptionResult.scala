package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryption] = js.undefined
}

object GetFieldLevelEncryptionResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryption: FieldLevelEncryption = null): GetFieldLevelEncryptionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryption != null) __obj.updateDynamic("FieldLevelEncryption")(FieldLevelEncryption)
    __obj.asInstanceOf[GetFieldLevelEncryptionResult]
  }
}

