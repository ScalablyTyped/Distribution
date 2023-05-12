package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRunTasksResponse extends StObject {
  
  /**
    * A list of tasks.
    */
  var items: js.UndefOr[TaskList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[TaskListToken] = js.undefined
}
object ListRunTasksResponse {
  
  inline def apply(): ListRunTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRunTasksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRunTasksResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: TaskList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TaskListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: TaskListToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
