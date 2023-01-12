package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppflowIntegrationWorkflowStep extends StObject {
  
  /**
    * End datetime of records pulled in batch during execution of workflow step for APPFLOW_INTEGRATION workflow.
    */
  var BatchRecordsEndTime: string1To255
  
  /**
    * Start datetime of records pulled in batch during execution of workflow step for APPFLOW_INTEGRATION workflow.
    */
  var BatchRecordsStartTime: string1To255
  
  /**
    * Creation timestamp of workflow step for APPFLOW_INTEGRATION workflow.
    */
  var CreatedAt: js.Date
  
  /**
    * Message indicating execution of workflow step for APPFLOW_INTEGRATION workflow.
    */
  var ExecutionMessage: string1To255
  
  /**
    * Name of the flow created during execution of workflow step. APPFLOW_INTEGRATION workflow type creates an appflow flow during workflow step execution on the customers behalf.
    */
  var FlowName: typings.awsSdk.clientsCustomerprofilesMod.FlowName
  
  /**
    * Last updated timestamp for workflow step for APPFLOW_INTEGRATION workflow.
    */
  var LastUpdatedAt: js.Date
  
  /**
    * Total number of records processed during execution of workflow step for APPFLOW_INTEGRATION workflow.
    */
  var RecordsProcessed: long
  
  /**
    * Workflow step status for APPFLOW_INTEGRATION workflow.
    */
  var Status: typings.awsSdk.clientsCustomerprofilesMod.Status
}
object AppflowIntegrationWorkflowStep {
  
  inline def apply(
    BatchRecordsEndTime: string1To255,
    BatchRecordsStartTime: string1To255,
    CreatedAt: js.Date,
    ExecutionMessage: string1To255,
    FlowName: FlowName,
    LastUpdatedAt: js.Date,
    RecordsProcessed: long,
    Status: Status
  ): AppflowIntegrationWorkflowStep = {
    val __obj = js.Dynamic.literal(BatchRecordsEndTime = BatchRecordsEndTime.asInstanceOf[js.Any], BatchRecordsStartTime = BatchRecordsStartTime.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], ExecutionMessage = ExecutionMessage.asInstanceOf[js.Any], FlowName = FlowName.asInstanceOf[js.Any], LastUpdatedAt = LastUpdatedAt.asInstanceOf[js.Any], RecordsProcessed = RecordsProcessed.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppflowIntegrationWorkflowStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppflowIntegrationWorkflowStep] (val x: Self) extends AnyVal {
    
    inline def setBatchRecordsEndTime(value: string1To255): Self = StObject.set(x, "BatchRecordsEndTime", value.asInstanceOf[js.Any])
    
    inline def setBatchRecordsStartTime(value: string1To255): Self = StObject.set(x, "BatchRecordsStartTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setExecutionMessage(value: string1To255): Self = StObject.set(x, "ExecutionMessage", value.asInstanceOf[js.Any])
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "FlowName", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setRecordsProcessed(value: long): Self = StObject.set(x, "RecordsProcessed", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
