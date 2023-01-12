package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateControlRequest extends StObject {
  
  /**
    *  The recommended actions to carry out if the control isn't fulfilled. 
    */
  var actionPlanInstructions: js.UndefOr[ActionPlanInstructions] = js.undefined
  
  /**
    *  The title of the action plan for remediating the control. 
    */
  var actionPlanTitle: js.UndefOr[ActionPlanTitle] = js.undefined
  
  /**
    *  The data mapping sources for the control. 
    */
  var controlMappingSources: CreateControlMappingSources
  
  /**
    *  The description of the control. 
    */
  var description: js.UndefOr[ControlDescription] = js.undefined
  
  /**
    *  The name of the control. 
    */
  var name: ControlName
  
  /**
    *  The tags that are associated with the control. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The steps to follow to determine if the control is satisfied. 
    */
  var testingInformation: js.UndefOr[TestingInformation] = js.undefined
}
object CreateControlRequest {
  
  inline def apply(controlMappingSources: CreateControlMappingSources, name: ControlName): CreateControlRequest = {
    val __obj = js.Dynamic.literal(controlMappingSources = controlMappingSources.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateControlRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateControlRequest] (val x: Self) extends AnyVal {
    
    inline def setActionPlanInstructions(value: ActionPlanInstructions): Self = StObject.set(x, "actionPlanInstructions", value.asInstanceOf[js.Any])
    
    inline def setActionPlanInstructionsUndefined: Self = StObject.set(x, "actionPlanInstructions", js.undefined)
    
    inline def setActionPlanTitle(value: ActionPlanTitle): Self = StObject.set(x, "actionPlanTitle", value.asInstanceOf[js.Any])
    
    inline def setActionPlanTitleUndefined: Self = StObject.set(x, "actionPlanTitle", js.undefined)
    
    inline def setControlMappingSources(value: CreateControlMappingSources): Self = StObject.set(x, "controlMappingSources", value.asInstanceOf[js.Any])
    
    inline def setControlMappingSourcesVarargs(value: CreateControlMappingSource*): Self = StObject.set(x, "controlMappingSources", js.Array(value*))
    
    inline def setDescription(value: ControlDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ControlName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTestingInformation(value: TestingInformation): Self = StObject.set(x, "testingInformation", value.asInstanceOf[js.Any])
    
    inline def setTestingInformationUndefined: Self = StObject.set(x, "testingInformation", js.undefined)
  }
}
