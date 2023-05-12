package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRunRequest extends StObject {
  
  /**
    * A log level for the run.
    */
  var logLevel: js.UndefOr[RunLogLevel] = js.undefined
  
  /**
    * A name for the run.
    */
  var name: js.UndefOr[RunName] = js.undefined
  
  /**
    * An output URI for the run.
    */
  var outputUri: js.UndefOr[RunOutputUri] = js.undefined
  
  /**
    * Parameters for the run.
    */
  var parameters: js.UndefOr[RunParameters] = js.undefined
  
  /**
    * A priority for the run.
    */
  var priority: js.UndefOr[StartRunRequestPriorityInteger] = js.undefined
  
  /**
    * To ensure that requests don't run multiple times, specify a unique ID for each request.
    */
  var requestId: RunRequestId
  
  /**
    * A service role for the run.
    */
  var roleArn: RunRoleArn
  
  /**
    * The run's group ID.
    */
  var runGroupId: js.UndefOr[RunGroupId] = js.undefined
  
  /**
    * The run's ID.
    */
  var runId: js.UndefOr[RunId] = js.undefined
  
  /**
    * A storage capacity for the run in gigabytes.
    */
  var storageCapacity: js.UndefOr[StartRunRequestStorageCapacityInteger] = js.undefined
  
  /**
    * Tags for the run.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The run's workflow ID.
    */
  var workflowId: js.UndefOr[WorkflowId] = js.undefined
  
  /**
    * The run's workflows type.
    */
  var workflowType: js.UndefOr[WorkflowType] = js.undefined
}
object StartRunRequest {
  
  inline def apply(requestId: RunRequestId, roleArn: RunRoleArn): StartRunRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRunRequest] (val x: Self) extends AnyVal {
    
    inline def setLogLevel(value: RunLogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setName(value: RunName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputUri(value: RunOutputUri): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    inline def setParameters(value: RunParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPriority(value: StartRunRequestPriorityInteger): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRequestId(value: RunRequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RunRoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRunGroupId(value: RunGroupId): Self = StObject.set(x, "runGroupId", value.asInstanceOf[js.Any])
    
    inline def setRunGroupIdUndefined: Self = StObject.set(x, "runGroupId", js.undefined)
    
    inline def setRunId(value: RunId): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    inline def setStorageCapacity(value: StartRunRequestStorageCapacityInteger): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTypeUndefined: Self = StObject.set(x, "workflowType", js.undefined)
  }
}
