package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBusinessReportScheduleRequest extends StObject {
  
  /**
    * The ARN of the business report schedule.
    */
  var ScheduleArn: Arn
}
object DeleteBusinessReportScheduleRequest {
  
  inline def apply(ScheduleArn: Arn): DeleteBusinessReportScheduleRequest = {
    val __obj = js.Dynamic.literal(ScheduleArn = ScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBusinessReportScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBusinessReportScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setScheduleArn(value: Arn): Self = StObject.set(x, "ScheduleArn", value.asInstanceOf[js.Any])
  }
}
