package typings.atAntDashDesignReactDashNative.libListListItemMod

import typings.atAntDashDesignReactDashNative.PickListStyleBriefBriefText
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typings.atAntDashDesignReactDashNative.libListPropsTypeMod.BriefProps
     with WithThemeStyles[PickListStyleBriefBriefText]

object BriefProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    style: StyleProp[TextStyle] = null,
    styles: Partial[PickListStyleBriefBriefText] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[BriefProps]
  }
}

