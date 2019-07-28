package typings.atAntDashDesignReactDashNative.esCarouselMod

import typings.atAntDashDesignReactDashNative.Anon_Pagination
import typings.atAntDashDesignReactDashNative.esStyleMod.Theme
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var count: Double
  var current: Double
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: ReturnType[js.Function1[/* theme */ Theme, Anon_Pagination]]
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    count: Double,
    current: Double,
    styles: ReturnType[js.Function1[/* theme */ Theme, Anon_Pagination]],
    dotActiveStyle: StyleProp[ViewStyle] = null,
    dotStyle: StyleProp[ViewStyle] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(count = count, current = current, styles = styles)
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PaginationProps]
  }
}

