package typings
package antdDashMobileDashRnLib.libListIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps
  extends antdDashMobileDashRnLib.libListPropsTypeMod.ListPropsType {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.Anon_ArrowArrowV] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: antdDashMobileDashRnLib.antdDashMobileDashRnLibNumbers.`false` | reactLib.reactMod.Global.JSXNs.Element | js.Array[reactLib.reactMod.Global.JSXNs.Element] = null,
    renderFooter: js.Function0[reactLib.reactMod.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    renderHeader: js.Function0[reactLib.reactMod.ReactType[_]] | java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.Anon_ArrowArrowV = null
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

