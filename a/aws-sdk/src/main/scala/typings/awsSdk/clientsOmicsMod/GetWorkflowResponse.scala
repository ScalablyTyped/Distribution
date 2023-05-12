package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowResponse extends StObject {
  
  /**
    *  The computational accelerator specified to run the workflow. 
    */
  var accelerators: js.UndefOr[Accelerators] = js.undefined
  
  /**
    * The workflow's ARN.
    */
  var arn: js.UndefOr[WorkflowArn] = js.undefined
  
  /**
    * When the workflow was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The workflow's definition.
    */
  var definition: js.UndefOr[WorkflowDefinition] = js.undefined
  
  /**
    * The workflow's description.
    */
  var description: js.UndefOr[WorkflowDescription] = js.undefined
  
  /**
    * The workflow's digest.
    */
  var digest: js.UndefOr[WorkflowDigest] = js.undefined
  
  /**
    * The workflow's engine.
    */
  var engine: js.UndefOr[WorkflowEngine] = js.undefined
  
  /**
    * The workflow's ID.
    */
  var id: js.UndefOr[WorkflowId] = js.undefined
  
  /**
    * The path of the main definition file for the workflow.
    */
  var main: js.UndefOr[WorkflowMain] = js.undefined
  
  /**
    *  Gets metadata for workflow. 
    */
  var metadata: js.UndefOr[WorkflowMetadata] = js.undefined
  
  /**
    * The workflow's name.
    */
  var name: js.UndefOr[WorkflowName] = js.undefined
  
  /**
    * The workflow's parameter template.
    */
  var parameterTemplate: js.UndefOr[WorkflowParameterTemplate] = js.undefined
  
  /**
    * The workflow's status.
    */
  var status: js.UndefOr[WorkflowStatus] = js.undefined
  
  /**
    * The workflow's status message.
    */
  var statusMessage: js.UndefOr[WorkflowStatusMessage] = js.undefined
  
  /**
    * The workflow's storage capacity in gigabytes.
    */
  var storageCapacity: js.UndefOr[GetWorkflowResponseStorageCapacityInteger] = js.undefined
  
  /**
    * The workflow's tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The workflow's type.
    */
  var `type`: js.UndefOr[WorkflowType] = js.undefined
}
object GetWorkflowResponse {
  
  inline def apply(): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowResponse] (val x: Self) extends AnyVal {
    
    inline def setAccelerators(value: Accelerators): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setArn(value: WorkflowArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDefinition(value: WorkflowDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDescription(value: WorkflowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDigest(value: WorkflowDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setEngine(value: WorkflowEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setId(value: WorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMain(value: WorkflowMain): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setMetadata(value: WorkflowMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: WorkflowName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameterTemplate(value: WorkflowParameterTemplate): Self = StObject.set(x, "parameterTemplate", value.asInstanceOf[js.Any])
    
    inline def setParameterTemplateUndefined: Self = StObject.set(x, "parameterTemplate", js.undefined)
    
    inline def setStatus(value: WorkflowStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: WorkflowStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStorageCapacity(value: GetWorkflowResponseStorageCapacityInteger): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: WorkflowType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
