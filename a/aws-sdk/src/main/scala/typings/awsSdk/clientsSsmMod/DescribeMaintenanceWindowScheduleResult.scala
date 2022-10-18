package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowScheduleResult extends StObject {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * Information about maintenance window executions scheduled for the specified time range.
    */
  var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined
}
object DescribeMaintenanceWindowScheduleResult {
  
  inline def apply(): DescribeMaintenanceWindowScheduleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleResult]
  }
  
  extension [Self <: DescribeMaintenanceWindowScheduleResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduledWindowExecutions(value: ScheduledWindowExecutionList): Self = StObject.set(x, "ScheduledWindowExecutions", value.asInstanceOf[js.Any])
    
    inline def setScheduledWindowExecutionsUndefined: Self = StObject.set(x, "ScheduledWindowExecutions", js.undefined)
    
    inline def setScheduledWindowExecutionsVarargs(value: ScheduledWindowExecution*): Self = StObject.set(x, "ScheduledWindowExecutions", js.Array(value*))
  }
}
