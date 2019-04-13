package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFieldLevelEncryptionResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
}

object GetFieldLevelEncryptionResult {
  @scala.inline
  def apply(ETag: java.lang.String = null, FieldLevelEncryption: FieldLevelEncryption = null): GetFieldLevelEncryptionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryption != null) __obj.updateDynamic("FieldLevelEncryption")(FieldLevelEncryption)
    __obj.asInstanceOf[GetFieldLevelEncryptionResult]
  }
}

