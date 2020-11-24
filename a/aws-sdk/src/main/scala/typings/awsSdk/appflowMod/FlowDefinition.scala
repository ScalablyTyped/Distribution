package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowDefinition extends js.Object {
  
  /**
    *  Specifies when the flow was created. 
    */
  var createdAt: js.UndefOr[Date] = js.native
  
  /**
    *  The ARN of the user who created the flow. 
    */
  var createdBy: js.UndefOr[CreatedBy] = js.native
  
  /**
    *  A user-entered description of the flow. 
    */
  var description: js.UndefOr[FlowDescription] = js.native
  
  /**
    *  Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on. 
    */
  var destinationConnectorType: js.UndefOr[ConnectorType] = js.native
  
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
    *  Describes the details of the most recent flow run. 
    */
  var lastRunExecutionDetails: js.UndefOr[ExecutionDetails] = js.native
  
  /**
    *  Specifies when the flow was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[Date] = js.native
  
  /**
    *  Specifies the account user name that most recently updated the flow. 
    */
  var lastUpdatedBy: js.UndefOr[UpdatedBy] = js.native
  
  /**
    *  Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on. 
    */
  var sourceConnectorType: js.UndefOr[ConnectorType] = js.native
  
  /**
    *  The tags used to organize, track, or control access for your flow. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    *  Specifies the type of flow trigger. This can be OnDemand, Scheduled, or Event. 
    */
  var triggerType: js.UndefOr[TriggerType] = js.native
}
object FlowDefinition {
  
  @scala.inline
  def apply(): FlowDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowDefinition]
  }
  
  @scala.inline
  implicit class FlowDefinitionOps[Self <: FlowDefinition] (val x: Self) extends AnyVal {
    
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
    def setDestinationConnectorType(value: ConnectorType): Self = this.set("destinationConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationConnectorType: Self = this.set("destinationConnectorType", js.undefined)
    
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
    def setSourceConnectorType(value: ConnectorType): Self = this.set("sourceConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceConnectorType: Self = this.set("sourceConnectorType", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTriggerType(value: TriggerType): Self = this.set("triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerType: Self = this.set("triggerType", js.undefined)
  }
}
