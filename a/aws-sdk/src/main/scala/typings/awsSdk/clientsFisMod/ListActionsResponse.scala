package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActionsResponse extends StObject {
  
  /**
    * The actions.
    */
  var actions: js.UndefOr[ActionSummaryList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListActionsResponse {
  
  inline def apply(): ListActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListActionsResponse] (val x: Self) extends AnyVal {
    
    inline def setActions(value: ActionSummaryList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: ActionSummary*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
