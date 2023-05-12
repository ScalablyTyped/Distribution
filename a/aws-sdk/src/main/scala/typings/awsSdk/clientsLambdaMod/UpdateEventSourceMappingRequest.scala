package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventSourceMappingRequest extends StObject {
  
  /**
    * The maximum number of records in each batch that Lambda pulls from your stream or queue and sends to your function. Lambda passes all of the records in the batch to the function in a single call, up to the payload limit for synchronous invocation (6 MB).    Amazon Kinesis – Default 100. Max 10,000.    Amazon DynamoDB Streams – Default 100. Max 10,000.    Amazon Simple Queue Service – Default 10. For standard queues the max is 10,000. For FIFO queues the max is 10.    Amazon Managed Streaming for Apache Kafka – Default 100. Max 10,000.    Self-managed Apache Kafka – Default 100. Max 10,000.    Amazon MQ (ActiveMQ and RabbitMQ) – Default 100. Max 10,000.    DocumentDB – Default 100. Max 10,000.  
    */
  var BatchSize: js.UndefOr[typings.awsSdk.clientsLambdaMod.BatchSize] = js.undefined
  
  /**
    * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two and retry.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typings.awsSdk.clientsLambdaMod.BisectBatchOnFunctionError] = js.undefined
  
  /**
    * (Kinesis and DynamoDB Streams only) A standard Amazon SQS queue or standard Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.DestinationConfig] = js.undefined
  
  /**
    * Specific configuration settings for a DocumentDB event source.
    */
  var DocumentDBEventSourceConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.DocumentDBEventSourceConfig] = js.undefined
  
  /**
    * When true, the event source mapping is active. When false, Lambda pauses polling and invocation. Default: True
    */
  var Enabled: js.UndefOr[typings.awsSdk.clientsLambdaMod.Enabled] = js.undefined
  
  /**
    * An object that defines the filter criteria that determine whether Lambda should process an event. For more information, see Lambda event filtering.
    */
  var FilterCriteria: js.UndefOr[typings.awsSdk.clientsLambdaMod.FilterCriteria] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name – MyFunction.    Function ARN – arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN – arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN – 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: js.UndefOr[typings.awsSdk.clientsLambdaMod.FunctionName] = js.undefined
  
  /**
    * (Kinesis, DynamoDB Streams, and Amazon SQS) A list of current response type enums applied to the event source mapping.
    */
  var FunctionResponseTypes: js.UndefOr[FunctionResponseTypeList] = js.undefined
  
  /**
    * The maximum amount of time, in seconds, that Lambda spends gathering records before invoking the function. You can configure MaximumBatchingWindowInSeconds to any value from 0 seconds to 300 seconds in increments of seconds. For streams and Amazon SQS event sources, the default batching window is 0 seconds. For Amazon MSK, Self-managed Apache Kafka, Amazon MQ, and DocumentDB event sources, the default batching window is 500 ms. Note that because you can only change MaximumBatchingWindowInSeconds in increments of seconds, you cannot revert back to the 500 ms default batching window after you have changed it. To restore the default batching window, you must create a new event source mapping. Related setting: For streams and Amazon SQS event sources, when you set BatchSize to a value greater than 10, you must set MaximumBatchingWindowInSeconds to at least 1.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsLambdaMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * (Kinesis and DynamoDB Streams only) Discard records older than the specified age. The default value is infinite (-1).
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typings.awsSdk.clientsLambdaMod.MaximumRecordAgeInSeconds] = js.undefined
  
  /**
    * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries. The default value is infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined
  
  /**
    * (Kinesis and DynamoDB Streams only) The number of batches to process from each shard concurrently.
    */
  var ParallelizationFactor: js.UndefOr[typings.awsSdk.clientsLambdaMod.ParallelizationFactor] = js.undefined
  
  /**
    * (Amazon SQS only) The scaling configuration for the event source. For more information, see Configuring maximum concurrency for Amazon SQS event sources.
    */
  var ScalingConfig: js.UndefOr[typings.awsSdk.clientsLambdaMod.ScalingConfig] = js.undefined
  
  /**
    * An array of authentication protocols or VPC components required to secure your event source.
    */
  var SourceAccessConfigurations: js.UndefOr[typings.awsSdk.clientsLambdaMod.SourceAccessConfigurations] = js.undefined
  
  /**
    * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for DynamoDB and Kinesis Streams event sources. A value of 0 seconds indicates no tumbling window.
    */
  var TumblingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsLambdaMod.TumblingWindowInSeconds] = js.undefined
  
  /**
    * The identifier of the event source mapping.
    */
  var UUID: String
}
object UpdateEventSourceMappingRequest {
  
  inline def apply(UUID: String): UpdateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventSourceMappingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEventSourceMappingRequest] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: BatchSize): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = StObject.set(x, "BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    inline def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "BisectBatchOnFunctionError", js.undefined)
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "DestinationConfig", js.undefined)
    
    inline def setDocumentDBEventSourceConfig(value: DocumentDBEventSourceConfig): Self = StObject.set(x, "DocumentDBEventSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setDocumentDBEventSourceConfigUndefined: Self = StObject.set(x, "DocumentDBEventSourceConfig", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "FilterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "FilterCriteria", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setFunctionResponseTypes(value: FunctionResponseTypeList): Self = StObject.set(x, "FunctionResponseTypes", value.asInstanceOf[js.Any])
    
    inline def setFunctionResponseTypesUndefined: Self = StObject.set(x, "FunctionResponseTypes", js.undefined)
    
    inline def setFunctionResponseTypesVarargs(value: FunctionResponseType*): Self = StObject.set(x, "FunctionResponseTypes", js.Array(value*))
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = StObject.set(x, "MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "MaximumRecordAgeInSeconds", js.undefined)
    
    inline def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
    
    inline def setParallelizationFactor(value: ParallelizationFactor): Self = StObject.set(x, "ParallelizationFactor", value.asInstanceOf[js.Any])
    
    inline def setParallelizationFactorUndefined: Self = StObject.set(x, "ParallelizationFactor", js.undefined)
    
    inline def setScalingConfig(value: ScalingConfig): Self = StObject.set(x, "ScalingConfig", value.asInstanceOf[js.Any])
    
    inline def setScalingConfigUndefined: Self = StObject.set(x, "ScalingConfig", js.undefined)
    
    inline def setSourceAccessConfigurations(value: SourceAccessConfigurations): Self = StObject.set(x, "SourceAccessConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSourceAccessConfigurationsUndefined: Self = StObject.set(x, "SourceAccessConfigurations", js.undefined)
    
    inline def setSourceAccessConfigurationsVarargs(value: SourceAccessConfiguration*): Self = StObject.set(x, "SourceAccessConfigurations", js.Array(value*))
    
    inline def setTumblingWindowInSeconds(value: TumblingWindowInSeconds): Self = StObject.set(x, "TumblingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTumblingWindowInSecondsUndefined: Self = StObject.set(x, "TumblingWindowInSeconds", js.undefined)
    
    inline def setUUID(value: String): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
  }
}
