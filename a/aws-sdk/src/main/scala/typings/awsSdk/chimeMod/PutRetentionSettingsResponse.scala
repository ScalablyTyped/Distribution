package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRetentionSettingsResponse extends js.Object {
  /**
    * The timestamp representing the time at which the specified items are permanently deleted, in ISO 8601 format.
    */
  var InitiateDeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The retention settings.
    */
  var RetentionSettings: js.UndefOr[typings.awsSdk.chimeMod.RetentionSettings] = js.native
}

object PutRetentionSettingsResponse {
  @scala.inline
  def apply(InitiateDeletionTimestamp: Iso8601Timestamp = null, RetentionSettings: RetentionSettings = null): PutRetentionSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (InitiateDeletionTimestamp != null) __obj.updateDynamic("InitiateDeletionTimestamp")(InitiateDeletionTimestamp.asInstanceOf[js.Any])
    if (RetentionSettings != null) __obj.updateDynamic("RetentionSettings")(RetentionSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRetentionSettingsResponse]
  }
}

