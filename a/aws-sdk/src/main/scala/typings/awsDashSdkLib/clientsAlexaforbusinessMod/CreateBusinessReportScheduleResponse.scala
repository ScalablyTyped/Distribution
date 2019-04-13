package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBusinessReportScheduleResponse extends js.Object {
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.undefined
}

object CreateBusinessReportScheduleResponse {
  @scala.inline
  def apply(ScheduleArn: Arn = null): CreateBusinessReportScheduleResponse = {
    val __obj = js.Dynamic.literal()
    if (ScheduleArn != null) __obj.updateDynamic("ScheduleArn")(ScheduleArn)
    __obj.asInstanceOf[CreateBusinessReportScheduleResponse]
  }
}

