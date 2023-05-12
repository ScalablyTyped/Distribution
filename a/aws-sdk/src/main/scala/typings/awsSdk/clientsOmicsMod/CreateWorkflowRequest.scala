package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowRequest extends StObject {
  
  /**
    *  The computational accelerator specified to run the workflow. 
    */
  var accelerators: js.UndefOr[Accelerators] = js.undefined
  
  /**
    * The URI of a definition for the workflow.
    */
  var definitionUri: js.UndefOr[WorkflowDefinition] = js.undefined
  
  /**
    * A ZIP archive for the workflow.
    */
  var definitionZip: js.UndefOr[_Blob] = js.undefined
  
  /**
    * A description for the workflow.
    */
  var description: js.UndefOr[WorkflowDescription] = js.undefined
  
  /**
    * An engine for the workflow.
    */
  var engine: js.UndefOr[WorkflowEngine] = js.undefined
  
  /**
    * The path of the main definition file for the workflow.
    */
  var main: js.UndefOr[WorkflowMain] = js.undefined
  
  /**
    * A name for the workflow.
    */
  var name: js.UndefOr[WorkflowName] = js.undefined
  
  /**
    * A parameter template for the workflow.
    */
  var parameterTemplate: js.UndefOr[WorkflowParameterTemplate] = js.undefined
  
  /**
    * To ensure that requests don't run multiple times, specify a unique ID for each request.
    */
  var requestId: WorkflowRequestId
  
  /**
    * A storage capacity for the workflow in gigabytes.
    */
  var storageCapacity: js.UndefOr[CreateWorkflowRequestStorageCapacityInteger] = js.undefined
  
  /**
    * Tags for the workflow.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateWorkflowRequest {
  
  inline def apply(requestId: WorkflowRequestId): CreateWorkflowRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setAccelerators(value: Accelerators): Self = StObject.set(x, "accelerators", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorsUndefined: Self = StObject.set(x, "accelerators", js.undefined)
    
    inline def setDefinitionUri(value: WorkflowDefinition): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUriUndefined: Self = StObject.set(x, "definitionUri", js.undefined)
    
    inline def setDefinitionZip(value: _Blob): Self = StObject.set(x, "definitionZip", value.asInstanceOf[js.Any])
    
    inline def setDefinitionZipUndefined: Self = StObject.set(x, "definitionZip", js.undefined)
    
    inline def setDescription(value: WorkflowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEngine(value: WorkflowEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setMain(value: WorkflowMain): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setName(value: WorkflowName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParameterTemplate(value: WorkflowParameterTemplate): Self = StObject.set(x, "parameterTemplate", value.asInstanceOf[js.Any])
    
    inline def setParameterTemplateUndefined: Self = StObject.set(x, "parameterTemplate", js.undefined)
    
    inline def setRequestId(value: WorkflowRequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacity(value: CreateWorkflowRequestStorageCapacityInteger): Self = StObject.set(x, "storageCapacity", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityUndefined: Self = StObject.set(x, "storageCapacity", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
