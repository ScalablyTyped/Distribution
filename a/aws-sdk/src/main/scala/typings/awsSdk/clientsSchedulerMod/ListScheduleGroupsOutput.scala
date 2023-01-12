package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScheduleGroupsOutput extends StObject {
  
  /**
    * Indicates whether there are additional results to retrieve. If the value is null, there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSchedulerMod.NextToken] = js.undefined
  
  /**
    * The schedule groups that match the specified criteria.
    */
  var ScheduleGroups: ScheduleGroupList
}
object ListScheduleGroupsOutput {
  
  inline def apply(ScheduleGroups: ScheduleGroupList): ListScheduleGroupsOutput = {
    val __obj = js.Dynamic.literal(ScheduleGroups = ScheduleGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListScheduleGroupsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListScheduleGroupsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScheduleGroups(value: ScheduleGroupList): Self = StObject.set(x, "ScheduleGroups", value.asInstanceOf[js.Any])
    
    inline def setScheduleGroupsVarargs(value: ScheduleGroupSummary*): Self = StObject.set(x, "ScheduleGroups", js.Array(value*))
  }
}
