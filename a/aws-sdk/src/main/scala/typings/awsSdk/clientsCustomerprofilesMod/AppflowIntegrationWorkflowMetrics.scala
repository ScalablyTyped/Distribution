package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppflowIntegrationWorkflowMetrics extends StObject {
  
  /**
    * Number of records processed in APPFLOW_INTEGRATION workflow.
    */
  var RecordsProcessed: long
  
  /**
    * Total steps completed in APPFLOW_INTEGRATION workflow.
    */
  var StepsCompleted: long
  
  /**
    * Total steps in APPFLOW_INTEGRATION workflow.
    */
  var TotalSteps: long
}
object AppflowIntegrationWorkflowMetrics {
  
  inline def apply(RecordsProcessed: long, StepsCompleted: long, TotalSteps: long): AppflowIntegrationWorkflowMetrics = {
    val __obj = js.Dynamic.literal(RecordsProcessed = RecordsProcessed.asInstanceOf[js.Any], StepsCompleted = StepsCompleted.asInstanceOf[js.Any], TotalSteps = TotalSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppflowIntegrationWorkflowMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppflowIntegrationWorkflowMetrics] (val x: Self) extends AnyVal {
    
    inline def setRecordsProcessed(value: long): Self = StObject.set(x, "RecordsProcessed", value.asInstanceOf[js.Any])
    
    inline def setStepsCompleted(value: long): Self = StObject.set(x, "StepsCompleted", value.asInstanceOf[js.Any])
    
    inline def setTotalSteps(value: long): Self = StObject.set(x, "TotalSteps", value.asInstanceOf[js.Any])
  }
}
