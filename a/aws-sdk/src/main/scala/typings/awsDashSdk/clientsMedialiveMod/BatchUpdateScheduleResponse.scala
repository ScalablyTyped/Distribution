package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateScheduleResponse extends js.Object {
  /**
    * Schedule actions created in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.native
  /**
    * Schedule actions deleted from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.native
}

object BatchUpdateScheduleResponse {
  @scala.inline
  def apply(Creates: BatchScheduleActionCreateResult = null, Deletes: BatchScheduleActionDeleteResult = null): BatchUpdateScheduleResponse = {
    val __obj = js.Dynamic.literal()
    if (Creates != null) __obj.updateDynamic("Creates")(Creates.asInstanceOf[js.Any])
    if (Deletes != null) __obj.updateDynamic("Deletes")(Deletes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateScheduleResponse]
  }
}

