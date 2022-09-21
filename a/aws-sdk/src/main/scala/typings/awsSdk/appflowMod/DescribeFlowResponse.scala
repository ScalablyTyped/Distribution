package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFlowResponse extends StObject {
  
  /**
    *  Specifies when the flow was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ARN of the user who created the flow. 
    */
  var createdBy: js.UndefOr[CreatedBy] = js.undefined
  
  /**
    *  A description of the flow. 
    */
  var description: js.UndefOr[FlowDescription] = js.undefined
  
  /**
    *  The configuration that controls how Amazon AppFlow transfers data to the destination connector. 
    */
  var destinationFlowConfigList: js.UndefOr[DestinationFlowConfigList] = js.undefined
  
  /**
    *  The flow's Amazon Resource Name (ARN). 
    */
  var flowArn: js.UndefOr[FlowArn] = js.undefined
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: js.UndefOr[FlowName] = js.undefined
  
  /**
    *  Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.undefined
  
  /**
    *  Contains an error message if the flow status is in a suspended or error state. This applies only to scheduled or event-triggered flows. 
    */
  var flowStatusMessage: js.UndefOr[FlowStatusMessage] = js.undefined
  
  /**
    *  The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key. 
    */
  var kmsArn: js.UndefOr[KMSArn] = js.undefined
  
  /**
    *  Describes the details of the most recent flow run. 
    */
  var lastRunExecutionDetails: js.UndefOr[ExecutionDetails] = js.undefined
  
  /**
    *  Specifies when the flow was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Specifies the user name of the account that performed the most recent update. 
    */
  var lastUpdatedBy: js.UndefOr[UpdatedBy] = js.undefined
  
  /**
    *  The configuration that controls how Amazon AppFlow retrieves data from the source connector. 
    */
  var sourceFlowConfig: js.UndefOr[SourceFlowConfig] = js.undefined
  
  /**
    *  The tags used to organize, track, or control access for your flow. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  A list of tasks that Amazon AppFlow performs while transferring the data in the flow run. 
    */
  var tasks: js.UndefOr[Tasks] = js.undefined
  
  /**
    *  The trigger settings that determine how and when the flow runs. 
    */
  var triggerConfig: js.UndefOr[TriggerConfig] = js.undefined
}
object DescribeFlowResponse {
  
  inline def apply(): DescribeFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowResponse]
  }
  
  extension [Self <: DescribeFlowResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: FlowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationFlowConfigList(value: DestinationFlowConfigList): Self = StObject.set(x, "destinationFlowConfigList", value.asInstanceOf[js.Any])
    
    inline def setDestinationFlowConfigListUndefined: Self = StObject.set(x, "destinationFlowConfigList", js.undefined)
    
    inline def setDestinationFlowConfigListVarargs(value: DestinationFlowConfig*): Self = StObject.set(x, "destinationFlowConfigList", js.Array(value*))
    
    inline def setFlowArn(value: FlowArn): Self = StObject.set(x, "flowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "flowArn", js.undefined)
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    inline def setFlowNameUndefined: Self = StObject.set(x, "flowName", js.undefined)
    
    inline def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    inline def setFlowStatusMessage(value: FlowStatusMessage): Self = StObject.set(x, "flowStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setFlowStatusMessageUndefined: Self = StObject.set(x, "flowStatusMessage", js.undefined)
    
    inline def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
    
    inline def setKmsArn(value: KMSArn): Self = StObject.set(x, "kmsArn", value.asInstanceOf[js.Any])
    
    inline def setKmsArnUndefined: Self = StObject.set(x, "kmsArn", js.undefined)
    
    inline def setLastRunExecutionDetails(value: ExecutionDetails): Self = StObject.set(x, "lastRunExecutionDetails", value.asInstanceOf[js.Any])
    
    inline def setLastRunExecutionDetailsUndefined: Self = StObject.set(x, "lastRunExecutionDetails", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLastUpdatedBy(value: UpdatedBy): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedByUndefined: Self = StObject.set(x, "lastUpdatedBy", js.undefined)
    
    inline def setSourceFlowConfig(value: SourceFlowConfig): Self = StObject.set(x, "sourceFlowConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFlowConfigUndefined: Self = StObject.set(x, "sourceFlowConfig", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
    
    inline def setTriggerConfig(value: TriggerConfig): Self = StObject.set(x, "triggerConfig", value.asInstanceOf[js.Any])
    
    inline def setTriggerConfigUndefined: Self = StObject.set(x, "triggerConfig", js.undefined)
  }
}
