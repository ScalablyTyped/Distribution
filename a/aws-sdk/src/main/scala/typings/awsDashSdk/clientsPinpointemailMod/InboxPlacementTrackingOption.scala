package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InboxPlacementTrackingOption extends js.Object {
  /**
    * Specifies whether inbox placement data is being tracked for the domain.
    */
  var Global: js.UndefOr[Enabled] = js.undefined
  /**
    * An array of strings, one for each major email provider that the inbox placement data applies to.
    */
  var TrackedIsps: js.UndefOr[IspNameList] = js.undefined
}

object InboxPlacementTrackingOption {
  @scala.inline
  def apply(Global: js.UndefOr[Boolean] = js.undefined, TrackedIsps: IspNameList = null): InboxPlacementTrackingOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Global)) __obj.updateDynamic("Global")(Global)
    if (TrackedIsps != null) __obj.updateDynamic("TrackedIsps")(TrackedIsps)
    __obj.asInstanceOf[InboxPlacementTrackingOption]
  }
}

