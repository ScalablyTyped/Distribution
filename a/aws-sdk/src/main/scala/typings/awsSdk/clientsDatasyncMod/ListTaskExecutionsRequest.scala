package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTaskExecutionsRequest extends StObject {
  
  /**
    * The maximum number of executed tasks to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsDatasyncMod.MaxResults] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin the next list of the executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task whose tasks you want to list.
    */
  var TaskArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.TaskArn] = js.undefined
}
object ListTaskExecutionsRequest {
  
  inline def apply(): ListTaskExecutionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTaskExecutionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTaskExecutionsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTaskArn(value: TaskArn): Self = StObject.set(x, "TaskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "TaskArn", js.undefined)
  }
}
