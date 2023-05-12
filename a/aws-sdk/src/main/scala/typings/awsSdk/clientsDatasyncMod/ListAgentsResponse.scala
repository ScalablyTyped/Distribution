package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgentsResponse extends StObject {
  
  /**
    * A list of DataSync agents in your Amazon Web Services account in the Amazon Web Services Region specified in the request. The list is ordered by the agents' Amazon Resource Names (ARNs).
    */
  var Agents: js.UndefOr[AgentList] = js.undefined
  
  /**
    * The opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatasyncMod.NextToken] = js.undefined
}
object ListAgentsResponse {
  
  inline def apply(): ListAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAgentsResponse] (val x: Self) extends AnyVal {
    
    inline def setAgents(value: AgentList): Self = StObject.set(x, "Agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsUndefined: Self = StObject.set(x, "Agents", js.undefined)
    
    inline def setAgentsVarargs(value: AgentListEntry*): Self = StObject.set(x, "Agents", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
