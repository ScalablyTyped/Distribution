package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeSourceParameters extends StObject {
  
  /**
    * The parameters for using an Active MQ broker as a source.
    */
  var ActiveMQBrokerParameters: js.UndefOr[PipeSourceActiveMQBrokerParameters] = js.undefined
  
  /**
    * The parameters for using a DynamoDB stream as a source.
    */
  var DynamoDBStreamParameters: js.UndefOr[PipeSourceDynamoDBStreamParameters] = js.undefined
  
  /**
    * The collection of event patterns used to filter events. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var FilterCriteria: js.UndefOr[typings.awsSdk.clientsPipesMod.FilterCriteria] = js.undefined
  
  /**
    * The parameters for using a Kinesis stream as a source.
    */
  var KinesisStreamParameters: js.UndefOr[PipeSourceKinesisStreamParameters] = js.undefined
  
  /**
    * The parameters for using an MSK stream as a source.
    */
  var ManagedStreamingKafkaParameters: js.UndefOr[PipeSourceManagedStreamingKafkaParameters] = js.undefined
  
  /**
    * The parameters for using a Rabbit MQ broker as a source.
    */
  var RabbitMQBrokerParameters: js.UndefOr[PipeSourceRabbitMQBrokerParameters] = js.undefined
  
  /**
    * The parameters for using a self-managed Apache Kafka stream as a source.
    */
  var SelfManagedKafkaParameters: js.UndefOr[PipeSourceSelfManagedKafkaParameters] = js.undefined
  
  /**
    * The parameters for using a Amazon SQS stream as a source.
    */
  var SqsQueueParameters: js.UndefOr[PipeSourceSqsQueueParameters] = js.undefined
}
object PipeSourceParameters {
  
  inline def apply(): PipeSourceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeSourceParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeSourceParameters] (val x: Self) extends AnyVal {
    
    inline def setActiveMQBrokerParameters(value: PipeSourceActiveMQBrokerParameters): Self = StObject.set(x, "ActiveMQBrokerParameters", value.asInstanceOf[js.Any])
    
    inline def setActiveMQBrokerParametersUndefined: Self = StObject.set(x, "ActiveMQBrokerParameters", js.undefined)
    
    inline def setDynamoDBStreamParameters(value: PipeSourceDynamoDBStreamParameters): Self = StObject.set(x, "DynamoDBStreamParameters", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBStreamParametersUndefined: Self = StObject.set(x, "DynamoDBStreamParameters", js.undefined)
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "FilterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "FilterCriteria", js.undefined)
    
    inline def setKinesisStreamParameters(value: PipeSourceKinesisStreamParameters): Self = StObject.set(x, "KinesisStreamParameters", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamParametersUndefined: Self = StObject.set(x, "KinesisStreamParameters", js.undefined)
    
    inline def setManagedStreamingKafkaParameters(value: PipeSourceManagedStreamingKafkaParameters): Self = StObject.set(x, "ManagedStreamingKafkaParameters", value.asInstanceOf[js.Any])
    
    inline def setManagedStreamingKafkaParametersUndefined: Self = StObject.set(x, "ManagedStreamingKafkaParameters", js.undefined)
    
    inline def setRabbitMQBrokerParameters(value: PipeSourceRabbitMQBrokerParameters): Self = StObject.set(x, "RabbitMQBrokerParameters", value.asInstanceOf[js.Any])
    
    inline def setRabbitMQBrokerParametersUndefined: Self = StObject.set(x, "RabbitMQBrokerParameters", js.undefined)
    
    inline def setSelfManagedKafkaParameters(value: PipeSourceSelfManagedKafkaParameters): Self = StObject.set(x, "SelfManagedKafkaParameters", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedKafkaParametersUndefined: Self = StObject.set(x, "SelfManagedKafkaParameters", js.undefined)
    
    inline def setSqsQueueParameters(value: PipeSourceSqsQueueParameters): Self = StObject.set(x, "SqsQueueParameters", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueParametersUndefined: Self = StObject.set(x, "SqsQueueParameters", js.undefined)
  }
}
