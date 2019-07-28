package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFieldLevelEncryptionConfigsResult extends js.Object {
  /**
    * Returns a list of all field-level encryption configurations that have been created in CloudFront for this account.
    */
  var FieldLevelEncryptionList: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.FieldLevelEncryptionList] = js.undefined
}

object ListFieldLevelEncryptionConfigsResult {
  @scala.inline
  def apply(FieldLevelEncryptionList: FieldLevelEncryptionList = null): ListFieldLevelEncryptionConfigsResult = {
    val __obj = js.Dynamic.literal()
    if (FieldLevelEncryptionList != null) __obj.updateDynamic("FieldLevelEncryptionList")(FieldLevelEncryptionList)
    __obj.asInstanceOf[ListFieldLevelEncryptionConfigsResult]
  }
}

