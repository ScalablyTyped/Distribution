package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSourceMappingConfiguration extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.
    */
  var BatchSize: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.BatchSize] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the event source.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the Lambda function.
    */
  var FunctionArn: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.FunctionArn] = js.undefined
  /**
    * The date that the event source mapping was last updated.
    */
  var LastModified: js.UndefOr[_Date] = js.undefined
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  var LastProcessingResult: js.UndefOr[String] = js.undefined
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.MaximumBatchingWindowInSeconds] = js.undefined
  /**
    * The state of the event source mapping. It can be one of the following: Creating, Enabling, Enabled, Disabling, Disabled, Updating, or Deleting.
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * The cause of the last state change, either User initiated or Lambda initiated.
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the event source mapping.
    */
  var UUID: js.UndefOr[String] = js.undefined
}

object EventSourceMappingConfiguration {
  @scala.inline
  def apply(
    BatchSize: js.UndefOr[BatchSize] = js.undefined,
    EventSourceArn: Arn = null,
    FunctionArn: FunctionArn = null,
    LastModified: _Date = null,
    LastProcessingResult: String = null,
    MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
    State: String = null,
    StateTransitionReason: String = null,
    UUID: String = null
  ): EventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BatchSize)) __obj.updateDynamic("BatchSize")(BatchSize)
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn)
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (LastProcessingResult != null) __obj.updateDynamic("LastProcessingResult")(LastProcessingResult)
    if (!js.isUndefined(MaximumBatchingWindowInSeconds)) __obj.updateDynamic("MaximumBatchingWindowInSeconds")(MaximumBatchingWindowInSeconds)
    if (State != null) __obj.updateDynamic("State")(State)
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason)
    if (UUID != null) __obj.updateDynamic("UUID")(UUID)
    __obj.asInstanceOf[EventSourceMappingConfiguration]
  }
}

