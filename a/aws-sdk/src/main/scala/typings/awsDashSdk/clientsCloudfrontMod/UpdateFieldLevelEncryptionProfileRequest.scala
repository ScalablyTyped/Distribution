package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFieldLevelEncryptionProfileRequest extends js.Object {
  /**
    * Request to update a field-level encryption profile. 
    */
  var FieldLevelEncryptionProfileConfig: typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionProfileConfig
  /**
    * The ID of the field-level encryption profile request. 
    */
  var Id: String
  /**
    * The value of the ETag header that you received when retrieving the profile identity to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}

object UpdateFieldLevelEncryptionProfileRequest {
  @scala.inline
  def apply(
    FieldLevelEncryptionProfileConfig: FieldLevelEncryptionProfileConfig,
    Id: String,
    IfMatch: String = null
  ): UpdateFieldLevelEncryptionProfileRequest = {
    val __obj = js.Dynamic.literal(FieldLevelEncryptionProfileConfig = FieldLevelEncryptionProfileConfig, Id = Id)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileRequest]
  }
}

