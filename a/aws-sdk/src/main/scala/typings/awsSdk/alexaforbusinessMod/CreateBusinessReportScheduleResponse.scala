package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBusinessReportScheduleResponse extends StObject {
  
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
  implicit class CreateBusinessReportScheduleResponseMutableBuilder[Self <: CreateBusinessReportScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleArn(value: Arn): Self = StObject.set(x, "ScheduleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleArnUndefined: Self = StObject.set(x, "ScheduleArn", js.undefined)
  }
}
