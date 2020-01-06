package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBusinessReportScheduleRequest extends js.Object {
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: Arn = js.native
}

object DeleteBusinessReportScheduleRequest {
  @scala.inline
  def apply(ScheduleArn: Arn): DeleteBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ScheduleArn = ScheduleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBusinessReportScheduleRequest]
  }
}

