package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFieldLevelEncryptionConfigResult extends js.Object {
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * Returned when you create a new field-level encryption configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryption] = js.native
  /**
    * The fully qualified URI of the new configuration resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/field-level-encryption-config/EDFDVBD632BHDS5.
    */
  var Location: js.UndefOr[String] = js.native
}

object CreateFieldLevelEncryptionConfigResult {
  @scala.inline
  def apply(ETag: String = null, FieldLevelEncryption: FieldLevelEncryption = null, Location: String = null): CreateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (FieldLevelEncryption != null) __obj.updateDynamic("FieldLevelEncryption")(FieldLevelEncryption.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFieldLevelEncryptionConfigResult]
  }
}

