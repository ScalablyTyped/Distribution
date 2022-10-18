package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationWorkflowSummary extends StObject {
  
  /**
    * The name of the application configured in Application Discovery Service.
    */
  var adsApplicationConfigurationName: js.UndefOr[String] = js.undefined
  
  /**
    * The steps completed in the migration workflow.
    */
  var completedSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time at which the migration workflow was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the migration workflow ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the migration workflow.
    */
  var id: js.UndefOr[MigrationWorkflowId] = js.undefined
  
  /**
    * The name of the migration workflow.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the migration workflow.
    */
  var status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined
  
  /**
    * The status message of the migration workflow.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: js.UndefOr[String] = js.undefined
  
  /**
    * All the steps in a migration workflow.
    */
  var totalSteps: js.UndefOr[Integer] = js.undefined
}
object MigrationWorkflowSummary {
  
  inline def apply(): MigrationWorkflowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrationWorkflowSummary]
  }
  
  extension [Self <: MigrationWorkflowSummary](x: Self) {
    
    inline def setAdsApplicationConfigurationName(value: String): Self = StObject.set(x, "adsApplicationConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setAdsApplicationConfigurationNameUndefined: Self = StObject.set(x, "adsApplicationConfigurationName", js.undefined)
    
    inline def setCompletedSteps(value: Integer): Self = StObject.set(x, "completedSteps", value.asInstanceOf[js.Any])
    
    inline def setCompletedStepsUndefined: Self = StObject.set(x, "completedSteps", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: MigrationWorkflowStatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setTotalSteps(value: Integer): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsUndefined: Self = StObject.set(x, "totalSteps", js.undefined)
  }
}
