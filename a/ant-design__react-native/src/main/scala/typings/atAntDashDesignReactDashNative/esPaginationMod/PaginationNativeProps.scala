package typings.atAntDashDesignReactDashNative.esPaginationMod

import typings.atAntDashDesignReactDashNative.Anon_NextText
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.button
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.number
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.pointer
import typings.atAntDashDesignReactDashNative.esPaginationPropsTypeMod.PaginationPropsType
import typings.atAntDashDesignReactDashNative.esPaginationStyleMod.PaginationStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationNativeProps
  extends PaginationPropsType
     with WithThemeStyles[PaginationStyle] {
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var locale: js.UndefOr[Anon_NextText] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object PaginationNativeProps {
  @scala.inline
  def apply(
    current: Double,
    total: Double,
    indicatorStyle: StyleProp[ViewStyle] = null,
    locale: Anon_NextText = null,
    mode: button | number | pointer = null,
    nextText: String = null,
    onChange: /* current */ Double => Unit = null,
    onNext: () => Unit = null,
    onPrev: () => Unit = null,
    prevText: String = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PaginationStyle] = null
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

