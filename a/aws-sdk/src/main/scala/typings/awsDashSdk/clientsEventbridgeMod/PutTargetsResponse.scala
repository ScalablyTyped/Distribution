package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTargetsResponse extends js.Object {
  /**
    * The failed target entries.
    */
  var FailedEntries: js.UndefOr[PutTargetsResultEntryList] = js.undefined
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}

object PutTargetsResponse {
  @scala.inline
  def apply(FailedEntries: PutTargetsResultEntryList = null, FailedEntryCount: Int | Double = null): PutTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedEntries != null) __obj.updateDynamic("FailedEntries")(FailedEntries)
    if (FailedEntryCount != null) __obj.updateDynamic("FailedEntryCount")(FailedEntryCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTargetsResponse]
  }
}

