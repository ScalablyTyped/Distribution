package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateScheduleRequest extends js.Object {
  /**
    * Id of the channel whose schedule is being updated.
    */
  var ChannelId: __string
  /**
    * Schedule actions to create in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateRequest] = js.undefined
  /**
    * Schedule actions to delete from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteRequest] = js.undefined
}

object BatchUpdateScheduleRequest {
  @scala.inline
  def apply(
    ChannelId: __string,
    Creates: BatchScheduleActionCreateRequest = null,
    Deletes: BatchScheduleActionDeleteRequest = null
  ): BatchUpdateScheduleRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId)
    if (Creates != null) __obj.updateDynamic("Creates")(Creates)
    if (Deletes != null) __obj.updateDynamic("Deletes")(Deletes)
    __obj.asInstanceOf[BatchUpdateScheduleRequest]
  }
}

