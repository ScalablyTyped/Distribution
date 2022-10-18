package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowStepItem extends StObject {
  
  /**
    * Workflow step information specific to APPFLOW_INTEGRATION workflow.
    */
  var AppflowIntegration: js.UndefOr[AppflowIntegrationWorkflowStep] = js.undefined
}
object WorkflowStepItem {
  
  inline def apply(): WorkflowStepItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowStepItem]
  }
  
  extension [Self <: WorkflowStepItem](x: Self) {
    
    inline def setAppflowIntegration(value: AppflowIntegrationWorkflowStep): Self = StObject.set(x, "AppflowIntegration", value.asInstanceOf[js.Any])
    
    inline def setAppflowIntegrationUndefined: Self = StObject.set(x, "AppflowIntegration", js.undefined)
  }
}
