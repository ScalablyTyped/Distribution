package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceMappingConfiguration extends StObject {
  
  /**
    * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK) event source.
    */
  var AmazonManagedKafkaEventSourceConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.AmazonManagedKafkaEventSourceConfig] = js.undefined
  
  /**
    * The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your function. Lambda passes all of the records in the batch to the function in a single call, up to the payload limit for synchronous invocation (6 MB). Default value: Varies by service. For Amazon SQS, the default is 10. For all other services, the default is 100. Related setting: When you set BatchSize to a value greater than 10, you must set MaximumBatchingWindowInSeconds to at least 1.
    */
  var BatchSize: js.UndefOr[typings.awsSdk.clientsLambdaMod.BatchSize] = js.undefined
  
  /**
    * (Streams only) If the function returns an error, split the batch in two and retry. The default value is false.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typings.awsSdk.clientsLambdaMod.BisectBatchOnFunctionError] = js.undefined
  
  /**
    * (Streams only) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.DestinationConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the event source.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * (Streams and Amazon SQS) An object that defines the filter criteria that determine whether Lambda should process an event. For more information, see Lambda event filtering.
    */
  var FilterCriteria: js.UndefOr[typings.awsSdk.clientsLambdaMod.FilterCriteria] = js.undefined
  
  /**
    * The ARN of the Lambda function.
    */
  var FunctionArn: js.UndefOr[typings.awsSdk.clientsLambdaMod.FunctionArn] = js.undefined
  
  /**
    * (Streams and Amazon SQS) A list of current response type enums applied to the event source mapping.
    */
  var FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList] = js.undefined
  
  /**
    * The date that the event source mapping was last updated or that its state changed.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The result of the last Lambda invocation of your function.
    */
  var LastProcessingResult: js.UndefOr[String] = js.undefined
  
  /**
    * (Streams and Amazon SQS standard queues) The maximum amount of time, in seconds, that Lambda spends gathering records before invoking the function. Default: 0 Related setting: When you set BatchSize to a value greater than 10, you must set MaximumBatchingWindowInSeconds to at least 1.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsLambdaMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age to infinite. When the value is set to infinite, Lambda never discards old records. 
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typings.awsSdk.clientsLambdaMod.MaximumRecordAgeInSeconds] = js.undefined
  
  /**
    * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed records until the record expires in the event source.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined
  
  /**
    * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
    */
  var ParallelizationFactor: js.UndefOr[typings.awsSdk.clientsLambdaMod.ParallelizationFactor] = js.undefined
  
  /**
    *  (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
    */
  var Queues: js.UndefOr[typings.awsSdk.clientsLambdaMod.Queues] = js.undefined
  
  /**
    * The self-managed Apache Kafka cluster for your event source.
    */
  var SelfManagedEventSource: js.UndefOr[typings.awsSdk.clientsLambdaMod.SelfManagedEventSource] = js.undefined
  
  /**
    * Specific configuration settings for a self-managed Apache Kafka event source.
    */
  var SelfManagedKafkaEventSourceConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.SelfManagedKafkaEventSourceConfig] = js.undefined
  
  /**
    * An array of the authentication protocol, VPC components, or virtual host to secure and define your event source.
    */
  var SourceAccessConfigurations: js.UndefOr[typings.awsSdk.clientsLambdaMod.SourceAccessConfigurations] = js.undefined
  
  /**
    * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon MSK stream sources. AT_TIMESTAMP is supported only for Amazon Kinesis streams.
    */
  var StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined
  
  /**
    * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading.
    */
  var StartingPositionTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the event source mapping. It can be one of the following: Creating, Enabling, Enabled, Disabling, Disabled, Updating, or Deleting.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether a user or Lambda made the last change to the event source mapping.
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Kafka topic.
    */
  var Topics: js.UndefOr[typings.awsSdk.clientsLambdaMod.Topics] = js.undefined
  
  /**
    * (Streams only) The duration in seconds of a processing window. The range is 1–900 seconds.
    */
  var TumblingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsLambdaMod.TumblingWindowInSeconds] = js.undefined
  
  /**
    * The identifier of the event source mapping.
    */
  var UUID: js.UndefOr[String] = js.undefined
}
object EventSourceMappingConfiguration {
  
  inline def apply(): EventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventSourceMappingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAmazonManagedKafkaEventSourceConfig(value: AmazonManagedKafkaEventSourceConfig): Self = StObject.set(x, "AmazonManagedKafkaEventSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setAmazonManagedKafkaEventSourceConfigUndefined: Self = StObject.set(x, "AmazonManagedKafkaEventSourceConfig", js.undefined)
    
    inline def setBatchSize(value: BatchSize): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = StObject.set(x, "BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    inline def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "BisectBatchOnFunctionError", js.undefined)
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "DestinationConfig", js.undefined)
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "FilterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "FilterCriteria", js.undefined)
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    inline def setFunctionResponseTypes(value: FunctionResponseTypeList): Self = StObject.set(x, "FunctionResponseTypes", value.asInstanceOf[js.Any])
    
    inline def setFunctionResponseTypesUndefined: Self = StObject.set(x, "FunctionResponseTypes", js.undefined)
    
    inline def setFunctionResponseTypesVarargs(value: FunctionResponseType*): Self = StObject.set(x, "FunctionResponseTypes", js.Array(value*))
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setLastProcessingResult(value: String): Self = StObject.set(x, "LastProcessingResult", value.asInstanceOf[js.Any])
    
    inline def setLastProcessingResultUndefined: Self = StObject.set(x, "LastProcessingResult", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = StObject.set(x, "MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "MaximumRecordAgeInSeconds", js.undefined)
    
    inline def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
    
    inline def setParallelizationFactor(value: ParallelizationFactor): Self = StObject.set(x, "ParallelizationFactor", value.asInstanceOf[js.Any])
    
    inline def setParallelizationFactorUndefined: Self = StObject.set(x, "ParallelizationFactor", js.undefined)
    
    inline def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value*))
    
    inline def setSelfManagedEventSource(value: SelfManagedEventSource): Self = StObject.set(x, "SelfManagedEventSource", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedEventSourceUndefined: Self = StObject.set(x, "SelfManagedEventSource", js.undefined)
    
    inline def setSelfManagedKafkaEventSourceConfig(value: SelfManagedKafkaEventSourceConfig): Self = StObject.set(x, "SelfManagedKafkaEventSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedKafkaEventSourceConfigUndefined: Self = StObject.set(x, "SelfManagedKafkaEventSourceConfig", js.undefined)
    
    inline def setSourceAccessConfigurations(value: SourceAccessConfigurations): Self = StObject.set(x, "SourceAccessConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSourceAccessConfigurationsUndefined: Self = StObject.set(x, "SourceAccessConfigurations", js.undefined)
    
    inline def setSourceAccessConfigurationsVarargs(value: SourceAccessConfiguration*): Self = StObject.set(x, "SourceAccessConfigurations", js.Array(value*))
    
    inline def setStartingPosition(value: EventSourcePosition): Self = StObject.set(x, "StartingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionTimestamp(value: js.Date): Self = StObject.set(x, "StartingPositionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionTimestampUndefined: Self = StObject.set(x, "StartingPositionTimestamp", js.undefined)
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "StartingPosition", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReason(value: String): Self = StObject.set(x, "StateTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReasonUndefined: Self = StObject.set(x, "StateTransitionReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTopics(value: Topics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    inline def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value*))
    
    inline def setTumblingWindowInSeconds(value: TumblingWindowInSeconds): Self = StObject.set(x, "TumblingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTumblingWindowInSecondsUndefined: Self = StObject.set(x, "TumblingWindowInSeconds", js.undefined)
    
    inline def setUUID(value: String): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
    
    inline def setUUIDUndefined: Self = StObject.set(x, "UUID", js.undefined)
  }
}
