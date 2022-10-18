package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkflowStepRequest extends StObject {
  
  /**
    * The description of the step.
    */
  var description: js.UndefOr[StepDescription] = js.undefined
  
  /**
    * The ID of the step.
    */
  var id: StepId
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[StepName] = js.undefined
  
  /**
    * The next step.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The outputs of a step.
    */
  var outputs: js.UndefOr[WorkflowStepOutputList] = js.undefined
  
  /**
    * The previous step.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * The status of the step.
    */
  var status: js.UndefOr[StepStatus] = js.undefined
  
  /**
    * The action type of the step. You must run and update the status of a manual step for the workflow to continue after the completion of the step.
    */
  var stepActionType: js.UndefOr[StepActionType] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: StepGroupId
  
  /**
    * The servers on which a step will be run.
    */
  var stepTarget: js.UndefOr[StringList] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: MigrationWorkflowId
  
  /**
    * The custom script to run tests on the source and target environments.
    */
  var workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration] = js.undefined
}
object UpdateWorkflowStepRequest {
  
  inline def apply(id: StepId, stepGroupId: StepGroupId, workflowId: MigrationWorkflowId): UpdateWorkflowStepRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stepGroupId = stepGroupId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkflowStepRequest]
  }
  
  extension [Self <: UpdateWorkflowStepRequest](x: Self) {
    
    inline def setDescription(value: StepDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: StepId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: StepName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setOutputs(value: WorkflowStepOutputList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: WorkflowStepOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setStatus(value: StepStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStepActionType(value: StepActionType): Self = StObject.set(x, "stepActionType", value.asInstanceOf[js.Any])
    
    inline def setStepActionTypeUndefined: Self = StObject.set(x, "stepActionType", js.undefined)
    
    inline def setStepGroupId(value: StepGroupId): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setStepTarget(value: StringList): Self = StObject.set(x, "stepTarget", value.asInstanceOf[js.Any])
    
    inline def setStepTargetUndefined: Self = StObject.set(x, "stepTarget", js.undefined)
    
    inline def setStepTargetVarargs(value: StringListMember*): Self = StObject.set(x, "stepTarget", js.Array(value*))
    
    inline def setWorkflowId(value: MigrationWorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepAutomationConfiguration(value: WorkflowStepAutomationConfiguration): Self = StObject.set(x, "workflowStepAutomationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepAutomationConfigurationUndefined: Self = StObject.set(x, "workflowStepAutomationConfiguration", js.undefined)
  }
}
