package typings.antDesignReactNative.listPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings._empty
import typings.antDesignReactNative.antDesignReactNativeStrings.android
import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.down
import typings.antDesignReactNative.antDesignReactNativeStrings.empty
import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.ios
import typings.antDesignReactNative.antDesignReactNativeStrings.middle
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.antDesignReactNativeStrings.up
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemPropsType extends js.Object {
  var activeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var align: js.UndefOr[top | middle | bottom] = js.undefined
  var arrow: js.UndefOr[horizontal | down | up | empty | _empty] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[Boolean] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var multipleLine: js.UndefOr[Boolean] = js.undefined
  var platform: js.UndefOr[android | ios] = js.undefined
  var thumb: js.UndefOr[ReactNode | Null] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object ListItemPropsType {
  @scala.inline
  def apply(
    activeStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    platform: android | ios = null,
    thumb: js.UndefOr[Null | ReactNode] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ListItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeStyle)) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.get.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(thumb)) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemPropsType]
  }
}

