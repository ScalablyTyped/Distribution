package typings
package antdDashMobileLib.libFlexPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.baseline | antdDashMobileLib.antdDashMobileLibStrings.stretch
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var direction: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.row | antdDashMobileLib.antdDashMobileLibStrings.`row-reverse` | antdDashMobileLib.antdDashMobileLibStrings.column | antdDashMobileLib.antdDashMobileLibStrings.`column-reverse`
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var justify: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.between | antdDashMobileLib.antdDashMobileLibStrings.around
  ] = js.undefined
  var wrap: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.nowrap | antdDashMobileLib.antdDashMobileLibStrings.wrap | antdDashMobileLib.antdDashMobileLibStrings.`wrap-reverse`
  ] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.baseline | antdDashMobileLib.antdDashMobileLibStrings.stretch = null,
    children: reactLib.reactMod.ReactNode = null,
    direction: antdDashMobileLib.antdDashMobileLibStrings.row | antdDashMobileLib.antdDashMobileLibStrings.`row-reverse` | antdDashMobileLib.antdDashMobileLibStrings.column | antdDashMobileLib.antdDashMobileLibStrings.`column-reverse` = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    justify: antdDashMobileLib.antdDashMobileLibStrings.start | antdDashMobileLib.antdDashMobileLibStrings.end | antdDashMobileLib.antdDashMobileLibStrings.center | antdDashMobileLib.antdDashMobileLibStrings.between | antdDashMobileLib.antdDashMobileLibStrings.around = null,
    wrap: antdDashMobileLib.antdDashMobileLibStrings.nowrap | antdDashMobileLib.antdDashMobileLibStrings.wrap | antdDashMobileLib.antdDashMobileLibStrings.`wrap-reverse` = null
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

