package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTargetsResponse extends js.Object {
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[RemoveTargetsResultEntryList] = js.undefined
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}

object RemoveTargetsResponse {
  @scala.inline
  def apply(FailedEntries: RemoveTargetsResultEntryList = null, FailedEntryCount: Int | Double = null): RemoveTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedEntries != null) __obj.updateDynamic("FailedEntries")(FailedEntries)
    if (FailedEntryCount != null) __obj.updateDynamic("FailedEntryCount")(FailedEntryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTargetsResponse]
  }
}

