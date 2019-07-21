package typings
package atAntDashDesignReactDashNativeLib.esPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNativeProps
  extends atAntDashDesignReactDashNativeLib.esPaginationPropsTypeMod.PaginationPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esPaginationStyleMod.PaginationStyle] {
  var indicatorStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var locale: js.UndefOr[atAntDashDesignReactDashNativeLib.Anon_NextText] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object PaginationNativeProps {
  @scala.inline
  def apply(
    current: scala.Double,
    total: scala.Double,
    indicatorStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    locale: atAntDashDesignReactDashNativeLib.Anon_NextText = null,
    mode: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.button | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.number | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.pointer = null,
    nextText: java.lang.String = null,
    onChange: /* current */ scala.Double => scala.Unit = null,
    onNext: () => scala.Unit = null,
    onPrev: () => scala.Unit = null,
    prevText: java.lang.String = null,
    simple: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esPaginationStyleMod.PaginationStyle] = null
  ): PaginationNativeProps = {
    val __obj = js.Dynamic.literal(current = current, total = total)
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction0(onNext))
    if (onPrev != null) __obj.updateDynamic("onPrev")(js.Any.fromFunction0(onPrev))
    if (prevText != null) __obj.updateDynamic("prevText")(prevText)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[PaginationNativeProps]
  }
}

