package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowStepMetadata extends StObject {
  
  /**
    * The step action name.
    */
  var action: js.UndefOr[WorkflowStepAction] = js.undefined
  
  /**
    * Description of the workflow step.
    */
  var description: js.UndefOr[WorkflowStepDescription] = js.undefined
  
  /**
    * The timestamp when the workflow step finished.
    */
  var endTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Input parameters that Image Builder provides for the workflow step.
    */
  var inputs: js.UndefOr[WorkflowStepInputs] = js.undefined
  
  /**
    * Detailed output message that the workflow step provides at runtime.
    */
  var message: js.UndefOr[WorkflowStepMessage] = js.undefined
  
  /**
    * The name of the workflow step.
    */
  var name: js.UndefOr[WorkflowStepName] = js.undefined
  
  /**
    * The file names that the workflow step created as output for this runtime instance of the workflow.
    */
  var outputs: js.UndefOr[WorkflowStepOutputs] = js.undefined
  
  /**
    * Reports on the rollback status of the step, if applicable.
    */
  var rollbackStatus: js.UndefOr[WorkflowStepExecutionRollbackStatus] = js.undefined
  
  /**
    * The timestamp when the workflow step started.
    */
  var startTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Runtime status for the workflow step.
    */
  var status: js.UndefOr[WorkflowStepExecutionStatus] = js.undefined
  
  /**
    * A unique identifier for the workflow step, assigned at runtime.
    */
  var stepExecutionId: js.UndefOr[WorkflowStepExecutionId] = js.undefined
}
object WorkflowStepMetadata {
  
  inline def apply(): WorkflowStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowStepMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowStepMetadata] (val x: Self) extends AnyVal {
    
    inline def setAction(value: WorkflowStepAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: WorkflowStepDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: DateTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setInputs(value: WorkflowStepInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setMessage(value: WorkflowStepMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: WorkflowStepName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutputs(value: WorkflowStepOutputs): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setRollbackStatus(value: WorkflowStepExecutionRollbackStatus): Self = StObject.set(x, "rollbackStatus", value.asInstanceOf[js.Any])
    
    inline def setRollbackStatusUndefined: Self = StObject.set(x, "rollbackStatus", js.undefined)
    
    inline def setStartTime(value: DateTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: WorkflowStepExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStepExecutionId(value: WorkflowStepExecutionId): Self = StObject.set(x, "stepExecutionId", value.asInstanceOf[js.Any])
    
    inline def setStepExecutionIdUndefined: Self = StObject.set(x, "stepExecutionId", js.undefined)
  }
}
