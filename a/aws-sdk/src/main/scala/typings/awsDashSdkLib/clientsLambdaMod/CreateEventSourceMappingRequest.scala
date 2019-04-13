package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventSourceMappingRequest extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
    */
  var BatchSize: js.UndefOr[BatchSize] = js.undefined
  /**
    * Disables the event source mapping to pause polling and invocation.
    */
  var Enabled: js.UndefOr[Enabled] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.  
    */
  var EventSourceArn: Arn
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: awsDashSdkLib.clientsLambdaMod.FunctionName
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
    BatchSize: js.UndefOr[BatchSize] = js.undefined,
    Enabled: js.UndefOr[Enabled] = js.undefined,
    StartingPosition: EventSourcePosition = null,
    StartingPositionTimestamp: _Date = null
  ): CreateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(EventSourceArn = EventSourceArn, FunctionName = FunctionName)
    if (!js.isUndefined(BatchSize)) __obj.updateDynamic("BatchSize")(BatchSize)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (StartingPosition != null) __obj.updateDynamic("StartingPosition")(StartingPosition.asInstanceOf[js.Any])
    if (StartingPositionTimestamp != null) __obj.updateDynamic("StartingPositionTimestamp")(StartingPositionTimestamp)
    __obj.asInstanceOf[CreateEventSourceMappingRequest]
  }
}

