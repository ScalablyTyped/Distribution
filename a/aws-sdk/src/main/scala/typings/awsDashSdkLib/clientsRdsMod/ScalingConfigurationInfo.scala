package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingConfigurationInfo extends js.Object {
  /**
    * A value that indicates whether automatic pause is allowed for the Aurora DB cluster in serverless DB engine mode. 
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
}

object ScalingConfigurationInfo {
  @scala.inline
  def apply(
    AutoPause: js.UndefOr[BooleanOptional] = js.undefined,
    MaxCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    MinCapacity: js.UndefOr[IntegerOptional] = js.undefined,
    SecondsUntilAutoPause: js.UndefOr[IntegerOptional] = js.undefined
  ): ScalingConfigurationInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoPause)) __obj.updateDynamic("AutoPause")(AutoPause)
    if (!js.isUndefined(MaxCapacity)) __obj.updateDynamic("MaxCapacity")(MaxCapacity)
    if (!js.isUndefined(MinCapacity)) __obj.updateDynamic("MinCapacity")(MinCapacity)
    if (!js.isUndefined(SecondsUntilAutoPause)) __obj.updateDynamic("SecondsUntilAutoPause")(SecondsUntilAutoPause)
    __obj.asInstanceOf[ScalingConfigurationInfo]
  }
}

