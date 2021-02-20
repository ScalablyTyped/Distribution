package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowDefinition extends StObject {
  
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
  implicit class FlowDefinitionMutableBuilder[Self <: FlowDefinition] (val x: Self) extends AnyVal {
    
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
    def setDestinationConnectorType(value: ConnectorType): Self = StObject.set(x, "destinationConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationConnectorTypeUndefined: Self = StObject.set(x, "destinationConnectorType", js.undefined)
    
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
    def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
    
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
    def setSourceConnectorType(value: ConnectorType): Self = StObject.set(x, "sourceConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceConnectorTypeUndefined: Self = StObject.set(x, "sourceConnectorType", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
  }
}
