package typings.antdDashMobileDashRn.libListIndexDotNativeMod

import typings.antdDashMobileDashRn.Anon_ArrowArrowV
import typings.antdDashMobileDashRn.antdDashMobileDashRnNumbers.`false`
import typings.antdDashMobileDashRn.libListPropsTypeMod.ListPropsType
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps extends ListPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[Anon_ArrowArrowV] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: `false` | Element | js.Array[Element] = null,
    renderFooter: js.Function0[ReactType[_]] | String | Element = null,
    renderHeader: js.Function0[ReactType[_]] | String | Element = null,
    style: StyleProp[ViewStyle] = null,
    styles: Anon_ArrowArrowV = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[ListProps]
  }
}

