package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowStepRequest extends StObject {
  
  /**
    * The description of the step.
    */
  var description: js.UndefOr[MigrationWorkflowDescription] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: MigrationWorkflowName
  
  /**
    * The next step.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The key value pairs added for the expected output.
    */
  var outputs: js.UndefOr[WorkflowStepOutputList] = js.undefined
  
  /**
    * The previous step.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * The action type of the step. You must run and update the status of a manual step for the workflow to continue after the completion of the step.
    */
  var stepActionType: StepActionType
  
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
    * The custom script to run tests on source or target environments.
    */
  var workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration] = js.undefined
}
object CreateWorkflowStepRequest {
  
  inline def apply(
    name: MigrationWorkflowName,
    stepActionType: StepActionType,
    stepGroupId: StepGroupId,
    workflowId: MigrationWorkflowId
  ): CreateWorkflowStepRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stepActionType = stepActionType.asInstanceOf[js.Any], stepGroupId = stepGroupId.asInstanceOf[js.Any], workflowId = workflowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowStepRequest]
  }
  
  extension [Self <: CreateWorkflowStepRequest](x: Self) {
    
    inline def setDescription(value: MigrationWorkflowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: MigrationWorkflowName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setOutputs(value: WorkflowStepOutputList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: WorkflowStepOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setStepActionType(value: StepActionType): Self = StObject.set(x, "stepActionType", value.asInstanceOf[js.Any])
    
    inline def setStepGroupId(value: StepGroupId): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setStepTarget(value: StringList): Self = StObject.set(x, "stepTarget", value.asInstanceOf[js.Any])
    
    inline def setStepTargetUndefined: Self = StObject.set(x, "stepTarget", js.undefined)
    
    inline def setStepTargetVarargs(value: StringListMember*): Self = StObject.set(x, "stepTarget", js.Array(value*))
    
    inline def setWorkflowId(value: MigrationWorkflowId): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepAutomationConfiguration(value: WorkflowStepAutomationConfiguration): Self = StObject.set(x, "workflowStepAutomationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepAutomationConfigurationUndefined: Self = StObject.set(x, "workflowStepAutomationConfiguration", js.undefined)
  }
}
