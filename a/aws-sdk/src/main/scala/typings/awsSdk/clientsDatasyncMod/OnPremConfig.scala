package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremConfig extends StObject {
  
  /**
    * ARNs of the agents to use for an NFS location.
    */
  var AgentArns: AgentArnList
}
object OnPremConfig {
  
  inline def apply(AgentArns: AgentArnList): OnPremConfig = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnPremConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnPremConfig] (val x: Self) extends AnyVal {
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
  }
}
