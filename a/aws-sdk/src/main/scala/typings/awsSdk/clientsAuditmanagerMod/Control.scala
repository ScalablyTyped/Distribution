package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  /**
    *  The recommended actions to carry out if the control isn't fulfilled. 
    */
  var actionPlanInstructions: js.UndefOr[ActionPlanInstructions] = js.undefined
  
  /**
    *  The title of the action plan for remediating the control. 
    */
  var actionPlanTitle: js.UndefOr[ActionPlanTitle] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the control. 
    */
  var arn: js.UndefOr[AuditManagerArn] = js.undefined
  
  /**
    *  The data mapping sources for the control. 
    */
  var controlMappingSources: js.UndefOr[ControlMappingSources] = js.undefined
  
  /**
    *  The data source types that determine where Audit Manager collects evidence from for the control. 
    */
  var controlSources: js.UndefOr[ControlSources] = js.undefined
  
  /**
    *  The time when the control was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The user or role that created the control. 
    */
  var createdBy: js.UndefOr[CreatedBy] = js.undefined
  
  /**
    *  The description of the control. 
    */
  var description: js.UndefOr[ControlDescription] = js.undefined
  
  /**
    *  The unique identifier for the control. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The time when the control was most recently updated. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The user or role that most recently updated the control. 
    */
  var lastUpdatedBy: js.UndefOr[LastUpdatedBy] = js.undefined
  
  /**
    *  The name of the control. 
    */
  var name: js.UndefOr[ControlName] = js.undefined
  
  /**
    *  The tags associated with the control. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  The steps that you should follow to determine if the control has been satisfied. 
    */
  var testingInformation: js.UndefOr[TestingInformation] = js.undefined
  
  /**
    *  The type of control, such as a custom control or a standard control. 
    */
  var `type`: js.UndefOr[ControlType] = js.undefined
}
object Control {
  
  inline def apply(): Control = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    inline def setActionPlanInstructions(value: ActionPlanInstructions): Self = StObject.set(x, "actionPlanInstructions", value.asInstanceOf[js.Any])
    
    inline def setActionPlanInstructionsUndefined: Self = StObject.set(x, "actionPlanInstructions", js.undefined)
    
    inline def setActionPlanTitle(value: ActionPlanTitle): Self = StObject.set(x, "actionPlanTitle", value.asInstanceOf[js.Any])
    
    inline def setActionPlanTitleUndefined: Self = StObject.set(x, "actionPlanTitle", js.undefined)
    
    inline def setArn(value: AuditManagerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setControlMappingSources(value: ControlMappingSources): Self = StObject.set(x, "controlMappingSources", value.asInstanceOf[js.Any])
    
    inline def setControlMappingSourcesUndefined: Self = StObject.set(x, "controlMappingSources", js.undefined)
    
    inline def setControlMappingSourcesVarargs(value: ControlMappingSource*): Self = StObject.set(x, "controlMappingSources", js.Array(value*))
    
    inline def setControlSources(value: ControlSources): Self = StObject.set(x, "controlSources", value.asInstanceOf[js.Any])
    
    inline def setControlSourcesUndefined: Self = StObject.set(x, "controlSources", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: ControlDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLastUpdatedBy(value: LastUpdatedBy): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedByUndefined: Self = StObject.set(x, "lastUpdatedBy", js.undefined)
    
    inline def setName(value: ControlName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTestingInformation(value: TestingInformation): Self = StObject.set(x, "testingInformation", value.asInstanceOf[js.Any])
    
    inline def setTestingInformationUndefined: Self = StObject.set(x, "testingInformation", js.undefined)
    
    inline def setType(value: ControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
