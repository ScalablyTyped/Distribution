package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshPreferences extends js.Object {
  /**
    * The number of seconds until a newly launched instance is configured and ready to use. During this time, Amazon EC2 Auto Scaling does not immediately move on to the next replacement. The default is to use the value for the health check grace period defined for the group.
    */
  var InstanceWarmup: js.UndefOr[RefreshInstanceWarmup] = js.native
  /**
    * The amount of capacity in the Auto Scaling group that must remain healthy during an instance refresh to allow the operation to continue, as a percentage of the desired capacity of the Auto Scaling group (rounded up to the nearest integer). The default is 90. 
    */
  var MinHealthyPercentage: js.UndefOr[IntPercent] = js.native
}

object RefreshPreferences {
  @scala.inline
  def apply(
    InstanceWarmup: js.UndefOr[RefreshInstanceWarmup] = js.undefined,
    MinHealthyPercentage: js.UndefOr[IntPercent] = js.undefined
  ): RefreshPreferences = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InstanceWarmup)) __obj.updateDynamic("InstanceWarmup")(InstanceWarmup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinHealthyPercentage)) __obj.updateDynamic("MinHealthyPercentage")(MinHealthyPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshPreferences]
  }
}

