package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowMetrics extends StObject {
  
  /**
    * Workflow execution metrics for APPFLOW_INTEGRATION workflow.
    */
  var AppflowIntegration: js.UndefOr[AppflowIntegrationWorkflowMetrics] = js.undefined
}
object WorkflowMetrics {
  
  inline def apply(): WorkflowMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowMetrics]
  }
  
  extension [Self <: WorkflowMetrics](x: Self) {
    
    inline def setAppflowIntegration(value: AppflowIntegrationWorkflowMetrics): Self = StObject.set(x, "AppflowIntegration", value.asInstanceOf[js.Any])
    
    inline def setAppflowIntegrationUndefined: Self = StObject.set(x, "AppflowIntegration", js.undefined)
  }
}
