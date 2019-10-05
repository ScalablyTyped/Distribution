package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventSourceMappingsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the event source.    Amazon Kinesis - The ARN of the data stream or a stream consumer.    Amazon DynamoDB Streams - The ARN of the stream.    Amazon Simple Queue Service - The ARN of the queue.  
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.FunctionName] = js.undefined
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of event source mappings to return.
    */
  var MaxItems: js.UndefOr[MaxListItems] = js.undefined
}

object ListEventSourceMappingsRequest {
  @scala.inline
  def apply(
    EventSourceArn: Arn = null,
    FunctionName: FunctionName = null,
    Marker: String = null,
    MaxItems: Int | Double = null
  ): ListEventSourceMappingsRequest = {
    val __obj = js.Dynamic.literal()
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn)
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventSourceMappingsRequest]
  }
}

