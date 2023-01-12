package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMigrationWorkflowRequest extends StObject {
  
  /**
    * The description of the migration workflow.
    */
  var description: js.UndefOr[UpdateMigrationWorkflowRequestDescriptionString] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var id: MigrationWorkflowId
  
  /**
    * The input parameters required to update a migration workflow.
    */
  var inputParameters: js.UndefOr[StepInputParameters] = js.undefined
  
  /**
    * The name of the migration workflow.
    */
  var name: js.UndefOr[UpdateMigrationWorkflowRequestNameString] = js.undefined
  
  /**
    * The servers on which a step will be run.
    */
  var stepTargets: js.UndefOr[StringList] = js.undefined
}
object UpdateMigrationWorkflowRequest {
  
  inline def apply(id: MigrationWorkflowId): UpdateMigrationWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMigrationWorkflowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMigrationWorkflowRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: UpdateMigrationWorkflowRequestDescriptionString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputParameters(value: StepInputParameters): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
    
    inline def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
    
    inline def setName(value: UpdateMigrationWorkflowRequestNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStepTargets(value: StringList): Self = StObject.set(x, "stepTargets", value.asInstanceOf[js.Any])
    
    inline def setStepTargetsUndefined: Self = StObject.set(x, "stepTargets", js.undefined)
    
    inline def setStepTargetsVarargs(value: StringListMember*): Self = StObject.set(x, "stepTargets", js.Array(value*))
  }
}
