package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActionExecutionsInput extends StObject {
  
  /**
    * Input information used to filter action execution history.
    */
  var filter: js.UndefOr[ActionExecutionFilter] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned nextToken value. Action execution history is retained for up to 12 months, based on action execution start times. Default value is 100.   Detailed execution history is available for executions run on or after February 21, 2019. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token that was returned from the previous ListActionExecutions call, which can be used to return the next set of action executions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The name of the pipeline for which you want to list action execution history.
    */
  var pipelineName: PipelineName
}
object ListActionExecutionsInput {
  
  inline def apply(pipelineName: PipelineName): ListActionExecutionsInput = {
    val __obj = js.Dynamic.literal(pipelineName = pipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActionExecutionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListActionExecutionsInput] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ActionExecutionFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
  }
}
