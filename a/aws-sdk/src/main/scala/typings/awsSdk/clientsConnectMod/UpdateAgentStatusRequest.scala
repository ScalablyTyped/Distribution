package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentStatusRequest extends StObject {
  
  /**
    * The identifier of the agent status.
    */
  var AgentStatusId: typings.awsSdk.clientsConnectMod.AgentStatusId
  
  /**
    * The description of the agent status.
    */
  var Description: js.UndefOr[UpdateAgentStatusDescription] = js.undefined
  
  /**
    * The display order of the agent status.
    */
  var DisplayOrder: js.UndefOr[AgentStatusOrderNumber] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the agent status.
    */
  var Name: js.UndefOr[AgentStatusName] = js.undefined
  
  /**
    * A number indicating the reset order of the agent status.
    */
  var ResetOrderNumber: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The state of the agent status.
    */
  var State: js.UndefOr[AgentStatusState] = js.undefined
}
object UpdateAgentStatusRequest {
  
  inline def apply(AgentStatusId: AgentStatusId, InstanceId: InstanceId): UpdateAgentStatusRequest = {
    val __obj = js.Dynamic.literal(AgentStatusId = AgentStatusId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentStatusRequest]
  }
  
  extension [Self <: UpdateAgentStatusRequest](x: Self) {
    
    inline def setAgentStatusId(value: AgentStatusId): Self = StObject.set(x, "AgentStatusId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: UpdateAgentStatusDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayOrder(value: AgentStatusOrderNumber): Self = StObject.set(x, "DisplayOrder", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrderUndefined: Self = StObject.set(x, "DisplayOrder", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AgentStatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResetOrderNumber(value: Boolean): Self = StObject.set(x, "ResetOrderNumber", value.asInstanceOf[js.Any])
    
    inline def setResetOrderNumberUndefined: Self = StObject.set(x, "ResetOrderNumber", js.undefined)
    
    inline def setState(value: AgentStatusState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
