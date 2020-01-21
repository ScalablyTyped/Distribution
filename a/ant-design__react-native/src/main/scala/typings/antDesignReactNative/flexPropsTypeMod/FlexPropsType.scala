package typings.antDesignReactNative.flexPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.`column-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.`row-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.`wrap-reverse`
import typings.antDesignReactNative.antDesignReactNativeStrings.around
import typings.antDesignReactNative.antDesignReactNativeStrings.baseline
import typings.antDesignReactNative.antDesignReactNativeStrings.between
import typings.antDesignReactNative.antDesignReactNativeStrings.center
import typings.antDesignReactNative.antDesignReactNativeStrings.column
import typings.antDesignReactNative.antDesignReactNativeStrings.end
import typings.antDesignReactNative.antDesignReactNativeStrings.nowrap
import typings.antDesignReactNative.antDesignReactNativeStrings.row
import typings.antDesignReactNative.antDesignReactNativeStrings.start
import typings.antDesignReactNative.antDesignReactNativeStrings.stretch
import typings.antDesignReactNative.antDesignReactNativeStrings.wrap
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
  var wrap: js.UndefOr[
    nowrap | typings.antDesignReactNative.antDesignReactNativeStrings.wrap | `wrap-reverse`
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

