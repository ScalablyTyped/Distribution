package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateScheduleResponse extends js.Object {
  /**
    * Schedule actions created in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.undefined
  /**
    * Schedule actions deleted from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.undefined
}

object BatchUpdateScheduleResponse {
  @scala.inline
  def apply(Creates: BatchScheduleActionCreateResult = null, Deletes: BatchScheduleActionDeleteResult = null): BatchUpdateScheduleResponse = {
    val __obj = js.Dynamic.literal()
    if (Creates != null) __obj.updateDynamic("Creates")(Creates)
    if (Deletes != null) __obj.updateDynamic("Deletes")(Deletes)
    __obj.asInstanceOf[BatchUpdateScheduleResponse]
  }
}

