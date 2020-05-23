package typings.antdMobileRn.flexPropsTypeMod

import typings.antdMobileRn.antdMobileRnStrings.`column-reverse`
import typings.antdMobileRn.antdMobileRnStrings.`row-reverse`
import typings.antdMobileRn.antdMobileRnStrings.`wrap-reverse`
import typings.antdMobileRn.antdMobileRnStrings.around
import typings.antdMobileRn.antdMobileRnStrings.baseline
import typings.antdMobileRn.antdMobileRnStrings.between
import typings.antdMobileRn.antdMobileRnStrings.center
import typings.antdMobileRn.antdMobileRnStrings.column
import typings.antdMobileRn.antdMobileRnStrings.end
import typings.antdMobileRn.antdMobileRnStrings.nowrap
import typings.antdMobileRn.antdMobileRnStrings.row
import typings.antdMobileRn.antdMobileRnStrings.start
import typings.antdMobileRn.antdMobileRnStrings.stretch
import typings.antdMobileRn.antdMobileRnStrings.wrap
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexPropsType extends js.Object {
  var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var direction: js.UndefOr[row | `row-reverse` | column | `column-reverse`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var justify: js.UndefOr[start | end | center | between | around] = js.undefined
  var wrap: js.UndefOr[nowrap | typings.antdMobileRn.antdMobileRnStrings.wrap | `wrap-reverse`] = js.undefined
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

