package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchedulesOutput extends StObject {
  
  /**
    * Indicates whether there are additional results to retrieve. If the value is null, there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSchedulerMod.NextToken] = js.undefined
  
  /**
    * The schedules that match the specified criteria.
    */
  var Schedules: ScheduleList
}
object ListSchedulesOutput {
  
  inline def apply(Schedules: ScheduleList): ListSchedulesOutput = {
    val __obj = js.Dynamic.literal(Schedules = Schedules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchedulesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSchedulesOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSchedules(value: ScheduleList): Self = StObject.set(x, "Schedules", value.asInstanceOf[js.Any])
    
    inline def setSchedulesVarargs(value: ScheduleSummary*): Self = StObject.set(x, "Schedules", js.Array(value*))
  }
}
