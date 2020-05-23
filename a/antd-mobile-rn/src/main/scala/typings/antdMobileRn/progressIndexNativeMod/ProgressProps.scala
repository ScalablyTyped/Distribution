package typings.antdMobileRn.progressIndexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.fixed
import typings.antdMobileRn.antdMobileRnStrings.normal
import typings.antdMobileRn.progressPropsTypeMod.ProgressPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressProps extends ProgressPropsType {
  var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var wrapWidth: js.UndefOr[Double] = js.undefined
}

object ProgressProps {
  @scala.inline
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    barStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    percent: js.UndefOr[Double] = js.undefined,
    position: fixed | normal = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: js.Any = null,
    unfilled: js.UndefOr[Boolean] = js.undefined,
    wrapWidth: js.UndefOr[Double] = js.undefined
  ): ProgressProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(barStyle)) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapWidth)) __obj.updateDynamic("wrapWidth")(wrapWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressProps]
  }
}

