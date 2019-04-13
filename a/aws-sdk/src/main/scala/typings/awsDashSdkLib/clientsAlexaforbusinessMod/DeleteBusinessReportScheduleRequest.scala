package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBusinessReportScheduleRequest extends js.Object {
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: Arn
}

object DeleteBusinessReportScheduleRequest {
  @scala.inline
  def apply(ScheduleArn: Arn): DeleteBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ScheduleArn = ScheduleArn)
  
    __obj.asInstanceOf[DeleteBusinessReportScheduleRequest]
  }
}

