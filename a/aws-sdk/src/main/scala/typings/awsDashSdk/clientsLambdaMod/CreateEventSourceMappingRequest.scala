package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventSourceMappingRequest extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
    */
  var BatchSize: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.BatchSize] = js.undefined
  /**
    * Disables the event source mapping to pause polling and invocation.
    */
  var Enabled: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Enabled] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.  
    */
  var EventSourceArn: Arn
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: typings.awsDashSdk.clientsLambdaMod.FunctionName
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.MaximumBatchingWindowInSeconds] = js.undefined
  /**
    * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams sources. AT_TIMESTAMP is only supported for Amazon Kinesis streams.
    */
  var StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined
  /**
    * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading.
    */
  var StartingPositionTimestamp: js.UndefOr[_Date] = js.undefined
}

object CreateEventSourceMappingRequest {
  @scala.inline
  def apply(
    EventSourceArn: Arn,
    FunctionName: FunctionName,
    BatchSize: Int | Double = null,
    Enabled: js.UndefOr[scala.Boolean] = js.undefined,
    MaximumBatchingWindowInSeconds: Int | Double = null,
    StartingPosition: EventSourcePosition = null,
    StartingPositionTimestamp: _Date = null
  ): CreateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(EventSourceArn = EventSourceArn, FunctionName = FunctionName)
    if (BatchSize != null) __obj.updateDynamic("BatchSize")(BatchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (MaximumBatchingWindowInSeconds != null) __obj.updateDynamic("MaximumBatchingWindowInSeconds")(MaximumBatchingWindowInSeconds.asInstanceOf[js.Any])
    if (StartingPosition != null) __obj.updateDynamic("StartingPosition")(StartingPosition.asInstanceOf[js.Any])
    if (StartingPositionTimestamp != null) __obj.updateDynamic("StartingPositionTimestamp")(StartingPositionTimestamp)
    __obj.asInstanceOf[CreateEventSourceMappingRequest]
  }
}

