package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipeSourceParameters extends StObject {
  
  /**
    * The parameters for using an Active MQ broker as a source.
    */
  var ActiveMQBrokerParameters: js.UndefOr[UpdatePipeSourceActiveMQBrokerParameters] = js.undefined
  
  /**
    * The parameters for using a DynamoDB stream as a source.
    */
  var DynamoDBStreamParameters: js.UndefOr[UpdatePipeSourceDynamoDBStreamParameters] = js.undefined
  
  /**
    * The collection of event patterns used to filter events. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var FilterCriteria: js.UndefOr[typings.awsSdk.clientsPipesMod.FilterCriteria] = js.undefined
  
  /**
    * The parameters for using a Kinesis stream as a source.
    */
  var KinesisStreamParameters: js.UndefOr[UpdatePipeSourceKinesisStreamParameters] = js.undefined
  
  /**
    * The parameters for using an MSK stream as a source.
    */
  var ManagedStreamingKafkaParameters: js.UndefOr[UpdatePipeSourceManagedStreamingKafkaParameters] = js.undefined
  
  /**
    * The parameters for using a Rabbit MQ broker as a source.
    */
  var RabbitMQBrokerParameters: js.UndefOr[UpdatePipeSourceRabbitMQBrokerParameters] = js.undefined
  
  /**
    * The parameters for using a self-managed Apache Kafka stream as a source.
    */
  var SelfManagedKafkaParameters: js.UndefOr[UpdatePipeSourceSelfManagedKafkaParameters] = js.undefined
  
  /**
    * The parameters for using a Amazon SQS stream as a source.
    */
  var SqsQueueParameters: js.UndefOr[UpdatePipeSourceSqsQueueParameters] = js.undefined
}
object UpdatePipeSourceParameters {
  
  inline def apply(): UpdatePipeSourceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipeSourceParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipeSourceParameters] (val x: Self) extends AnyVal {
    
    inline def setActiveMQBrokerParameters(value: UpdatePipeSourceActiveMQBrokerParameters): Self = StObject.set(x, "ActiveMQBrokerParameters", value.asInstanceOf[js.Any])
    
    inline def setActiveMQBrokerParametersUndefined: Self = StObject.set(x, "ActiveMQBrokerParameters", js.undefined)
    
    inline def setDynamoDBStreamParameters(value: UpdatePipeSourceDynamoDBStreamParameters): Self = StObject.set(x, "DynamoDBStreamParameters", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBStreamParametersUndefined: Self = StObject.set(x, "DynamoDBStreamParameters", js.undefined)
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "FilterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "FilterCriteria", js.undefined)
    
    inline def setKinesisStreamParameters(value: UpdatePipeSourceKinesisStreamParameters): Self = StObject.set(x, "KinesisStreamParameters", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamParametersUndefined: Self = StObject.set(x, "KinesisStreamParameters", js.undefined)
    
    inline def setManagedStreamingKafkaParameters(value: UpdatePipeSourceManagedStreamingKafkaParameters): Self = StObject.set(x, "ManagedStreamingKafkaParameters", value.asInstanceOf[js.Any])
    
    inline def setManagedStreamingKafkaParametersUndefined: Self = StObject.set(x, "ManagedStreamingKafkaParameters", js.undefined)
    
    inline def setRabbitMQBrokerParameters(value: UpdatePipeSourceRabbitMQBrokerParameters): Self = StObject.set(x, "RabbitMQBrokerParameters", value.asInstanceOf[js.Any])
    
    inline def setRabbitMQBrokerParametersUndefined: Self = StObject.set(x, "RabbitMQBrokerParameters", js.undefined)
    
    inline def setSelfManagedKafkaParameters(value: UpdatePipeSourceSelfManagedKafkaParameters): Self = StObject.set(x, "SelfManagedKafkaParameters", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedKafkaParametersUndefined: Self = StObject.set(x, "SelfManagedKafkaParameters", js.undefined)
    
    inline def setSqsQueueParameters(value: UpdatePipeSourceSqsQueueParameters): Self = StObject.set(x, "SqsQueueParameters", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueParametersUndefined: Self = StObject.set(x, "SqsQueueParameters", js.undefined)
  }
}
