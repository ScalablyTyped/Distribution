package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAgentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent to delete. Use the ListAgents operation to return a list of agents for your account and Amazon Web Services Region.
    */
  var AgentArn: typings.awsSdk.clientsDatasyncMod.AgentArn
}
object DeleteAgentRequest {
  
  inline def apply(AgentArn: AgentArn): DeleteAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAgentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAgentRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
  }
}
