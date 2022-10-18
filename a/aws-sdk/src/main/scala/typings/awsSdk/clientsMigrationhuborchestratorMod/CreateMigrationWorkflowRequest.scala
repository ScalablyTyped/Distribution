package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMigrationWorkflowRequest extends StObject {
  
  /**
    * The configuration ID of the application configured in Application Discovery Service.
    */
  var applicationConfigurationId: CreateMigrationWorkflowRequestApplicationConfigurationIdString
  
  /**
    * The description of the migration workflow.
    */
  var description: js.UndefOr[CreateMigrationWorkflowRequestDescriptionString] = js.undefined
  
  /**
    * The input parameters required to create a migration workflow.
    */
  var inputParameters: StepInputParameters
  
  /**
    * The name of the migration workflow.
    */
  var name: CreateMigrationWorkflowRequestNameString
  
  /**
    * The servers on which a step will be run.
    */
  var stepTargets: js.UndefOr[StringList] = js.undefined
  
  /**
    * The tags to add on a migration workflow.
    */
  var tags: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: CreateMigrationWorkflowRequestTemplateIdString
}
object CreateMigrationWorkflowRequest {
  
  inline def apply(
    applicationConfigurationId: CreateMigrationWorkflowRequestApplicationConfigurationIdString,
    inputParameters: StepInputParameters,
    name: CreateMigrationWorkflowRequestNameString,
    templateId: CreateMigrationWorkflowRequestTemplateIdString
  ): CreateMigrationWorkflowRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId.asInstanceOf[js.Any], inputParameters = inputParameters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMigrationWorkflowRequest]
  }
  
  extension [Self <: CreateMigrationWorkflowRequest](x: Self) {
    
    inline def setApplicationConfigurationId(value: CreateMigrationWorkflowRequestApplicationConfigurationIdString): Self = StObject.set(x, "applicationConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: CreateMigrationWorkflowRequestDescriptionString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInputParameters(value: StepInputParameters): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
    
    inline def setName(value: CreateMigrationWorkflowRequestNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStepTargets(value: StringList): Self = StObject.set(x, "stepTargets", value.asInstanceOf[js.Any])
    
    inline def setStepTargetsUndefined: Self = StObject.set(x, "stepTargets", js.undefined)
    
    inline def setStepTargetsVarargs(value: StringListMember*): Self = StObject.set(x, "stepTargets", js.Array(value*))
    
    inline def setTags(value: StringMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateId(value: CreateMigrationWorkflowRequestTemplateIdString): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
  }
}
