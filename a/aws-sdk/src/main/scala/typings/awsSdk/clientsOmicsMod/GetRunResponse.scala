package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRunResponse extends StObject {
  
  /**
    *  The computational accelerator used to run the workflow. 
    */
  var accelerators: js.UndefOr[Accelerators] = js.undefined
  
  /**
    * The run's ARN.
    */
  var arn: js.UndefOr[RunArn] = js.undefined
  
  /**
    * When the run was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The run's definition.
    */
  var definition: js.UndefOr[WorkflowDefinition] = js.undefined
  
  /**
    * The run's digest.
    */
  var digest: js.UndefOr[WorkflowDigest] = js.undefined
  
  /**
    * The run's ID.
    */
  var id: js.UndefOr[RunId] = js.undefined
  
  /**
    * The run's log level.
    */
  var logLevel: js.UndefOr[RunLogLevel] = js.undefined
  
  /**
    * The run's name.
    */
  var name: js.UndefOr[RunName] = js.undefined
  
  /**
    * The run's output URI.
    */
  var outputUri: js.UndefOr[RunOutputUri] = js.undefined
  
  /**
    * The run's parameters.
    */
  var parameters: js.UndefOr[RunParameters] = js.undefined
  
  /**
    * The run's priority.
    */
  var priority: js.UndefOr[GetRunResponsePriorityInteger] = js.undefined
  
  /**
    * The run's resource digests.
    */
  var resourceDigests: js.UndefOr[RunResourceDigests] = js.undefined
  
  /**
    * The run's service role ARN.
    */
  var roleArn: js.UndefOr[RunRoleArn] = js.undefined
  
  /**
    * The run's group ID.
    */
  var runGroupId: js.UndefOr[RunGroupId] = js.undefined
  
  /**
    * The run's ID.
    */
  var runId: js.UndefOr[RunId] = js.undefined
  
  /**
    * When the run started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Who started the run.
    */
  var startedBy: js.UndefOr[RunStartedBy] = js.undefined
  
  /**
    * The run's status.
    */
  var status: js.UndefOr[RunStatus] = js.undefined
  
  /**
    * The run's status message.
    */
  var statusMessage: js.UndefOr[RunStatusMessage] = js.undefined
  
  /**
    * The run's stop time.
    */
  var stopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The run's storage capacity in gigabytes.
    */
  var storageCapacity: js.UndefOr[GetRunResponseStorageCapacityInteger] = js.undefined
  
  /**
    * The run's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The run's workflow ID.
    */
  var workflowId: js.UndefOr[WorkflowId] = js.undefined
  
  /**
    * The run's workflow type.
    */
  var workflowType: js.UndefOr[WorkflowType] = js.undefined
}
object GetRunResponse {
  
  inline def apply(): GetRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRunResponse] (val x: Self) extends AnyVal {
    
    inline def setAccelerators(value: Accelerators): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setArn(value: RunArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDefinition(value: WorkflowDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDigest(value: WorkflowDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setId(value: RunId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogLevel(value: RunLogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setName(value: RunName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputUri(value: RunOutputUri): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    inline def setParameters(value: RunParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPriority(value: GetRunResponsePriorityInteger): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setResourceDigests(value: RunResourceDigests): Self = StObject.set(x, "resourceDigests", value.asInstanceOf[js.Any])
    
    inline def setResourceDigestsUndefined: Self = StObject.set(x, "resourceDigests", js.undefined)
    
    inline def setRoleArn(value: RunRoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setRunGroupId(value: RunGroupId): Self = StObject.set(x, "runGroupId", value.asInstanceOf[js.Any])
    
    inline def setRunGroupIdUndefined: Self = StObject.set(x, "runGroupId", js.undefined)
    
    inline def setRunId(value: RunId): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "runId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStartedBy(value: RunStartedBy): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
    
    inline def setStatus(value: RunStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: RunStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopTime(value: js.Date): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    inline def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
    
    inline def setStorageCapacity(value: GetRunResponseStorageCapacityInteger): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkflowId(value: WorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTypeUndefined: Self = StObject.set(x, "workflowType", js.undefined)
  }
}
