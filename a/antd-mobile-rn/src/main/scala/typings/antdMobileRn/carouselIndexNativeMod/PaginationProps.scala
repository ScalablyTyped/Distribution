package typings.antdMobileRn.carouselIndexNativeMod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var count: Double
  var current: Double
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.Any
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    count: Double,
    current: Double,
    styles: js.Any,
    dotActiveStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    dotStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    if (!js.isUndefined(dotActiveStyle)) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dotStyle)) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

