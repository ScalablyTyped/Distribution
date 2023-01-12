package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowAttributes extends StObject {
  
  /**
    * Workflow attributes specific to APPFLOW_INTEGRATION workflow.
    */
  var AppflowIntegration: js.UndefOr[AppflowIntegrationWorkflowAttributes] = js.undefined
}
object WorkflowAttributes {
  
  inline def apply(): WorkflowAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkflowAttributes] (val x: Self) extends AnyVal {
    
    inline def setAppflowIntegration(value: AppflowIntegrationWorkflowAttributes): Self = StObject.set(x, "AppflowIntegration", value.asInstanceOf[js.Any])
    
    inline def setAppflowIntegrationUndefined: Self = StObject.set(x, "AppflowIntegration", js.undefined)
  }
}
