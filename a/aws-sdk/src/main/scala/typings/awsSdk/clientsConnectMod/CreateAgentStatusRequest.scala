package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentStatusRequest extends StObject {
  
  /**
    * The description of the status.
    */
  var Description: js.UndefOr[AgentStatusDescription] = js.undefined
  
  /**
    * The display order of the status.
    */
  var DisplayOrder: js.UndefOr[AgentStatusOrderNumber] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the status.
    */
  var Name: AgentStatusName
  
  /**
    * The state of the status.
    */
  var State: AgentStatusState
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAgentStatusRequest {
  
  inline def apply(InstanceId: InstanceId, Name: AgentStatusName, State: AgentStatusState): CreateAgentStatusRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentStatusRequest]
  }
  
  extension [Self <: CreateAgentStatusRequest](x: Self) {
    
    inline def setDescription(value: AgentStatusDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayOrder(value: AgentStatusOrderNumber): Self = StObject.set(x, "DisplayOrder", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrderUndefined: Self = StObject.set(x, "DisplayOrder", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AgentStatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setState(value: AgentStatusState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
