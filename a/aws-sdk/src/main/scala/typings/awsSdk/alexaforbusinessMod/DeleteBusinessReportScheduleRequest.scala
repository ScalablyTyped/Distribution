package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DeleteBusinessReportScheduleRequestOps[Self <: DeleteBusinessReportScheduleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScheduleArn(value: Arn): Self = this.set("ScheduleArn", value.asInstanceOf[js.Any])
  }
}
