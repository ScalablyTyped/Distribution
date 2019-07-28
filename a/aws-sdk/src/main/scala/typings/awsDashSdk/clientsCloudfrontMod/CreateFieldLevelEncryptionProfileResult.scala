package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * Returned when you create a new field-level encryption profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionProfile] = js.undefined
  /**
    * The fully qualified URI of the new profile resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-profile/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[String] = js.undefined
}

object CreateFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(
    ETag: String = null,
    FieldLevelEncryptionProfile: FieldLevelEncryptionProfile = null,
    Location: String = null
  ): CreateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryptionProfile != null) __obj.updateDynamic("FieldLevelEncryptionProfile")(FieldLevelEncryptionProfile)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileResult]
  }
}

