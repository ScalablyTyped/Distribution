package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTasksInput extends StObject {
  
  /**
    * The maximum number of tasks per page.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token to continue to the next page of tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A structure used to filter the list of tasks.
    */
  var state: js.UndefOr[TaskState] = js.undefined
}
object ListTasksInput {
  
  inline def apply(): ListTasksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTasksInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTasksInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setState(value: TaskState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
