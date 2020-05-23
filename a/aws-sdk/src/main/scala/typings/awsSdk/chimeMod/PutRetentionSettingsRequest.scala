package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionSettingsRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The retention settings.
    */
  var RetentionSettings: typings.awsSdk.chimeMod.RetentionSettings = js.native
}

object PutRetentionSettingsRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, RetentionSettings: RetentionSettings): PutRetentionSettingsRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], RetentionSettings = RetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionSettingsRequest]
  }
}

