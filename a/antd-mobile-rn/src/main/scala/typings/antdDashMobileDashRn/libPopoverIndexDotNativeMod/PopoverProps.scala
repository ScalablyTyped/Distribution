package typings.antdDashMobileDashRn.libPopoverIndexDotNativeMod

import typings.antdDashMobileDashRn.libPopoverPropsTypeMod.PopoverPropsType
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends PopoverPropsType {
  var contextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var renderOverlayComponent: js.UndefOr[js.Function1[/* values */ js.Any, Element]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    contextStyle: StyleProp[ViewStyle] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    overlay: ReactNode = null,
    overlayStyle: StyleProp[ViewStyle] = null,
    renderOverlayComponent: /* values */ js.Any => Element = null,
    style: StyleProp[ViewStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (contextStyle != null) __obj.updateDynamic("contextStyle")(contextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1(renderOverlayComponent))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

