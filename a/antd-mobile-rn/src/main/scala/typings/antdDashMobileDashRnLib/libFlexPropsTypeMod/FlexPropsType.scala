package typings
package antdDashMobileDashRnLib.libFlexPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.start | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.center | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.end | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.baseline | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.stretch
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var direction: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.row | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`row-reverse` | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.column | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`column-reverse`
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var justify: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.start | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.end | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.center | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.between | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.around
  ] = js.undefined
  var wrap: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.nowrap | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.wrap | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`wrap-reverse`
  ] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.start | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.center | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.end | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.baseline | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.stretch = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    direction: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.row | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`row-reverse` | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.column | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`column-reverse` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    justify: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.start | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.end | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.center | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.between | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.around = null,
    wrap: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.nowrap | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.wrap | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.`wrap-reverse` = null
  ): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

