package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDetectMitigationActionsExecutionsResponse extends StObject {
  
  /**
    *  List of actions executions. 
    */
  var actionsExecutions: js.UndefOr[DetectMitigationActionExecutionList] = js.undefined
  
  /**
    *  A token that can be used to retrieve the next set of results, or null if there are no additional results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDetectMitigationActionsExecutionsResponse {
  
  inline def apply(): ListDetectMitigationActionsExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDetectMitigationActionsExecutionsResponse]
  }
  
  extension [Self <: ListDetectMitigationActionsExecutionsResponse](x: Self) {
    
    inline def setActionsExecutions(value: DetectMitigationActionExecutionList): Self = StObject.set(x, "actionsExecutions", value.asInstanceOf[js.Any])
    
    inline def setActionsExecutionsUndefined: Self = StObject.set(x, "actionsExecutions", js.undefined)
    
    inline def setActionsExecutionsVarargs(value: DetectMitigationActionExecution*): Self = StObject.set(x, "actionsExecutions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
