package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The value of the ETag header that you received when updating the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return the results of updating the configuration.
    */
  var FieldLevelEncryption: js.UndefOr[FieldLevelEncryption] = js.undefined
}

object UpdateFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(ETag: java.lang.String = null, FieldLevelEncryption: FieldLevelEncryption = null): UpdateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryption != null) __obj.updateDynamic("FieldLevelEncryption")(FieldLevelEncryption)
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigResult]
  }
}

