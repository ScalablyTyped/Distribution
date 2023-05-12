package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowRequest extends StObject {
  
  /**
    * The clientToken parameter is an idempotency token. It ensures that your UpdateFlow request completes only once. You choose the value to pass. For example, if you don't receive a response from your request, you can safely retry the request with the same clientToken parameter value. If you omit a clientToken value, the Amazon Web Services SDK that you are using inserts a value for you. This way, the SDK can safely retry requests multiple times after a network error. You must provide your own value for other use cases. If you specify input parameters that differ from your first request, an error occurs. If you use a different value for clientToken, Amazon AppFlow considers it a new call to UpdateFlow. The token is active for 8 hours.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
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
  
  /**
    * Specifies the configuration that Amazon AppFlow uses when it catalogs the data that's transferred by the associated flow. When Amazon AppFlow catalogs the data from a flow, it stores metadata in a data catalog.
    */
  var metadataCatalogConfig: js.UndefOr[MetadataCatalogConfig] = js.undefined
  
  var sourceFlowConfig: SourceFlowConfig
  
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
    sourceFlowConfig: SourceFlowConfig,
    tasks: Tasks,
    triggerConfig: TriggerConfig
  ): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(destinationFlowConfigList = destinationFlowConfigList.asInstanceOf[js.Any], flowName = flowName.asInstanceOf[js.Any], sourceFlowConfig = sourceFlowConfig.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], triggerConfig = triggerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFlowRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: FlowDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDestinationFlowConfigList(value: DestinationFlowConfigList): Self = StObject.set(x, "destinationFlowConfigList", value.asInstanceOf[js.Any])
    
    inline def setDestinationFlowConfigListVarargs(value: DestinationFlowConfig*): Self = StObject.set(x, "destinationFlowConfigList", js.Array(value*))
    
    inline def setFlowName(value: FlowName): Self = StObject.set(x, "flowName", value.asInstanceOf[js.Any])
    
    inline def setMetadataCatalogConfig(value: MetadataCatalogConfig): Self = StObject.set(x, "metadataCatalogConfig", value.asInstanceOf[js.Any])
    
    inline def setMetadataCatalogConfigUndefined: Self = StObject.set(x, "metadataCatalogConfig", js.undefined)
    
    inline def setSourceFlowConfig(value: SourceFlowConfig): Self = StObject.set(x, "sourceFlowConfig", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: Tasks): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
    
    inline def setTriggerConfig(value: TriggerConfig): Self = StObject.set(x, "triggerConfig", value.asInstanceOf[js.Any])
  }
}
