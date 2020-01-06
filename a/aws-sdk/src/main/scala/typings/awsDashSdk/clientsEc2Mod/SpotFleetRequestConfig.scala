package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestConfig extends js.Object {
  /**
    * The progress of the Spot Fleet request. If there is an error, the status is error. After all requests are placed, the status is pending_fulfillment. If the size of the fleet is equal to or greater than its target capacity, the status is fulfilled. If the size of the fleet is decreased, the status is pending_termination while Spot Instances are terminating.
    */
  var ActivityStatus: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ActivityStatus] = js.native
  /**
    * The creation date and time of the request.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * The configuration of the Spot Fleet request.
    */
  var SpotFleetRequestConfig: js.UndefOr[SpotFleetRequestConfigData] = js.native
  /**
    * The ID of the Spot Fleet request.
    */
  var SpotFleetRequestId: js.UndefOr[String] = js.native
  /**
    * The state of the Spot Fleet request.
    */
  var SpotFleetRequestState: js.UndefOr[BatchState] = js.native
}

object SpotFleetRequestConfig {
  @scala.inline
  def apply(
    ActivityStatus: ActivityStatus = null,
    CreateTime: DateTime = null,
    SpotFleetRequestConfig: SpotFleetRequestConfigData = null,
    SpotFleetRequestId: String = null,
    SpotFleetRequestState: BatchState = null
  ): SpotFleetRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (ActivityStatus != null) __obj.updateDynamic("ActivityStatus")(ActivityStatus.asInstanceOf[js.Any])
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (SpotFleetRequestConfig != null) __obj.updateDynamic("SpotFleetRequestConfig")(SpotFleetRequestConfig.asInstanceOf[js.Any])
    if (SpotFleetRequestId != null) __obj.updateDynamic("SpotFleetRequestId")(SpotFleetRequestId.asInstanceOf[js.Any])
    if (SpotFleetRequestState != null) __obj.updateDynamic("SpotFleetRequestState")(SpotFleetRequestState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestConfig]
  }
}

