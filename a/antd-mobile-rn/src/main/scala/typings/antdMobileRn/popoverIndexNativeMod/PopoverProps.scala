package typings.antdMobileRn.popoverIndexNativeMod

import typings.antdMobileRn.popoverPropsTypeMod.PopoverPropsType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
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
    contextStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    overlay: ReactNode = null,
    overlayStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    renderOverlayComponent: /* values */ js.Any => Element = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    triggerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contextStyle)) __obj.updateDynamic("contextStyle")(contextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayStyle)) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1(renderOverlayComponent))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerStyle)) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

