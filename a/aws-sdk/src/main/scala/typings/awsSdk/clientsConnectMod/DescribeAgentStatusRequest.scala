package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentStatusRequest extends StObject {
  
  /**
    * The identifier for the agent status.
    */
  var AgentStatusId: typings.awsSdk.clientsConnectMod.AgentStatusId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object DescribeAgentStatusRequest {
  
  inline def apply(AgentStatusId: AgentStatusId, InstanceId: InstanceId): DescribeAgentStatusRequest = {
    val __obj = js.Dynamic.literal(AgentStatusId = AgentStatusId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgentStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAgentStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentStatusId(value: AgentStatusId): Self = StObject.set(x, "AgentStatusId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
