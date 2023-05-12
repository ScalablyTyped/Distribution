package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentRequest extends StObject {
  
  /**
    * Specifies the Amazon Resource Name (ARN) of the DataSync agent to describe.
    */
  var AgentArn: typings.awsSdk.clientsDatasyncMod.AgentArn
}
object DescribeAgentRequest {
  
  inline def apply(AgentArn: AgentArn): DescribeAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAgentRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
  }
}
