package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFlowRequest extends js.Object {
  
  /**
    *  A description of the flow you want to create. 
    */
  var description: js.UndefOr[FlowDescription] = js.native
  
  /**
    *  The configuration that controls how Amazon AppFlow places data in the destination connector. 
    */
  var destinationFlowConfigList: DestinationFlowConfigList = js.native
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName = js.native
  
  /**
    *  The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key. 
    */
  var kmsArn: js.UndefOr[KMSArn] = js.native
  
  /**
    *  The configuration that controls how Amazon AppFlow retrieves data from the source connector. 
    */
  var sourceFlowConfig: SourceFlowConfig = js.native
  
  /**
    *  The tags used to organize, track, or control access for your flow. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    *  A list of tasks that Amazon AppFlow performs while transferring the data in the flow run. 
    */
  var tasks: Tasks = js.native
  
  /**
    *  The trigger settings that determine how and when the flow runs. 
    */
  var triggerConfig: TriggerConfig = js.native
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
  implicit class CreateFlowRequestOps[Self <: CreateFlowRequest] (val x: Self) extends AnyVal {
    
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
    def setDestinationFlowConfigListVarargs(value: DestinationFlowConfig*): Self = this.set("destinationFlowConfigList", js.Array(value :_*))
    
    @scala.inline
    def setDestinationFlowConfigList(value: DestinationFlowConfigList): Self = this.set("destinationFlowConfigList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowName(value: FlowName): Self = this.set("flowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFlowConfig(value: SourceFlowConfig): Self = this.set("sourceFlowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: Task*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: Tasks): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerConfig(value: TriggerConfig): Self = this.set("triggerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: FlowDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setKmsArn(value: KMSArn): Self = this.set("kmsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsArn: Self = this.set("kmsArn", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
