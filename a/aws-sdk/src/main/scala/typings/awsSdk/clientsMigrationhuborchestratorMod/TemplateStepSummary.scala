package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateStepSummary extends StObject {
  
  /**
    * The ID of the step.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The next step.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The owner of the step.
    */
  var owner: js.UndefOr[Owner] = js.undefined
  
  /**
    * The previous step.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * The action type of the step. You must run and update the status of a manual step for the workflow to continue after the completion of the step.
    */
  var stepActionType: js.UndefOr[StepActionType] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The servers on which to run the script.
    */
  var targetType: js.UndefOr[TargetType] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object TemplateStepSummary {
  
  inline def apply(): TemplateStepSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateStepSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateStepSummary] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setStepActionType(value: StepActionType): Self = StObject.set(x, "stepActionType", value.asInstanceOf[js.Any])
    
    inline def setStepActionTypeUndefined: Self = StObject.set(x, "stepActionType", js.undefined)
    
    inline def setStepGroupId(value: String): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setStepGroupIdUndefined: Self = StObject.set(x, "stepGroupId", js.undefined)
    
    inline def setTargetType(value: TargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
