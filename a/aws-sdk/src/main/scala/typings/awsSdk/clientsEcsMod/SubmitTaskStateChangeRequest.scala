package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitTaskStateChangeRequest extends StObject {
  
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: js.UndefOr[AttachmentStateChanges] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Any containers that's associated with the state change request.
    */
  var containers: js.UndefOr[ContainerStateChanges] = js.undefined
  
  /**
    * The Unix timestamp for the time when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The details for the managed agent that's associated with the task.
    */
  var managedAgents: js.UndefOr[ManagedAgentStateChanges] = js.undefined
  
  /**
    * The Unix timestamp for the time when the container image pull started.
    */
  var pullStartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Unix timestamp for the time when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The task ID or full ARN of the task in the state change request.
    */
  var task: js.UndefOr[String] = js.undefined
}
object SubmitTaskStateChangeRequest {
  
  inline def apply(): SubmitTaskStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitTaskStateChangeRequest]
  }
  
  extension [Self <: SubmitTaskStateChangeRequest](x: Self) {
    
    inline def setAttachments(value: AttachmentStateChanges): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AttachmentStateChange*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainers(value: ContainerStateChanges): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: ContainerStateChange*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setExecutionStoppedAt(value: js.Date): Self = StObject.set(x, "executionStoppedAt", value.asInstanceOf[js.Any])
    
    inline def setExecutionStoppedAtUndefined: Self = StObject.set(x, "executionStoppedAt", js.undefined)
    
    inline def setManagedAgents(value: ManagedAgentStateChanges): Self = StObject.set(x, "managedAgents", value.asInstanceOf[js.Any])
    
    inline def setManagedAgentsUndefined: Self = StObject.set(x, "managedAgents", js.undefined)
    
    inline def setManagedAgentsVarargs(value: ManagedAgentStateChange*): Self = StObject.set(x, "managedAgents", js.Array(value*))
    
    inline def setPullStartedAt(value: js.Date): Self = StObject.set(x, "pullStartedAt", value.asInstanceOf[js.Any])
    
    inline def setPullStartedAtUndefined: Self = StObject.set(x, "pullStartedAt", js.undefined)
    
    inline def setPullStoppedAt(value: js.Date): Self = StObject.set(x, "pullStoppedAt", value.asInstanceOf[js.Any])
    
    inline def setPullStoppedAtUndefined: Self = StObject.set(x, "pullStoppedAt", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
