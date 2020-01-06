package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFieldLevelEncryptionProfilesResult extends js.Object {
  /**
    * Returns a list of the field-level encryption profiles that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionProfileList: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionProfileList] = js.native
}

object ListFieldLevelEncryptionProfilesResult {
  @scala.inline
  def apply(FieldLevelEncryptionProfileList: FieldLevelEncryptionProfileList = null): ListFieldLevelEncryptionProfilesResult = {
    val __obj = js.Dynamic.literal()
    if (FieldLevelEncryptionProfileList != null) __obj.updateDynamic("FieldLevelEncryptionProfileList")(FieldLevelEncryptionProfileList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesResult]
  }
}

