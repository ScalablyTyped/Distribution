package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowResponse extends StObject {
  
  /**
    *  Specifies when the flow was created. 
    */
  var createdAt: js.UndefOr[Date] = js.native
  
  /**
    *  The ARN of the user who created the flow. 
    */
  var createdBy: js.UndefOr[CreatedBy] = js.native
  
  /**
    *  A description of the flow. 
    */
  var description: js.UndefOr[FlowDescription] = js.native
  
  /**
    *  The configuration that controls how Amazon AppFlow transfers data to the destination connector. 
    */
  var destinationFlowConfigList: js.UndefOr[DestinationFlowConfigList] = js.native
  
  /**
    *  The flow's Amazon Resource Name (ARN). 
    */
  var flowArn: js.UndefOr[FlowArn] = js.native
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: js.UndefOr[FlowName] = js.native
  
  /**
    *  Indicates the current status of the flow. 
    */
  var flowStatus: js.UndefOr[FlowStatus] = js.native
  
  /**
    *  Contains an error message if the flow status is in a suspended or error state. This applies only to scheduled or event-triggered flows. 
    */
  var flowStatusMessage: js.UndefOr[FlowStatusMessage] = js.native
  
  /**
    *  The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key. 
    */
  var kmsArn: js.UndefOr[KMSArn] = js.native
  
  /**
    *  Describes the details of the most recent flow run. 
    */
  var lastRunExecutionDetails: js.UndefOr[ExecutionDetails] = js.native
  
  /**
    *  Specifies when the flow was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[Date] = js.native
  
  /**
    *  Specifies the user name of the account that performed the most recent update. 
    */
  var lastUpdatedBy: js.UndefOr[UpdatedBy] = js.native
  
  /**
    *  The configuration that controls how Amazon AppFlow retrieves data from the source connector. 
    */
  var sourceFlowConfig: js.UndefOr[SourceFlowConfig] = js.native
  
  /**
    *  The tags used to organize, track, or control access for your flow. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    *  A list of tasks that Amazon AppFlow performs while transferring the data in the flow run. 
    */
  var tasks: js.UndefOr[Tasks] = js.native
  
  /**
    *  The trigger settings that determine how and when the flow runs. 
    */
  var triggerConfig: js.UndefOr[TriggerConfig] = js.native
}
object DescribeFlowResponse {
  
  @scala.inline
  def apply(): DescribeFlowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFlowResponse]
  }
  
  @scala.inline
  implicit class DescribeFlowResponseMutableBuilder[Self <: DescribeFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    @scala.inline
    def setDescription(value: FlowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinationFlowConfigList(value: DestinationFlowConfigList): Self = StObject.set(x, "destinationFlowConfigList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationFlowConfigListUndefined: Self = StObject.set(x, "destinationFlowConfigList", js.undefined)
    
    @scala.inline
    def setDestinationFlowConfigListVarargs(value: DestinationFlowConfig*): Self = StObject.set(x, "destinationFlowConfigList", js.Array(value :_*))
    
    @scala.inline
    def setFlowArn(value: FlowArn): Self = StObject.set(x, "flowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowArnUndefined: Self = StObject.set(x, "flowArn", js.undefined)
    
    @scala.inline
    def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowNameUndefined: Self = StObject.set(x, "flowName", js.undefined)
    
    @scala.inline
    def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowStatusMessage(value: FlowStatusMessage): Self = StObject.set(x, "flowStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowStatusMessageUndefined: Self = StObject.set(x, "flowStatusMessage", js.undefined)
    
    @scala.inline
    def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
    
    @scala.inline
    def setKmsArn(value: KMSArn): Self = StObject.set(x, "kmsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsArnUndefined: Self = StObject.set(x, "kmsArn", js.undefined)
    
    @scala.inline
    def setLastRunExecutionDetails(value: ExecutionDetails): Self = StObject.set(x, "lastRunExecutionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRunExecutionDetailsUndefined: Self = StObject.set(x, "lastRunExecutionDetails", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLastUpdatedBy(value: UpdatedBy): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedByUndefined: Self = StObject.set(x, "lastUpdatedBy", js.undefined)
    
    @scala.inline
    def setSourceFlowConfig(value: SourceFlowConfig): Self = StObject.set(x, "sourceFlowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFlowConfigUndefined: Self = StObject.set(x, "sourceFlowConfig", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    
    @scala.inline
    def setTriggerConfig(value: TriggerConfig): Self = StObject.set(x, "triggerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerConfigUndefined: Self = StObject.set(x, "triggerConfig", js.undefined)
  }
}
