package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTaskExecutionsResponse extends StObject {
  
  /**
    * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NextToken] = js.undefined
  
  /**
    * A list of executed tasks.
    */
  var TaskExecutions: js.UndefOr[TaskExecutionList] = js.undefined
}
object ListTaskExecutionsResponse {
  
  inline def apply(): ListTaskExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTaskExecutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskExecutions(value: TaskExecutionList): Self = StObject.set(x, "TaskExecutions", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionsUndefined: Self = StObject.set(x, "TaskExecutions", js.undefined)
    
    inline def setTaskExecutionsVarargs(value: TaskExecutionListEntry*): Self = StObject.set(x, "TaskExecutions", js.Array(value*))
  }
}
