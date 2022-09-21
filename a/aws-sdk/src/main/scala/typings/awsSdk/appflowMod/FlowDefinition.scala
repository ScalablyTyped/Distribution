package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowDefinition extends StObject {
  
  /**
    *  Specifies when the flow was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The ARN of the user who created the flow. 
    */
  var createdBy: js.UndefOr[CreatedBy] = js.undefined
  
  /**
    *  A user-entered description of the flow. 
    */
  var description: js.UndefOr[FlowDescription] = js.undefined
  
  /**
    * The label of the destination connector in the flow.
    */
  var destinationConnectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    *  Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on. 
    */
  var destinationConnectorType: js.UndefOr[ConnectorType] = js.undefined
  
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
    *  Describes the details of the most recent flow run. 
    */
  var lastRunExecutionDetails: js.UndefOr[ExecutionDetails] = js.undefined
  
  /**
    *  Specifies when the flow was last updated. 
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Specifies the account user name that most recently updated the flow. 
    */
  var lastUpdatedBy: js.UndefOr[UpdatedBy] = js.undefined
  
  /**
    * The label of the source connector in the flow.
    */
  var sourceConnectorLabel: js.UndefOr[ConnectorLabel] = js.undefined
  
  /**
    *  Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on. 
    */
  var sourceConnectorType: js.UndefOr[ConnectorType] = js.undefined
  
  /**
    *  The tags used to organize, track, or control access for your flow. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  Specifies the type of flow trigger. This can be OnDemand, Scheduled, or Event. 
    */
  var triggerType: js.UndefOr[TriggerType] = js.undefined
}
object FlowDefinition {
  
  inline def apply(): FlowDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowDefinition]
  }
  
  extension [Self <: FlowDefinition](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDescription(value: FlowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "destinationConnectorLabel", value.asInstanceOf[js.Any])
    
    inline def setDestinationConnectorLabelUndefined: Self = StObject.set(x, "destinationConnectorLabel", js.undefined)
    
    inline def setDestinationConnectorType(value: ConnectorType): Self = StObject.set(x, "destinationConnectorType", value.asInstanceOf[js.Any])
    
    inline def setDestinationConnectorTypeUndefined: Self = StObject.set(x, "destinationConnectorType", js.undefined)
    
    inline def setFlowArn(value: FlowArn): Self = StObject.set(x, "flowArn", value.asInstanceOf[js.Any])
    
    inline def setFlowArnUndefined: Self = StObject.set(x, "flowArn", js.undefined)
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    inline def setFlowNameUndefined: Self = StObject.set(x, "flowName", js.undefined)
    
    inline def setFlowStatus(value: FlowStatus): Self = StObject.set(x, "flowStatus", value.asInstanceOf[js.Any])
    
    inline def setFlowStatusUndefined: Self = StObject.set(x, "flowStatus", js.undefined)
    
    inline def setLastRunExecutionDetails(value: ExecutionDetails): Self = StObject.set(x, "lastRunExecutionDetails", value.asInstanceOf[js.Any])
    
    inline def setLastRunExecutionDetailsUndefined: Self = StObject.set(x, "lastRunExecutionDetails", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLastUpdatedBy(value: UpdatedBy): Self = StObject.set(x, "lastUpdatedBy", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedByUndefined: Self = StObject.set(x, "lastUpdatedBy", js.undefined)
    
    inline def setSourceConnectorLabel(value: ConnectorLabel): Self = StObject.set(x, "sourceConnectorLabel", value.asInstanceOf[js.Any])
    
    inline def setSourceConnectorLabelUndefined: Self = StObject.set(x, "sourceConnectorLabel", js.undefined)
    
    inline def setSourceConnectorType(value: ConnectorType): Self = StObject.set(x, "sourceConnectorType", value.asInstanceOf[js.Any])
    
    inline def setSourceConnectorTypeUndefined: Self = StObject.set(x, "sourceConnectorType", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
  }
}
