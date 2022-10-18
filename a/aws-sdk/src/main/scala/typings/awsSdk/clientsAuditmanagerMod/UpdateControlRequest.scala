package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateControlRequest extends StObject {
  
  /**
    *  The recommended actions to carry out if the control isn't fulfilled. 
    */
  var actionPlanInstructions: js.UndefOr[ActionPlanInstructions] = js.undefined
  
  /**
    *  The title of the action plan for remediating the control. 
    */
  var actionPlanTitle: js.UndefOr[ActionPlanTitle] = js.undefined
  
  /**
    *  The identifier for the control. 
    */
  var controlId: UUID
  
  /**
    *  The data mapping sources for the control. 
    */
  var controlMappingSources: ControlMappingSources
  
  /**
    *  The optional description of the control. 
    */
  var description: js.UndefOr[ControlDescription] = js.undefined
  
  /**
    *  The name of the updated control. 
    */
  var name: ControlName
  
  /**
    *  The steps that you should follow to determine if the control is met. 
    */
  var testingInformation: js.UndefOr[TestingInformation] = js.undefined
}
object UpdateControlRequest {
  
  inline def apply(controlId: UUID, controlMappingSources: ControlMappingSources, name: ControlName): UpdateControlRequest = {
    val __obj = js.Dynamic.literal(controlId = controlId.asInstanceOf[js.Any], controlMappingSources = controlMappingSources.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateControlRequest]
  }
  
  extension [Self <: UpdateControlRequest](x: Self) {
    
    inline def setActionPlanInstructions(value: ActionPlanInstructions): Self = StObject.set(x, "actionPlanInstructions", value.asInstanceOf[js.Any])
    
    inline def setActionPlanInstructionsUndefined: Self = StObject.set(x, "actionPlanInstructions", js.undefined)
    
    inline def setActionPlanTitle(value: ActionPlanTitle): Self = StObject.set(x, "actionPlanTitle", value.asInstanceOf[js.Any])
    
    inline def setActionPlanTitleUndefined: Self = StObject.set(x, "actionPlanTitle", js.undefined)
    
    inline def setControlId(value: UUID): Self = StObject.set(x, "controlId", value.asInstanceOf[js.Any])
    
    inline def setControlMappingSources(value: ControlMappingSources): Self = StObject.set(x, "controlMappingSources", value.asInstanceOf[js.Any])
    
    inline def setControlMappingSourcesVarargs(value: ControlMappingSource*): Self = StObject.set(x, "controlMappingSources", js.Array(value*))
    
    inline def setDescription(value: ControlDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ControlName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTestingInformation(value: TestingInformation): Self = StObject.set(x, "testingInformation", value.asInstanceOf[js.Any])
    
    inline def setTestingInformationUndefined: Self = StObject.set(x, "testingInformation", js.undefined)
  }
}
