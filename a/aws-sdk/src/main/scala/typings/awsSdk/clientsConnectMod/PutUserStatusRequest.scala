package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutUserStatusRequest extends StObject {
  
  /**
    * The identifier of the agent status.
    */
  var AgentStatusId: typings.awsSdk.clientsConnectMod.AgentStatusId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier of the user.
    */
  var UserId: typings.awsSdk.clientsConnectMod.UserId
}
object PutUserStatusRequest {
  
  inline def apply(AgentStatusId: AgentStatusId, InstanceId: InstanceId, UserId: UserId): PutUserStatusRequest = {
    val __obj = js.Dynamic.literal(AgentStatusId = AgentStatusId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutUserStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutUserStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentStatusId(value: AgentStatusId): Self = StObject.set(x, "AgentStatusId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
