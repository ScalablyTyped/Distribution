package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent to describe.
    */
  var AgentArn: typings.awsSdk.clientsDatasyncMod.AgentArn
}
object DescribeAgentRequest {
  
  inline def apply(AgentArn: AgentArn): DescribeAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentRequest]
  }
  
  extension [Self <: DescribeAgentRequest](x: Self) {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
  }
}
