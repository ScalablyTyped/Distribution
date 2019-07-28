package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateSpotMarketOptions extends js.Object {
  /**
    * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
    */
  var BlockDurationMinutes: js.UndefOr[Integer] = js.undefined
  /**
    * The behavior when a Spot Instance is interrupted.
    */
  var InstanceInterruptionBehavior: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceInterruptionBehavior] = js.undefined
  /**
    * The maximum hourly price you're willing to pay for the Spot Instances.
    */
  var MaxPrice: js.UndefOr[String] = js.undefined
  /**
    * The Spot Instance request type.
    */
  var SpotInstanceType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.SpotInstanceType] = js.undefined
  /**
    * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached.
    */
  var ValidUntil: js.UndefOr[DateTime] = js.undefined
}

object LaunchTemplateSpotMarketOptions {
  @scala.inline
  def apply(
    BlockDurationMinutes: js.UndefOr[Integer] = js.undefined,
    InstanceInterruptionBehavior: InstanceInterruptionBehavior = null,
    MaxPrice: String = null,
    SpotInstanceType: SpotInstanceType = null,
    ValidUntil: DateTime = null
  ): LaunchTemplateSpotMarketOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BlockDurationMinutes)) __obj.updateDynamic("BlockDurationMinutes")(BlockDurationMinutes)
    if (InstanceInterruptionBehavior != null) __obj.updateDynamic("InstanceInterruptionBehavior")(InstanceInterruptionBehavior.asInstanceOf[js.Any])
    if (MaxPrice != null) __obj.updateDynamic("MaxPrice")(MaxPrice)
    if (SpotInstanceType != null) __obj.updateDynamic("SpotInstanceType")(SpotInstanceType.asInstanceOf[js.Any])
    if (ValidUntil != null) __obj.updateDynamic("ValidUntil")(ValidUntil)
    __obj.asInstanceOf[LaunchTemplateSpotMarketOptions]
  }
}

