package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEventSourceMappingRequest extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
    */
  var BatchSize: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.BatchSize] = js.undefined
  /**
    * Disables the event source mapping to pause polling and invocation.
    */
  var Enabled: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Enabled] = js.undefined
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.FunctionName] = js.undefined
  /**
    * The identifier of the event source mapping.
    */
  var UUID: String
}

object UpdateEventSourceMappingRequest {
  @scala.inline
  def apply(
    UUID: String,
    BatchSize: js.UndefOr[BatchSize] = js.undefined,
    Enabled: js.UndefOr[Enabled] = js.undefined,
    FunctionName: FunctionName = null
  ): UpdateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID)
    if (!js.isUndefined(BatchSize)) __obj.updateDynamic("BatchSize")(BatchSize)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName)
    __obj.asInstanceOf[UpdateEventSourceMappingRequest]
  }
}

