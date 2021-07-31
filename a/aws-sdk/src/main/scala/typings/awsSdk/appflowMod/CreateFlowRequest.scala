package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlowRequest extends StObject {
  
  /**
    *  A description of the flow you want to create. 
    */
  var description: js.UndefOr[FlowDescription] = js.undefined
  
  /**
    *  The configuration that controls how Amazon AppFlow places data in the destination connector. 
    */
  var destinationFlowConfigList: DestinationFlowConfigList
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName
  
  /**
    *  The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key. 
    */
  var kmsArn: js.UndefOr[KMSArn] = js.undefined
  
  /**
    *  The configuration that controls how Amazon AppFlow retrieves data from the source connector. 
    */
  var sourceFlowConfig: SourceFlowConfig
  
  /**
    *  The tags used to organize, track, or control access for your flow. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    *  A list of tasks that Amazon AppFlow performs while transferring the data in the flow run. 
    */
  var tasks: Tasks
  
  /**
    *  The trigger settings that determine how and when the flow runs. 
    */
  var triggerConfig: TriggerConfig
}
object CreateFlowRequest {
  
  @scala.inline
  def apply(
    destinationFlowConfigList: DestinationFlowConfigList,
    flowName: FlowName,
    sourceFlowConfig: SourceFlowConfig,
    tasks: Tasks,
    triggerConfig: TriggerConfig
  ): CreateFlowRequest = {
    val __obj = js.Dynamic.literal(destinationFlowConfigList = destinationFlowConfigList.asInstanceOf[js.Any], flowName = flowName.asInstanceOf[js.Any], sourceFlowConfig = sourceFlowConfig.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], triggerConfig = triggerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowRequest]
  }
  
  @scala.inline
  implicit class CreateFlowRequestMutableBuilder[Self <: CreateFlowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: FlowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDestinationFlowConfigList(value: DestinationFlowConfigList): Self = StObject.set(x, "destinationFlowConfigList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationFlowConfigListVarargs(value: DestinationFlowConfig*): Self = StObject.set(x, "destinationFlowConfigList", js.Array(value :_*))
    
    @scala.inline
    def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsArn(value: KMSArn): Self = StObject.set(x, "kmsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsArnUndefined: Self = StObject.set(x, "kmsArn", js.undefined)
    
    @scala.inline
    def setSourceFlowConfig(value: SourceFlowConfig): Self = StObject.set(x, "sourceFlowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    
    @scala.inline
    def setTriggerConfig(value: TriggerConfig): Self = StObject.set(x, "triggerConfig", value.asInstanceOf[js.Any])
  }
}
