package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpeechSynthesisTasksInput extends StObject {
  
  /**
    * Maximum number of speech synthesis tasks returned in a List operation.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsPollyMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to use in the next request to continue the listing of speech synthesis tasks. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPollyMod.NextToken] = js.undefined
  
  /**
    * Status of the speech synthesis tasks returned in a List operation
    */
  var Status: js.UndefOr[TaskStatus] = js.undefined
}
object ListSpeechSynthesisTasksInput {
  
  inline def apply(): ListSpeechSynthesisTasksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeechSynthesisTasksInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSpeechSynthesisTasksInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
