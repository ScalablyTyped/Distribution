package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentStatusRequest extends StObject {
  
  /**
    * UUID of agent to update.
    */
  var agentId: Uuid
  
  /**
    * Aggregate status for agent.
    */
  var aggregateStatus: AggregateStatus
  
  /**
    * List of component statuses for agent.
    */
  var componentStatuses: ComponentStatusList
  
  /**
    * GUID of agent task.
    */
  var taskId: Uuid
}
object UpdateAgentStatusRequest {
  
  inline def apply(
    agentId: Uuid,
    aggregateStatus: AggregateStatus,
    componentStatuses: ComponentStatusList,
    taskId: Uuid
  ): UpdateAgentStatusRequest = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any], aggregateStatus = aggregateStatus.asInstanceOf[js.Any], componentStatuses = componentStatuses.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAgentStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAgentId(value: Uuid): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAggregateStatus(value: AggregateStatus): Self = StObject.set(x, "aggregateStatus", value.asInstanceOf[js.Any])
    
    inline def setComponentStatuses(value: ComponentStatusList): Self = StObject.set(x, "componentStatuses", value.asInstanceOf[js.Any])
    
    inline def setComponentStatusesVarargs(value: ComponentStatusData*): Self = StObject.set(x, "componentStatuses", js.Array(value*))
    
    inline def setTaskId(value: Uuid): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
