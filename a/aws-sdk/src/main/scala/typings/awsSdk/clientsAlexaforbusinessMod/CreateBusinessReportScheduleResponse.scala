package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBusinessReportScheduleResponse extends StObject {
  
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: js.UndefOr[Arn] = js.undefined
}
object CreateBusinessReportScheduleResponse {
  
  inline def apply(): CreateBusinessReportScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateBusinessReportScheduleResponse]
  }
  
  extension [Self <: CreateBusinessReportScheduleResponse](x: Self) {
    
    inline def setScheduleArn(value: Arn): Self = StObject.set(x, "ScheduleArn", value.asInstanceOf[js.Any])
    
    inline def setScheduleArnUndefined: Self = StObject.set(x, "ScheduleArn", js.undefined)
  }
}
