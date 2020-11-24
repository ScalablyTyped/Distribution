package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ListBusinessReportSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBusinessReportSchedulesResponse]
  }
  
  @scala.inline
  implicit class ListBusinessReportSchedulesResponseOps[Self <: ListBusinessReportSchedulesResponse] (val x: Self) extends AnyVal {
    
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
    def setBusinessReportSchedulesVarargs(value: BusinessReportSchedule*): Self = this.set("BusinessReportSchedules", js.Array(value :_*))
    
    @scala.inline
    def setBusinessReportSchedules(value: BusinessReportScheduleList): Self = this.set("BusinessReportSchedules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessReportSchedules: Self = this.set("BusinessReportSchedules", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
