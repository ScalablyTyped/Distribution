package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFieldLevelEncryptionConfigRequest extends js.Object {
  /**
    * Request to update a field-level encryption configuration. 
    */
  var FieldLevelEncryptionConfig: typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionConfig
  /**
    * The ID of the configuration you want to update.
    */
  var Id: String
  /**
    * The value of the ETag header that you received when retrieving the configuration identity to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}

object UpdateFieldLevelEncryptionConfigRequest {
  @scala.inline
  def apply(FieldLevelEncryptionConfig: FieldLevelEncryptionConfig, Id: String, IfMatch: String = null): UpdateFieldLevelEncryptionConfigRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionConfig = FieldLevelEncryptionConfig, Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[UpdateFieldLevelEncryptionConfigRequest]
  }
}

