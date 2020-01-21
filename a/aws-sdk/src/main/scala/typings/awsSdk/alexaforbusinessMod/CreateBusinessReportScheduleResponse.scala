package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBusinessReportScheduleResponse extends js.Object {
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.native
}

object CreateBusinessReportScheduleResponse {
  @scala.inline
  def apply(ScheduleArn: Arn = null): CreateBusinessReportScheduleResponse = {
    val __obj = js.Dynamic.literal()
    if (ScheduleArn != null) __obj.updateDynamic("ScheduleArn")(ScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBusinessReportScheduleResponse]
  }
}

