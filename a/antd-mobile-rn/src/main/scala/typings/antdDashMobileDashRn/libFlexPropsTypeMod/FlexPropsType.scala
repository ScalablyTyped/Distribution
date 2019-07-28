package typings.antdDashMobileDashRn.libFlexPropsTypeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.`column-reverse`
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.`row-reverse`
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.`wrap-reverse`
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.around
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.baseline
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.between
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.center
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.column
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.end
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.nowrap
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.row
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.start
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.stretch
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.wrap
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[
    nowrap | typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.wrap | `wrap-reverse`
  ] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    children: ReactNode = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
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

