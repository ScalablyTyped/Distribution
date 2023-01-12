package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActionsResponse extends StObject {
  
  /**
    * A list of actions and their properties.
    */
  var ActionSummaries: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ActionSummaries] = js.undefined
  
  /**
    * A token for getting the next set of actions, if there are any.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListActionsResponse {
  
  inline def apply(): ListActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListActionsResponse] (val x: Self) extends AnyVal {
    
    inline def setActionSummaries(value: ActionSummaries): Self = StObject.set(x, "ActionSummaries", value.asInstanceOf[js.Any])
    
    inline def setActionSummariesUndefined: Self = StObject.set(x, "ActionSummaries", js.undefined)
    
    inline def setActionSummariesVarargs(value: ActionSummary*): Self = StObject.set(x, "ActionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
