package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaExecutionParameters extends StObject {
  
  /**
    * The map of environment variables that are available to the Lambda function when it runs.
    */
  var environmentVariables: js.UndefOr[LambdaEnvironmentVariables] = js.undefined
  
  /**
    * The list of event sources to which to subscribe to receive work messages. The Lambda function runs when it receives a message from an event source. You can subscribe this function to local publish/subscribe messages and Amazon Web Services IoT Core MQTT messages.
    */
  var eventSources: js.UndefOr[LambdaEventSourceList] = js.undefined
  
  /**
    * The list of arguments to pass to the Lambda function when it runs.
    */
  var execArgs: js.UndefOr[LambdaExecArgsList] = js.undefined
  
  /**
    * The encoding type that the Lambda function supports. Default: json 
    */
  var inputPayloadEncodingType: js.UndefOr[LambdaInputPayloadEncodingType] = js.undefined
  
  /**
    * The parameters for the Linux process that contains the Lambda function.
    */
  var linuxProcessParams: js.UndefOr[LambdaLinuxProcessParams] = js.undefined
  
  /**
    * The maximum amount of time in seconds that a non-pinned Lambda function can idle before the IoT Greengrass Core software stops its process.
    */
  var maxIdleTimeInSeconds: js.UndefOr[OptionalInteger] = js.undefined
  
  /**
    * The maximum number of instances that a non-pinned Lambda function can run at the same time.
    */
  var maxInstancesCount: js.UndefOr[OptionalInteger] = js.undefined
  
  /**
    * The maximum size of the message queue for the Lambda function component. The IoT Greengrass core stores messages in a FIFO (first-in-first-out) queue until it can run the Lambda function to consume each message.
    */
  var maxQueueSize: js.UndefOr[OptionalInteger] = js.undefined
  
  /**
    * Whether or not the Lambda function is pinned, or long-lived.   A pinned Lambda function starts when IoT Greengrass starts and keeps running in its own container.   A non-pinned Lambda function starts only when it receives a work item and exists after it idles for maxIdleTimeInSeconds. If the function has multiple work items, the IoT Greengrass Core software creates multiple instances of the function.   Default: true 
    */
  var pinned: js.UndefOr[OptionalBoolean] = js.undefined
  
  /**
    * The interval in seconds at which a pinned (also known as long-lived) Lambda function component sends status updates to the Lambda manager component.
    */
  var statusTimeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined
  
  /**
    * The maximum amount of time in seconds that the Lambda function can process a work item.
    */
  var timeoutInSeconds: js.UndefOr[OptionalInteger] = js.undefined
}
object LambdaExecutionParameters {
  
  inline def apply(): LambdaExecutionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaExecutionParameters]
  }
  
  extension [Self <: LambdaExecutionParameters](x: Self) {
    
    inline def setEnvironmentVariables(value: LambdaEnvironmentVariables): Self = StObject.set(x, "environmentVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentVariablesUndefined: Self = StObject.set(x, "environmentVariables", js.undefined)
    
    inline def setEventSources(value: LambdaEventSourceList): Self = StObject.set(x, "eventSources", value.asInstanceOf[js.Any])
    
    inline def setEventSourcesUndefined: Self = StObject.set(x, "eventSources", js.undefined)
    
    inline def setEventSourcesVarargs(value: LambdaEventSource*): Self = StObject.set(x, "eventSources", js.Array(value*))
    
    inline def setExecArgs(value: LambdaExecArgsList): Self = StObject.set(x, "execArgs", value.asInstanceOf[js.Any])
    
    inline def setExecArgsUndefined: Self = StObject.set(x, "execArgs", js.undefined)
    
    inline def setExecArgsVarargs(value: LambdaExecArg*): Self = StObject.set(x, "execArgs", js.Array(value*))
    
    inline def setInputPayloadEncodingType(value: LambdaInputPayloadEncodingType): Self = StObject.set(x, "inputPayloadEncodingType", value.asInstanceOf[js.Any])
    
    inline def setInputPayloadEncodingTypeUndefined: Self = StObject.set(x, "inputPayloadEncodingType", js.undefined)
    
    inline def setLinuxProcessParams(value: LambdaLinuxProcessParams): Self = StObject.set(x, "linuxProcessParams", value.asInstanceOf[js.Any])
    
    inline def setLinuxProcessParamsUndefined: Self = StObject.set(x, "linuxProcessParams", js.undefined)
    
    inline def setMaxIdleTimeInSeconds(value: OptionalInteger): Self = StObject.set(x, "maxIdleTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxIdleTimeInSecondsUndefined: Self = StObject.set(x, "maxIdleTimeInSeconds", js.undefined)
    
    inline def setMaxInstancesCount(value: OptionalInteger): Self = StObject.set(x, "maxInstancesCount", value.asInstanceOf[js.Any])
    
    inline def setMaxInstancesCountUndefined: Self = StObject.set(x, "maxInstancesCount", js.undefined)
    
    inline def setMaxQueueSize(value: OptionalInteger): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
    
    inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
    
    inline def setPinned(value: OptionalBoolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    inline def setStatusTimeoutInSeconds(value: OptionalInteger): Self = StObject.set(x, "statusTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setStatusTimeoutInSecondsUndefined: Self = StObject.set(x, "statusTimeoutInSeconds", js.undefined)
    
    inline def setTimeoutInSeconds(value: OptionalInteger): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
  }
}
