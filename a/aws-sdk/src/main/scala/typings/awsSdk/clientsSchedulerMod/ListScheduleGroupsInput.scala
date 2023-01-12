package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScheduleGroupsInput extends StObject {
  
  /**
    * If specified, limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSchedulerMod.MaxResults] = js.undefined
  
  /**
    * The name prefix that you can use to return a filtered list of your schedule groups.
    */
  var NamePrefix: js.UndefOr[ScheduleGroupNamePrefix] = js.undefined
  
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSchedulerMod.NextToken] = js.undefined
}
object ListScheduleGroupsInput {
  
  inline def apply(): ListScheduleGroupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScheduleGroupsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListScheduleGroupsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNamePrefix(value: ScheduleGroupNamePrefix): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNamePrefixUndefined: Self = StObject.set(x, "NamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
