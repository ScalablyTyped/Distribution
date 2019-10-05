package typings.awsDashSdk.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspendedState extends js.Object {
  /**
    * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended. Set the value to true if you don't want Application Auto Scaling to remove capacity when a scaling policy is triggered. The default is false. 
    */
  var DynamicScalingInSuspended: js.UndefOr[ScalingSuspended] = js.undefined
  /**
    * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended. Set the value to true if you don't want Application Auto Scaling to add capacity when a scaling policy is triggered. The default is false. 
    */
  var DynamicScalingOutSuspended: js.UndefOr[ScalingSuspended] = js.undefined
  /**
    * Whether scheduled scaling is suspended. Set the value to true if you don't want Application Auto Scaling to add or remove capacity by initiating scheduled actions. The default is false. 
    */
  var ScheduledScalingSuspended: js.UndefOr[ScalingSuspended] = js.undefined
}

object SuspendedState {
  @scala.inline
  def apply(
    DynamicScalingInSuspended: js.UndefOr[Boolean] = js.undefined,
    DynamicScalingOutSuspended: js.UndefOr[Boolean] = js.undefined,
    ScheduledScalingSuspended: js.UndefOr[Boolean] = js.undefined
  ): SuspendedState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DynamicScalingInSuspended)) __obj.updateDynamic("DynamicScalingInSuspended")(DynamicScalingInSuspended)
    if (!js.isUndefined(DynamicScalingOutSuspended)) __obj.updateDynamic("DynamicScalingOutSuspended")(DynamicScalingOutSuspended)
    if (!js.isUndefined(ScheduledScalingSuspended)) __obj.updateDynamic("ScheduledScalingSuspended")(ScheduledScalingSuspended)
    __obj.asInstanceOf[SuspendedState]
  }
}

