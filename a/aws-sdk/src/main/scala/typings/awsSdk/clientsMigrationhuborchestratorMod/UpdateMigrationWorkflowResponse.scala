package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMigrationWorkflowResponse extends StObject {
  
  /**
    * The ID of the application configured in Application Discovery Service.
    */
  var adsApplicationConfigurationId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the migration workflow.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the migration workflow was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the migration workflow.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var id: js.UndefOr[MigrationWorkflowId] = js.undefined
  
  /**
    * The time at which the migration workflow was last modified.
    */
  var lastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the migration workflow.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the migration workflow.
    */
  var status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined
  
  /**
    * The servers on which a step will be run.
    */
  var stepTargets: js.UndefOr[StringList] = js.undefined
  
  /**
    * The tags added to the migration workflow.
    */
  var tags: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: js.UndefOr[String] = js.undefined
  
  /**
    * The inputs required to update a migration workflow.
    */
  var workflowInputs: js.UndefOr[StepInputParameters] = js.undefined
}
object UpdateMigrationWorkflowResponse {
  
  inline def apply(): UpdateMigrationWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMigrationWorkflowResponse]
  }
  
  extension [Self <: UpdateMigrationWorkflowResponse](x: Self) {
    
    inline def setAdsApplicationConfigurationId(value: String): Self = StObject.set(x, "adsApplicationConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setAdsApplicationConfigurationIdUndefined: Self = StObject.set(x, "adsApplicationConfigurationId", js.undefined)
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: MigrationWorkflowStatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStepTargets(value: StringList): Self = StObject.set(x, "stepTargets", value.asInstanceOf[js.Any])
    
    inline def setStepTargetsUndefined: Self = StObject.set(x, "stepTargets", js.undefined)
    
    inline def setStepTargetsVarargs(value: StringListMember*): Self = StObject.set(x, "stepTargets", js.Array(value*))
    
    inline def setTags(value: StringMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setWorkflowInputs(value: StepInputParameters): Self = StObject.set(x, "workflowInputs", value.asInstanceOf[js.Any])
    
    inline def setWorkflowInputsUndefined: Self = StObject.set(x, "workflowInputs", js.undefined)
  }
}
