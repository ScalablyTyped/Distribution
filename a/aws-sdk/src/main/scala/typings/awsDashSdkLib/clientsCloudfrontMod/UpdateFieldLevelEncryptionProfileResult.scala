package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFieldLevelEncryptionProfileResult extends js.Object {
  /**
    * The result of the field-level encryption profile request. 
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return the results of updating the profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[FieldLevelEncryptionProfile] = js.undefined
}

object UpdateFieldLevelEncryptionProfileResult {
  @scala.inline
  def apply(ETag: java.lang.String = null, FieldLevelEncryptionProfile: FieldLevelEncryptionProfile = null): UpdateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (FieldLevelEncryptionProfile != null) __obj.updateDynamic("FieldLevelEncryptionProfile")(FieldLevelEncryptionProfile)
    __obj.asInstanceOf[UpdateFieldLevelEncryptionProfileResult]
  }
}

