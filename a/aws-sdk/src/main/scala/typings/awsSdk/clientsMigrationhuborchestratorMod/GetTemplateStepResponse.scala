package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateStepResponse extends StObject {
  
  /**
    * The time at which the step was created.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the step.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the step.
    */
  var id: js.UndefOr[StepId] = js.undefined
  
  /**
    * The name of the step.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The next step.
    */
  var next: js.UndefOr[StringList] = js.undefined
  
  /**
    * The outputs of the step.
    */
  var outputs: js.UndefOr[StepOutputList] = js.undefined
  
  /**
    * The previous step.
    */
  var previous: js.UndefOr[StringList] = js.undefined
  
  /**
    * The action type of the step. You must run and update the status of a manual step for the workflow to continue after the completion of the step.
    */
  var stepActionType: js.UndefOr[StepActionType] = js.undefined
  
  /**
    * The custom script to run tests on source or target environments.
    */
  var stepAutomationConfiguration: js.UndefOr[StepAutomationConfiguration] = js.undefined
  
  /**
    * The ID of the step group.
    */
  var stepGroupId: js.UndefOr[StepGroupId] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: js.UndefOr[TemplateId] = js.undefined
}
object GetTemplateStepResponse {
  
  inline def apply(): GetTemplateStepResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateStepResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateStepResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: StepId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNext(value: StringList): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: StringListMember*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setOutputs(value: StepOutputList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: StepOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setPrevious(value: StringList): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setPreviousVarargs(value: StringListMember*): Self = StObject.set(x, "previous", js.Array(value*))
    
    inline def setStepActionType(value: StepActionType): Self = StObject.set(x, "stepActionType", value.asInstanceOf[js.Any])
    
    inline def setStepActionTypeUndefined: Self = StObject.set(x, "stepActionType", js.undefined)
    
    inline def setStepAutomationConfiguration(value: StepAutomationConfiguration): Self = StObject.set(x, "stepAutomationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStepAutomationConfigurationUndefined: Self = StObject.set(x, "stepAutomationConfiguration", js.undefined)
    
    inline def setStepGroupId(value: StepGroupId): Self = StObject.set(x, "stepGroupId", value.asInstanceOf[js.Any])
    
    inline def setStepGroupIdUndefined: Self = StObject.set(x, "stepGroupId", js.undefined)
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
