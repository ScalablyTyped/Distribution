package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scte35TimeSignalApos extends js.Object {
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
    */
  var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined
  /**
    * When set to ignore, Segment Descriptors with noRegionalBlackoutFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var NoRegionalBlackoutFlag: js.UndefOr[Scte35AposNoRegionalBlackoutBehavior] = js.undefined
  /**
    * When set to ignore, Segment Descriptors with webDeliveryAllowedFlag set to 0 will no longer trigger blackouts or Ad Avail slates
    */
  var WebDeliveryAllowedFlag: js.UndefOr[Scte35AposWebDeliveryAllowedBehavior] = js.undefined
}

object Scte35TimeSignalApos {
  @scala.inline
  def apply(
    AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined,
    NoRegionalBlackoutFlag: Scte35AposNoRegionalBlackoutBehavior = null,
    WebDeliveryAllowedFlag: Scte35AposWebDeliveryAllowedBehavior = null
  ): Scte35TimeSignalApos = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AdAvailOffset)) __obj.updateDynamic("AdAvailOffset")(AdAvailOffset)
    if (NoRegionalBlackoutFlag != null) __obj.updateDynamic("NoRegionalBlackoutFlag")(NoRegionalBlackoutFlag.asInstanceOf[js.Any])
    if (WebDeliveryAllowedFlag != null) __obj.updateDynamic("WebDeliveryAllowedFlag")(WebDeliveryAllowedFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35TimeSignalApos]
  }
}

