package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEventSourceMappingRequest extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
    */
  var BatchSize: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.BatchSize] = js.native
  /**
    * (Streams) If the function returns an error, split the batch in two and retry.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.BisectBatchOnFunctionError] = js.native
  /**
    * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.DestinationConfig] = js.native
  /**
    * Disables the event source mapping to pause polling and invocation.
    */
  var Enabled: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Enabled] = js.native
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.FunctionName] = js.native
  /**
    * The maximum amount of time to gather records before invoking the function, in seconds.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.MaximumBatchingWindowInSeconds] = js.native
  /**
    * (Streams) The maximum age of a record that Lambda sends to a function for processing.
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.MaximumRecordAgeInSeconds] = js.native
  /**
    * (Streams) The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.native
  /**
    * (Streams) The number of batches to process from each shard concurrently.
    */
  var ParallelizationFactor: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.ParallelizationFactor] = js.native
  /**
    * The identifier of the event source mapping.
    */
  var UUID: String = js.native
}

object UpdateEventSourceMappingRequest {
  @scala.inline
  def apply(
    UUID: String,
    BatchSize: Int | Double = null,
    BisectBatchOnFunctionError: js.UndefOr[scala.Boolean] = js.undefined,
    DestinationConfig: DestinationConfig = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    FunctionName: FunctionName = null,
    MaximumBatchingWindowInSeconds: Int | Double = null,
    MaximumRecordAgeInSeconds: Int | Double = null,
    MaximumRetryAttempts: Int | Double = null,
    ParallelizationFactor: Int | Double = null
  ): UpdateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
    if (BatchSize != null) __obj.updateDynamic("BatchSize")(BatchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(BisectBatchOnFunctionError)) __obj.updateDynamic("BisectBatchOnFunctionError")(BisectBatchOnFunctionError.asInstanceOf[js.Any])
    if (DestinationConfig != null) __obj.updateDynamic("DestinationConfig")(DestinationConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName.asInstanceOf[js.Any])
    if (MaximumBatchingWindowInSeconds != null) __obj.updateDynamic("MaximumBatchingWindowInSeconds")(MaximumBatchingWindowInSeconds.asInstanceOf[js.Any])
    if (MaximumRecordAgeInSeconds != null) __obj.updateDynamic("MaximumRecordAgeInSeconds")(MaximumRecordAgeInSeconds.asInstanceOf[js.Any])
    if (MaximumRetryAttempts != null) __obj.updateDynamic("MaximumRetryAttempts")(MaximumRetryAttempts.asInstanceOf[js.Any])
    if (ParallelizationFactor != null) __obj.updateDynamic("ParallelizationFactor")(ParallelizationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventSourceMappingRequest]
  }
}

