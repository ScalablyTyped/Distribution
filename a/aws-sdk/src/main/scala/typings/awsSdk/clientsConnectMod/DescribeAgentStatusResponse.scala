package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentStatusResponse extends StObject {
  
  /**
    * The agent status.
    */
  var AgentStatus: js.UndefOr[typings.awsSdk.clientsConnectMod.AgentStatus] = js.undefined
}
object DescribeAgentStatusResponse {
  
  inline def apply(): DescribeAgentStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentStatusResponse]
  }
  
  extension [Self <: DescribeAgentStatusResponse](x: Self) {
    
    inline def setAgentStatus(value: AgentStatus): Self = StObject.set(x, "AgentStatus", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusUndefined: Self = StObject.set(x, "AgentStatus", js.undefined)
  }
}
