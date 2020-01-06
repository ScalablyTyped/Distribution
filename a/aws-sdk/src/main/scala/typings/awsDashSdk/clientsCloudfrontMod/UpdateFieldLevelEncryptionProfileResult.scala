package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The result of the field-level encryption profile request. 
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the results of updating the profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionProfile] = js.native
}

object UpdateFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryptionProfile: FieldLevelEncryptionProfile = null): UpdateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryptionProfile != null) __obj.updateDynamic("FieldLevelEncryptionProfile")(FieldLevelEncryptionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileResult]
  }
}

