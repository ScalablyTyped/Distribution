package typings.atAntDashDesignReactDashNative.esPopoverMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.auto
import typings.atAntDashDesignReactDashNative.esPopoverStyleMod.PopoverStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Placement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends WithThemeStyles[PopoverStyle] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* node */ js.Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
  var overlay: ReactNode
  var placement: js.UndefOr[Placement | auto] = js.undefined
  var renderOverlayComponent: js.UndefOr[js.Function1[/* node */ ReactNode, ReactNode]] = js.undefined
  var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    overlay: ReactNode,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[Double]) => Unit = null,
    placement: Placement | auto = null,
    renderOverlayComponent: /* node */ ReactNode => ReactNode = null,
    styles: Partial[PopoverStyle] = null,
    triggerStyle: StyleProp[ViewStyle] = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (renderOverlayComponent != null) __obj.updateDynamic("renderOverlayComponent")(js.Any.fromFunction1(renderOverlayComponent))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (triggerStyle != null) __obj.updateDynamic("triggerStyle")(triggerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

