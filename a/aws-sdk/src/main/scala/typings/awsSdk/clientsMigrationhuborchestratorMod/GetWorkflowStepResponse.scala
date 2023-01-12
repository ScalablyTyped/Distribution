package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowStepResponse extends StObject {
  
  /**
    * The time at which the step was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the step.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the step ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the workflow was last started.
    */
  var lastStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The next step.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The number of servers that have been migrated.
    */
  var noOfSrvCompleted: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of servers that have failed to migrate.
    */
  var noOfSrvFailed: js.UndefOr[Integer] = js.undefined
  
  /**
    * The outputs of the step.
    */
  var outputs: js.UndefOr[GetWorkflowStepResponseOutputsList] = js.undefined
  
  /**
    * The owner of the step.
    */
  var owner: js.UndefOr[Owner] = js.undefined
  
  /**
    * The previous step.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * The output location of the script.
    */
  var scriptOutputLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the step.
    */
  var status: js.UndefOr[StepStatus] = js.undefined
  
  /**
    * The status message of the migration workflow.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The action type of the step. You must run and update the status of a manual step for the workflow to continue after the completion of the step.
    */
  var stepActionType: js.UndefOr[StepActionType] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the step.
    */
  var stepId: js.UndefOr[String] = js.undefined
  
  /**
    * The servers on which a step will be run.
    */
  var stepTarget: js.UndefOr[StringList] = js.undefined
  
  /**
    * The total number of servers that have been migrated.
    */
  var totalNoOfSrv: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var workflowId: js.UndefOr[String] = js.undefined
  
  /**
    * The custom script to run tests on source or target environments.
    */
  var workflowStepAutomationConfiguration: js.UndefOr[WorkflowStepAutomationConfiguration] = js.undefined
}
object GetWorkflowStepResponse {
  
  inline def apply(): GetWorkflowStepResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowStepResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWorkflowStepResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setLastStartTime(value: js.Date): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setNoOfSrvCompleted(value: Integer): Self = StObject.set(x, "noOfSrvCompleted", value.asInstanceOf[js.Any])
    
    inline def setNoOfSrvCompletedUndefined: Self = StObject.set(x, "noOfSrvCompleted", js.undefined)
    
    inline def setNoOfSrvFailed(value: Integer): Self = StObject.set(x, "noOfSrvFailed", value.asInstanceOf[js.Any])
    
    inline def setNoOfSrvFailedUndefined: Self = StObject.set(x, "noOfSrvFailed", js.undefined)
    
    inline def setOutputs(value: GetWorkflowStepResponseOutputsList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: WorkflowStepOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setScriptOutputLocation(value: String): Self = StObject.set(x, "scriptOutputLocation", value.asInstanceOf[js.Any])
    
    inline def setScriptOutputLocationUndefined: Self = StObject.set(x, "scriptOutputLocation", js.undefined)
    
    inline def setStatus(value: StepStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStepActionType(value: StepActionType): Self = StObject.set(x, "stepActionType", value.asInstanceOf[js.Any])
    
    inline def setStepActionTypeUndefined: Self = StObject.set(x, "stepActionType", js.undefined)
    
    inline def setStepGroupId(value: String): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setStepGroupIdUndefined: Self = StObject.set(x, "stepGroupId", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
    
    inline def setStepTarget(value: StringList): Self = StObject.set(x, "stepTarget", value.asInstanceOf[js.Any])
    
    inline def setStepTargetUndefined: Self = StObject.set(x, "stepTarget", js.undefined)
    
    inline def setStepTargetVarargs(value: StringListMember*): Self = StObject.set(x, "stepTarget", js.Array(value*))
    
    inline def setTotalNoOfSrv(value: Integer): Self = StObject.set(x, "totalNoOfSrv", value.asInstanceOf[js.Any])
    
    inline def setTotalNoOfSrvUndefined: Self = StObject.set(x, "totalNoOfSrv", js.undefined)
    
    inline def setWorkflowId(value: String): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
    
    inline def setWorkflowStepAutomationConfiguration(value: WorkflowStepAutomationConfiguration): Self = StObject.set(x, "workflowStepAutomationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWorkflowStepAutomationConfigurationUndefined: Self = StObject.set(x, "workflowStepAutomationConfiguration", js.undefined)
  }
}
