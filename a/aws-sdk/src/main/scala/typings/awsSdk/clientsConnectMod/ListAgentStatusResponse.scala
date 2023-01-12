package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgentStatusResponse extends StObject {
  
  /**
    * A summary of agent statuses.
    */
  var AgentStatusSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.AgentStatusSummaryList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListAgentStatusResponse {
  
  inline def apply(): ListAgentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAgentStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentStatusSummaryList(value: AgentStatusSummaryList): Self = StObject.set(x, "AgentStatusSummaryList", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusSummaryListUndefined: Self = StObject.set(x, "AgentStatusSummaryList", js.undefined)
    
    inline def setAgentStatusSummaryListVarargs(value: AgentStatusSummary*): Self = StObject.set(x, "AgentStatusSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
