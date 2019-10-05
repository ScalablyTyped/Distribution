package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingConfigurationInfo extends js.Object {
  /**
    * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in serverless DB engine mode. When the value is set to false for an Aurora Serverless DB cluster, the DB cluster automatically resumes.
    */
  var AutoPause: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The maximum capacity for an Aurora DB cluster in serverless DB engine mode.
    */
  var MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The maximum capacity for the Aurora DB cluster in serverless DB engine mode.
    */
  var MinCapacity: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The remaining amount of time, in seconds, before the Aurora DB cluster in serverless mode is paused. A DB cluster can be paused only when it's idle (it has no connections).
    */
  var SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The timeout action of a call to ModifyCurrentDBClusterCapacity, either ForceApplyCapacityChange or RollbackCapacityChange.
    */
  var TimeoutAction: js.UndefOr[String] = js.undefined
}

object ScalingConfigurationInfo {
  @scala.inline
  def apply(
    AutoPause: js.UndefOr[scala.Boolean] = js.undefined,
    MaxCapacity: Int | scala.Double = null,
    MinCapacity: Int | scala.Double = null,
    SecondsUntilAutoPause: Int | scala.Double = null,
    TimeoutAction: String = null
  ): ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoPause)) __obj.updateDynamic("AutoPause")(AutoPause)
    if (MaxCapacity != null) __obj.updateDynamic("MaxCapacity")(MaxCapacity.asInstanceOf[js.Any])
    if (MinCapacity != null) __obj.updateDynamic("MinCapacity")(MinCapacity.asInstanceOf[js.Any])
    if (SecondsUntilAutoPause != null) __obj.updateDynamic("SecondsUntilAutoPause")(SecondsUntilAutoPause.asInstanceOf[js.Any])
    if (TimeoutAction != null) __obj.updateDynamic("TimeoutAction")(TimeoutAction)
    __obj.asInstanceOf[ScalingConfigurationInfo]
  }
}

