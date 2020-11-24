package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBusinessReportScheduleResponse extends js.Object {
  
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.native
}
object CreateBusinessReportScheduleResponse {
  
  @scala.inline
  def apply(): CreateBusinessReportScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBusinessReportScheduleResponse]
  }
  
  @scala.inline
  implicit class CreateBusinessReportScheduleResponseOps[Self <: CreateBusinessReportScheduleResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteScheduleArn: Self = this.set("ScheduleArn", js.undefined)
  }
}
