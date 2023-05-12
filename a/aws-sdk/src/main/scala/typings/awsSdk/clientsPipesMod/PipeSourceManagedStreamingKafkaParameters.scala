package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeSourceManagedStreamingKafkaParameters extends StObject {
  
  /**
    * The maximum number of records to include in each batch.
    */
  var BatchSize: js.UndefOr[LimitMax10000] = js.undefined
  
  /**
    * The name of the destination queue to consume.
    */
  var ConsumerGroupID: js.UndefOr[URI] = js.undefined
  
  /**
    * The credentials needed to access the resource.
    */
  var Credentials: js.UndefOr[MSKAccessCredentials] = js.undefined
  
  /**
    * The maximum length of a time to wait for events.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsPipesMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * (Streams only) The position in a stream from which to start reading.
    */
  var StartingPosition: js.UndefOr[MSKStartPosition] = js.undefined
  
  /**
    * The name of the topic that the pipe will read from.
    */
  var TopicName: KafkaTopicName
}
object PipeSourceManagedStreamingKafkaParameters {
  
  inline def apply(TopicName: KafkaTopicName): PipeSourceManagedStreamingKafkaParameters = {
    val __obj = js.Dynamic.literal(TopicName = TopicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeSourceManagedStreamingKafkaParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeSourceManagedStreamingKafkaParameters] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: LimitMax10000): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setConsumerGroupID(value: URI): Self = StObject.set(x, "ConsumerGroupID", value.asInstanceOf[js.Any])
    
    inline def setConsumerGroupIDUndefined: Self = StObject.set(x, "ConsumerGroupID", js.undefined)
    
    inline def setCredentials(value: MSKAccessCredentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setStartingPosition(value: MSKStartPosition): Self = StObject.set(x, "StartingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "StartingPosition", js.undefined)
    
    inline def setTopicName(value: KafkaTopicName): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
  }
}
