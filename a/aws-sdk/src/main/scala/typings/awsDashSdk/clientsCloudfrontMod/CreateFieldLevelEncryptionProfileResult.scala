package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Returned when you create a new field-level encryption profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionProfile] = js.native
  /**
    * The fully qualified URI of the new profile resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-profile/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(
    ETag: String = null,
    FieldLevelEncryptionProfile: FieldLevelEncryptionProfile = null,
    Location: String = null
  ): CreateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryptionProfile != null) __obj.updateDynamic("FieldLevelEncryptionProfile")(FieldLevelEncryptionProfile.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileResult]
  }
}

