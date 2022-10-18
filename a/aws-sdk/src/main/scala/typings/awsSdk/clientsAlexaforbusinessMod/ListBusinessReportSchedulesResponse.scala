package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBusinessReportSchedulesResponse extends StObject {
  
  /**
    * The schedule of the reports.
    */
  var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList] = js.undefined
  
  /**
    * The token used to list the remaining schedules from the previous API call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}
object ListBusinessReportSchedulesResponse {
  
  inline def apply(): ListBusinessReportSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBusinessReportSchedulesResponse]
  }
  
  extension [Self <: ListBusinessReportSchedulesResponse](x: Self) {
    
    inline def setBusinessReportSchedules(value: BusinessReportScheduleList): Self = StObject.set(x, "BusinessReportSchedules", value.asInstanceOf[js.Any])
    
    inline def setBusinessReportSchedulesUndefined: Self = StObject.set(x, "BusinessReportSchedules", js.undefined)
    
    inline def setBusinessReportSchedulesVarargs(value: BusinessReportSchedule*): Self = StObject.set(x, "BusinessReportSchedules", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
