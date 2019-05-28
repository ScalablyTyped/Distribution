package typings
package antdDashMobileDashRnLib.libListListItemDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends antdDashMobileDashRnLib.libListPropsTypeMod.BriefProps {
  var styles: js.UndefOr[antdDashMobileDashRnLib.Anon_Brief] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.Anon_Brief = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[BriefProps]
  }
}

