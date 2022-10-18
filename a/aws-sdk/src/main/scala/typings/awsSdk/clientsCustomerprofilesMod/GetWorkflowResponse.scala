package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowResponse extends StObject {
  
  /**
    * Attributes provided for workflow execution.
    */
  var Attributes: js.UndefOr[WorkflowAttributes] = js.undefined
  
  /**
    * Workflow error messages during execution (if any).
    */
  var ErrorDescription: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The timestamp that represents when workflow execution last updated.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Workflow specific execution metrics.
    */
  var Metrics: js.UndefOr[WorkflowMetrics] = js.undefined
  
  /**
    * The timestamp that represents when workflow execution started.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status of workflow execution.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.Status] = js.undefined
  
  /**
    * Unique identifier for the workflow.
    */
  var WorkflowId: js.UndefOr[uuid] = js.undefined
  
  /**
    * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
    */
  var WorkflowType: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.WorkflowType] = js.undefined
}
object GetWorkflowResponse {
  
  inline def apply(): GetWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowResponse]
  }
  
  extension [Self <: GetWorkflowResponse](x: Self) {
    
    inline def setAttributes(value: WorkflowAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setErrorDescription(value: string1To255): Self = StObject.set(x, "ErrorDescription", value.asInstanceOf[js.Any])
    
    inline def setErrorDescriptionUndefined: Self = StObject.set(x, "ErrorDescription", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setMetrics(value: WorkflowMetrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkflowId(value: uuid): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "WorkflowId", js.undefined)
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "WorkflowType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowTypeUndefined: Self = StObject.set(x, "WorkflowType", js.undefined)
  }
}
