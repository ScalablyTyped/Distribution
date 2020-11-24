package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFlowResponse extends js.Object {
  
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
  implicit class DescribeFlowResponseOps[Self <: DescribeFlowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setDescription(value: FlowDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDestinationFlowConfigListVarargs(value: DestinationFlowConfig*): Self = this.set("destinationFlowConfigList", js.Array(value :_*))
    
    @scala.inline
    def setDestinationFlowConfigList(value: DestinationFlowConfigList): Self = this.set("destinationFlowConfigList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationFlowConfigList: Self = this.set("destinationFlowConfigList", js.undefined)
    
    @scala.inline
    def setFlowArn(value: FlowArn): Self = this.set("flowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowArn: Self = this.set("flowArn", js.undefined)
    
    @scala.inline
    def setFlowName(value: FlowName): Self = this.set("flowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowName: Self = this.set("flowName", js.undefined)
    
    @scala.inline
    def setFlowStatus(value: FlowStatus): Self = this.set("flowStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowStatus: Self = this.set("flowStatus", js.undefined)
    
    @scala.inline
    def setFlowStatusMessage(value: FlowStatusMessage): Self = this.set("flowStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowStatusMessage: Self = this.set("flowStatusMessage", js.undefined)
    
    @scala.inline
    def setKmsArn(value: KMSArn): Self = this.set("kmsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsArn: Self = this.set("kmsArn", js.undefined)
    
    @scala.inline
    def setLastRunExecutionDetails(value: ExecutionDetails): Self = this.set("lastRunExecutionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRunExecutionDetails: Self = this.set("lastRunExecutionDetails", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: Date): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setLastUpdatedBy(value: UpdatedBy): Self = this.set("lastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedBy: Self = this.set("lastUpdatedBy", js.undefined)
    
    @scala.inline
    def setSourceFlowConfig(value: SourceFlowConfig): Self = this.set("sourceFlowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFlowConfig: Self = this.set("sourceFlowConfig", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: Task*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: Tasks): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
    
    @scala.inline
    def setTriggerConfig(value: TriggerConfig): Self = this.set("triggerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerConfig: Self = this.set("triggerConfig", js.undefined)
  }
}
