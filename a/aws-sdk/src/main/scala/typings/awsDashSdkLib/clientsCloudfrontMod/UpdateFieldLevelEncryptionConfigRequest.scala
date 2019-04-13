package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * Request to update a field-level encryption configuration. 
    */
  var FieldLevelEncryptionConfig: awsDashSdkLib.clientsCloudfrontMod.FieldLevelEncryptionConfig
  /**
    * The ID of the configuration you want to update.
    */
  var Id: java.lang.String
  /**
    * The value of the ETag header that you received when retrieving the configuration identity to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(
    FieldLevelEncryptionConfig: FieldLevelEncryptionConfig,
    Id: java.lang.String,
    IfMatch: java.lang.String = null
  ): UpdateFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig, Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigRequest]
  }
}

