package typings
package atAntDashDesignReactDashNativeLib.libPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps
  extends atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.libPopoverStyleMod.PopoverStyle] {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* node */ js.Any, /* index */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  var overlay: reactLib.reactMod.ReactNode
  var placement: js.UndefOr[
    reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Placement | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.auto
  ] = js.undefined
  var renderOverlayComponent: js.UndefOr[
    js.Function1[/* node */ reactLib.reactMod.ReactNode, reactLib.reactMod.ReactNode]
  ] = js.undefined
  var triggerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    overlay: reactLib.reactMod.ReactNode,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[scala.Double]) => scala.Unit = null,
    placement: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Placement | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.auto = null,
    renderOverlayComponent: /* node */ reactLib.reactMod.ReactNode => reactLib.reactMod.ReactNode = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libPopoverStyleMod.PopoverStyle] = null,
    triggerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
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

