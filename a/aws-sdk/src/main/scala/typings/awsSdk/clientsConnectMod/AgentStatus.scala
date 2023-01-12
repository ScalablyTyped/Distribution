package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentStatus extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent status.
    */
  var AgentStatusARN: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the agent status.
    */
  var AgentStatusId: js.UndefOr[typings.awsSdk.clientsConnectMod.AgentStatusId] = js.undefined
  
  /**
    * The description of the agent status.
    */
  var Description: js.UndefOr[AgentStatusDescription] = js.undefined
  
  /**
    * The display order of the agent status.
    */
  var DisplayOrder: js.UndefOr[AgentStatusOrderNumber] = js.undefined
  
  /**
    * The name of the agent status.
    */
  var Name: js.UndefOr[AgentStatusName] = js.undefined
  
  /**
    * The state of the agent status.
    */
  var State: js.UndefOr[AgentStatusState] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of agent status.
    */
  var Type: js.UndefOr[AgentStatusType] = js.undefined
}
object AgentStatus {
  
  inline def apply(): AgentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentStatus] (val x: Self) extends AnyVal {
    
    inline def setAgentStatusARN(value: ARN): Self = StObject.set(x, "AgentStatusARN", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusARNUndefined: Self = StObject.set(x, "AgentStatusARN", js.undefined)
    
    inline def setAgentStatusId(value: AgentStatusId): Self = StObject.set(x, "AgentStatusId", value.asInstanceOf[js.Any])
    
    inline def setAgentStatusIdUndefined: Self = StObject.set(x, "AgentStatusId", js.undefined)
    
    inline def setDescription(value: AgentStatusDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisplayOrder(value: AgentStatusOrderNumber): Self = StObject.set(x, "DisplayOrder", value.asInstanceOf[js.Any])
    
    inline def setDisplayOrderUndefined: Self = StObject.set(x, "DisplayOrder", js.undefined)
    
    inline def setName(value: AgentStatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: AgentStatusState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: AgentStatusType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
