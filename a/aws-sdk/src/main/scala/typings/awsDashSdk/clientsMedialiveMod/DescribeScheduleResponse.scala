package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScheduleResponse extends js.Object {
  /**
    * The next token; for use in pagination.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The list of actions in the schedule.
    */
  var ScheduleActions: js.UndefOr[__listOfScheduleAction] = js.undefined
}

object DescribeScheduleResponse {
  @scala.inline
  def apply(NextToken: __string = null, ScheduleActions: __listOfScheduleAction = null): DescribeScheduleResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScheduleActions != null) __obj.updateDynamic("ScheduleActions")(ScheduleActions)
    __obj.asInstanceOf[DescribeScheduleResponse]
  }
}

