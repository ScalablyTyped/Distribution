package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignDisabled extends js.Object {
  var align: Anon_Offset
  var disabled: scala.Boolean
  var disabledHours: js.UndefOr[scala.Nothing] = js.undefined
  var disabledMinutes: js.UndefOr[scala.Nothing] = js.undefined
  var disabledSeconds: js.UndefOr[scala.Nothing] = js.undefined
  var focusOnOpen: scala.Boolean
  var hideDisabledOptions: scala.Boolean
  var placement: java.lang.String
  var transitionName: java.lang.String
}

object Anon_AlignDisabled {
  @scala.inline
  def apply(
    align: Anon_Offset,
    disabled: scala.Boolean,
    focusOnOpen: scala.Boolean,
    hideDisabledOptions: scala.Boolean,
    placement: java.lang.String,
    transitionName: java.lang.String,
    disabledHours: js.UndefOr[scala.Nothing] = js.undefined,
    disabledMinutes: js.UndefOr[scala.Nothing] = js.undefined,
    disabledSeconds: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_AlignDisabled = {
    val __obj = js.Dynamic.literal(align = align, disabled = disabled, focusOnOpen = focusOnOpen, hideDisabledOptions = hideDisabledOptions, placement = placement, transitionName = transitionName)
    if (!js.isUndefined(disabledHours)) __obj.updateDynamic("disabledHours")(disabledHours)
    if (!js.isUndefined(disabledMinutes)) __obj.updateDynamic("disabledMinutes")(disabledMinutes)
    if (!js.isUndefined(disabledSeconds)) __obj.updateDynamic("disabledSeconds")(disabledSeconds)
    __obj.asInstanceOf[Anon_AlignDisabled]
  }
}

