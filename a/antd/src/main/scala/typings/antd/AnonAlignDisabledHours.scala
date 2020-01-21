package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignDisabledHours extends js.Object {
  var align: AnonOffset
  var disabledHours: js.UndefOr[scala.Nothing] = js.undefined
  var disabledMinutes: js.UndefOr[scala.Nothing] = js.undefined
  var disabledSeconds: js.UndefOr[scala.Nothing] = js.undefined
  var focusOnOpen: Boolean
  var hideDisabledOptions: Boolean
  var placement: String
  var transitionName: String
}

object AnonAlignDisabledHours {
  @scala.inline
  def apply(
    align: AnonOffset,
    focusOnOpen: Boolean,
    hideDisabledOptions: Boolean,
    placement: String,
    transitionName: String,
    disabledHours: js.UndefOr[scala.Nothing] = js.undefined,
    disabledMinutes: js.UndefOr[scala.Nothing] = js.undefined,
    disabledSeconds: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonAlignDisabledHours = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], focusOnOpen = focusOnOpen.asInstanceOf[js.Any], hideDisabledOptions = hideDisabledOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledHours)) __obj.updateDynamic("disabledHours")(disabledHours.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledMinutes)) __obj.updateDynamic("disabledMinutes")(disabledMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledSeconds)) __obj.updateDynamic("disabledSeconds")(disabledSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignDisabledHours]
  }
}

