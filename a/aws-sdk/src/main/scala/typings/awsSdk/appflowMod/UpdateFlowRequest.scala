package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowRequest extends js.Object {
  
  /**
    *  A description of the flow. 
    */
  var description: js.UndefOr[FlowDescription] = js.native
  
  /**
    *  The configuration that controls how Amazon AppFlow transfers data to the destination connector. 
    */
  var destinationFlowConfigList: DestinationFlowConfigList = js.native
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName = js.native
  
  var sourceFlowConfig: js.UndefOr[SourceFlowConfig] = js.native
  
  /**
    *  A list of tasks that Amazon AppFlow performs while transferring the data in the flow run. 
    */
  var tasks: Tasks = js.native
  
  /**
    *  The trigger settings that determine how and when the flow runs. 
    */
  var triggerConfig: TriggerConfig = js.native
}
object UpdateFlowRequest {
  
  @scala.inline
  def apply(
    destinationFlowConfigList: DestinationFlowConfigList,
    flowName: FlowName,
    tasks: Tasks,
    triggerConfig: TriggerConfig
  ): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(destinationFlowConfigList = destinationFlowConfigList.asInstanceOf[js.Any], flowName = flowName.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], triggerConfig = triggerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
  
  @scala.inline
  implicit class UpdateFlowRequestOps[Self <: UpdateFlowRequest] (val x: Self) extends AnyVal {
    
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
    def setSourceFlowConfig(value: SourceFlowConfig): Self = this.set("sourceFlowConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFlowConfig: Self = this.set("sourceFlowConfig", js.undefined)
  }
}
