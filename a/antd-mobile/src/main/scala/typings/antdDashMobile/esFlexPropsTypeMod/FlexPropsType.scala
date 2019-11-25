package typings.antdDashMobile.esFlexPropsTypeMod

import typings.antdDashMobile.antdDashMobileStrings.`column-reverse`
import typings.antdDashMobile.antdDashMobileStrings.`row-reverse`
import typings.antdDashMobile.antdDashMobileStrings.`wrap-reverse`
import typings.antdDashMobile.antdDashMobileStrings.around
import typings.antdDashMobile.antdDashMobileStrings.baseline
import typings.antdDashMobile.antdDashMobileStrings.between
import typings.antdDashMobile.antdDashMobileStrings.center
import typings.antdDashMobile.antdDashMobileStrings.column
import typings.antdDashMobile.antdDashMobileStrings.end
import typings.antdDashMobile.antdDashMobileStrings.nowrap
import typings.antdDashMobile.antdDashMobileStrings.row
import typings.antdDashMobile.antdDashMobileStrings.start
import typings.antdDashMobile.antdDashMobileStrings.stretch
import typings.antdDashMobile.antdDashMobileStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[nowrap | typings.antdDashMobile.antdDashMobileStrings.wrap | `wrap-reverse`] = js.undefined
}

object FlexPropsType {
  @scala.inline
  def apply(
    align: start | center | end | baseline | stretch = null,
    direction: row | `row-reverse` | column | `column-reverse` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    justify: start | end | center | between | around = null,
    wrap: nowrap | wrap | `wrap-reverse` = null
  ): FlexPropsType = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

