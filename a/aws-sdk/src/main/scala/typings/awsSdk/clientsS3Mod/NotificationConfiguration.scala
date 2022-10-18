package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationConfiguration extends StObject {
  
  /**
    * Enables delivery of events to Amazon EventBridge.
    */
  var EventBridgeConfiguration: js.UndefOr[typings.awsSdk.clientsS3Mod.EventBridgeConfiguration] = js.undefined
  
  /**
    * Describes the Lambda functions to invoke and the events for which to invoke them.
    */
  var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.undefined
  
  /**
    * The Amazon Simple Queue Service queues to publish messages to and the events for which to publish messages.
    */
  var QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.undefined
  
  /**
    * The topic to which notifications are sent and the events for which notifications are generated.
    */
  var TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.undefined
}
object NotificationConfiguration {
  
  inline def apply(): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationConfiguration]
  }
  
  extension [Self <: NotificationConfiguration](x: Self) {
    
    inline def setEventBridgeConfiguration(value: EventBridgeConfiguration): Self = StObject.set(x, "EventBridgeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeConfigurationUndefined: Self = StObject.set(x, "EventBridgeConfiguration", js.undefined)
    
    inline def setLambdaFunctionConfigurations(value: LambdaFunctionConfigurationList): Self = StObject.set(x, "LambdaFunctionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionConfigurationsUndefined: Self = StObject.set(x, "LambdaFunctionConfigurations", js.undefined)
    
    inline def setLambdaFunctionConfigurationsVarargs(value: LambdaFunctionConfiguration*): Self = StObject.set(x, "LambdaFunctionConfigurations", js.Array(value*))
    
    inline def setQueueConfigurations(value: QueueConfigurationList): Self = StObject.set(x, "QueueConfigurations", value.asInstanceOf[js.Any])
    
    inline def setQueueConfigurationsUndefined: Self = StObject.set(x, "QueueConfigurations", js.undefined)
    
    inline def setQueueConfigurationsVarargs(value: QueueConfiguration*): Self = StObject.set(x, "QueueConfigurations", js.Array(value*))
    
    inline def setTopicConfigurations(value: TopicConfigurationList): Self = StObject.set(x, "TopicConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTopicConfigurationsUndefined: Self = StObject.set(x, "TopicConfigurations", js.undefined)
    
    inline def setTopicConfigurationsVarargs(value: TopicConfiguration*): Self = StObject.set(x, "TopicConfigurations", js.Array(value*))
  }
}
