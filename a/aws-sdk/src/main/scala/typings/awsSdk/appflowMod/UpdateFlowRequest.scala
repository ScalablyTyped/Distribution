package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowRequest extends StObject {
  
  /**
    *  A description of the flow. 
    */
  var description: js.UndefOr[FlowDescription] = js.undefined
  
  /**
    *  The configuration that controls how Amazon AppFlow transfers data to the destination connector. 
    */
  var destinationFlowConfigList: DestinationFlowConfigList
  
  /**
    *  The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only. 
    */
  var flowName: FlowName
  
  var sourceFlowConfig: js.UndefOr[SourceFlowConfig] = js.undefined
  
  /**
    *  A list of tasks that Amazon AppFlow performs while transferring the data in the flow run. 
    */
  var tasks: Tasks
  
  /**
    *  The trigger settings that determine how and when the flow runs. 
    */
  var triggerConfig: TriggerConfig
}
object UpdateFlowRequest {
  
  inline def apply(
    destinationFlowConfigList: DestinationFlowConfigList,
    flowName: FlowName,
    tasks: Tasks,
    triggerConfig: TriggerConfig
  ): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(destinationFlowConfigList = destinationFlowConfigList.asInstanceOf[js.Any], flowName = flowName.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], triggerConfig = triggerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
  
  extension [Self <: UpdateFlowRequest](x: Self) {
    
    inline def setDescription(value: FlowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationFlowConfigList(value: DestinationFlowConfigList): Self = StObject.set(x, "destinationFlowConfigList", value.asInstanceOf[js.Any])
    
    inline def setDestinationFlowConfigListVarargs(value: DestinationFlowConfig*): Self = StObject.set(x, "destinationFlowConfigList", js.Array(value :_*))
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    inline def setSourceFlowConfig(value: SourceFlowConfig): Self = StObject.set(x, "sourceFlowConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFlowConfigUndefined: Self = StObject.set(x, "sourceFlowConfig", js.undefined)
    
    inline def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    
    inline def setTriggerConfig(value: TriggerConfig): Self = StObject.set(x, "triggerConfig", value.asInstanceOf[js.Any])
  }
}
