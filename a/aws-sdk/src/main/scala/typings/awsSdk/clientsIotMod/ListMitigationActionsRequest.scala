package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMitigationActionsRequest extends StObject {
  
  /**
    * Specify a value to limit the result to mitigation actions with a specific action type.
    */
  var actionType: js.UndefOr[MitigationActionType] = js.undefined
  
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMitigationActionsRequest {
  
  inline def apply(): ListMitigationActionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMitigationActionsRequest]
  }
  
  extension [Self <: ListMitigationActionsRequest](x: Self) {
    
    inline def setActionType(value: MitigationActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
