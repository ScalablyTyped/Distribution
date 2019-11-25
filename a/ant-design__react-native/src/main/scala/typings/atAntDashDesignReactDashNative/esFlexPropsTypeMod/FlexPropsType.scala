package typings.atAntDashDesignReactDashNative.esFlexPropsTypeMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`column-reverse`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`row-reverse`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.`wrap-reverse`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.around
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.baseline
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.between
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.center
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.column
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.end
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.nowrap
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.row
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.start
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.stretch
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.wrap
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
    nowrap | typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.wrap | `wrap-reverse`
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
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexPropsType]
  }
}

