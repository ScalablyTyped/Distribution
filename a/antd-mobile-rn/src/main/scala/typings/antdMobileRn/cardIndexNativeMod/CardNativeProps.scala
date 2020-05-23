package typings.antdMobileRn.cardIndexNativeMod

import typings.antdMobileRn.cardPropsTypeMod.CardPropsType
import typings.antdMobileRn.cardStyleIndexNativeMod.ICardStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardNativeProps extends CardPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[ICardStyle] = js.undefined
}

object CardNativeProps {
  @scala.inline
  def apply(
    full: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: ICardStyle = null
  ): CardNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNativeProps]
  }
}

