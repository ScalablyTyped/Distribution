package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipeSourceDynamoDBStreamParameters extends StObject {
  
  /**
    * The maximum number of records to include in each batch.
    */
  var BatchSize: js.UndefOr[LimitMax10000] = js.undefined
  
  /**
    * Define the target queue to send dead-letter queue events to.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.clientsPipesMod.DeadLetterConfig] = js.undefined
  
  /**
    * The maximum length of a time to wait for events.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.clientsPipesMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * (Streams only) Discard records older than the specified age. The default value is -1, which sets the maximum age to infinite. When the value is set to infinite, EventBridge never discards old records. 
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typings.awsSdk.clientsPipesMod.MaximumRecordAgeInSeconds] = js.undefined
  
  /**
    * (Streams only) Discard records after the specified number of retries. The default value is -1, which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite, EventBridge retries failed records until the record expires in the event source.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsESM] = js.undefined
  
  /**
    * (Streams only) Define how to handle item process failures. AUTOMATIC_BISECT halves each batch and retry each half until all the records are processed or there is one failed message left in the batch.
    */
  var OnPartialBatchItemFailure: js.UndefOr[OnPartialBatchItemFailureStreams] = js.undefined
  
  /**
    * (Streams only) The number of batches to process concurrently from each shard. The default value is 1.
    */
  var ParallelizationFactor: js.UndefOr[LimitMax10] = js.undefined
}
object UpdatePipeSourceDynamoDBStreamParameters {
  
  inline def apply(): UpdatePipeSourceDynamoDBStreamParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipeSourceDynamoDBStreamParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipeSourceDynamoDBStreamParameters] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: LimitMax10000): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = StObject.set(x, "MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "MaximumRecordAgeInSeconds", js.undefined)
    
    inline def setMaximumRetryAttempts(value: MaximumRetryAttemptsESM): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
    
    inline def setOnPartialBatchItemFailure(value: OnPartialBatchItemFailureStreams): Self = StObject.set(x, "OnPartialBatchItemFailure", value.asInstanceOf[js.Any])
    
    inline def setOnPartialBatchItemFailureUndefined: Self = StObject.set(x, "OnPartialBatchItemFailure", js.undefined)
    
    inline def setParallelizationFactor(value: LimitMax10): Self = StObject.set(x, "ParallelizationFactor", value.asInstanceOf[js.Any])
    
    inline def setParallelizationFactorUndefined: Self = StObject.set(x, "ParallelizationFactor", js.undefined)
  }
}
