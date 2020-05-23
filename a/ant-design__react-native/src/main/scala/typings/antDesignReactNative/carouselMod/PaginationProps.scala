package typings.antDesignReactNative.carouselMod

import typings.antDesignReactNative.anon.Pagination
import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var count: Double
  var current: Double
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: ReturnType[js.Function1[/* theme */ Theme, Pagination]]
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    count: Double,
    current: Double,
    styles: ReturnType[js.Function1[/* theme */ Theme, Pagination]],
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

