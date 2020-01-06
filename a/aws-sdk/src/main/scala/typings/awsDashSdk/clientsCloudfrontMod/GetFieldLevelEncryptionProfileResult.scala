package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Return the field-level encryption profile information.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionProfile] = js.native
}

object GetFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryptionProfile: FieldLevelEncryptionProfile = null): GetFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryptionProfile != null) __obj.updateDynamic("FieldLevelEncryptionProfile")(FieldLevelEncryptionProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFieldLevelEncryptionProfileResult]
  }
}

