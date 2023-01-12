package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSchedulesInput extends StObject {
  
  /**
    * If specified, only lists the schedules whose associated schedule group matches the given filter.
    */
  var GroupName: js.UndefOr[ScheduleGroupName] = js.undefined
  
  /**
    * If specified, limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSchedulerMod.MaxResults] = js.undefined
  
  /**
    * Schedule name prefix to return the filtered list of resources.
    */
  var NamePrefix: js.UndefOr[typings.awsSdk.clientsSchedulerMod.NamePrefix] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSchedulerMod.NextToken] = js.undefined
  
  /**
    * If specified, only lists the schedules whose current state matches the given filter.
    */
  var State: js.UndefOr[ScheduleState] = js.undefined
}
object ListSchedulesInput {
  
  inline def apply(): ListSchedulesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchedulesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSchedulesInput] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: ScheduleGroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamePrefix(value: NamePrefix): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setState(value: ScheduleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
