package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBusinessReportSchedulesResponse extends js.Object {
  /**
    * The schedule of the reports.
    */
  var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList] = js.native
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListBusinessReportSchedulesResponse {
  @scala.inline
  def apply(BusinessReportSchedules: BusinessReportScheduleList = null, NextToken: NextToken = null): ListBusinessReportSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    if (BusinessReportSchedules != null) __obj.updateDynamic("BusinessReportSchedules")(BusinessReportSchedules.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBusinessReportSchedulesResponse]
  }
}

