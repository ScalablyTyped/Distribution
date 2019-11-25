package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignDisabledHours extends js.Object {
  var align: Anon_Offset
  var disabledHours: js.UndefOr[scala.Nothing] = js.undefined
  var disabledMinutes: js.UndefOr[scala.Nothing] = js.undefined
  var disabledSeconds: js.UndefOr[scala.Nothing] = js.undefined
  var focusOnOpen: Boolean
  var hideDisabledOptions: Boolean
  var placement: String
  var transitionName: String
}

object Anon_AlignDisabledHours {
  @scala.inline
  def apply(
    align: Anon_Offset,
    focusOnOpen: Boolean,
    hideDisabledOptions: Boolean,
    placement: String,
    transitionName: String,
    disabledHours: js.UndefOr[scala.Nothing] = js.undefined,
    disabledMinutes: js.UndefOr[scala.Nothing] = js.undefined,
    disabledSeconds: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_AlignDisabledHours = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], focusOnOpen = focusOnOpen.asInstanceOf[js.Any], hideDisabledOptions = hideDisabledOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledHours)) __obj.updateDynamic("disabledHours")(disabledHours.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledMinutes)) __obj.updateDynamic("disabledMinutes")(disabledMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledSeconds)) __obj.updateDynamic("disabledSeconds")(disabledSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignDisabledHours]
  }
}

