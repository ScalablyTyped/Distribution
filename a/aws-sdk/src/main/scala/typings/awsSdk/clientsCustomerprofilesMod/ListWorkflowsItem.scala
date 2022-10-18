package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkflowsItem extends StObject {
  
  /**
    * Creation timestamp for workflow.
    */
  var CreatedAt: js.Date
  
  /**
    * Last updated timestamp for workflow.
    */
  var LastUpdatedAt: js.Date
  
  /**
    * Status of workflow execution.
    */
  var Status: typings.awsSdk.clientsCustomerprofilesMod.Status
  
  /**
    * Description for workflow execution status.
    */
  var StatusDescription: string1To255
  
  /**
    * Unique identifier for the workflow.
    */
  var WorkflowId: string1To255
  
  /**
    * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
    */
  var WorkflowType: typings.awsSdk.clientsCustomerprofilesMod.WorkflowType
}
object ListWorkflowsItem {
  
  inline def apply(
    CreatedAt: js.Date,
    LastUpdatedAt: js.Date,
    Status: Status,
    StatusDescription: string1To255,
    WorkflowId: string1To255,
    WorkflowType: WorkflowType
  ): ListWorkflowsItem = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], LastUpdatedAt = LastUpdatedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StatusDescription = StatusDescription.asInstanceOf[js.Any], WorkflowId = WorkflowId.asInstanceOf[js.Any], WorkflowType = WorkflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkflowsItem]
  }
  
  extension [Self <: ListWorkflowsItem](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDescription(value: string1To255): Self = StObject.set(x, "StatusDescription", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: string1To255): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "WorkflowType", value.asInstanceOf[js.Any])
  }
}
