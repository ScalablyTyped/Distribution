package typings
package atAntDashDesignReactDashNativeLib.libListPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemPropsType extends js.Object {
  var activeStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var align: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.middle | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom
  ] = js.undefined
  var arrow: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.down | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.up | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.empty | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.Empty
  ] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var error: js.UndefOr[scala.Boolean] = js.undefined
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var multipleLine: js.UndefOr[scala.Boolean] = js.undefined
  var platform: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.android | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ios
  ] = js.undefined
  var thumb: js.UndefOr[reactLib.reactMod.ReactNode | scala.Null] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object ListItemPropsType {
  @scala.inline
  def apply(
    activeStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    align: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.middle | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom = null,
    arrow: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.down | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.up | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.empty | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.Empty = null,
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    multipleLine: js.UndefOr[scala.Boolean] = js.undefined,
    platform: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.android | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ios = null,
    thumb: reactLib.reactMod.ReactNode = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ListItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ListItemPropsType]
  }
}

