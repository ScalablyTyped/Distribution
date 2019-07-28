package typings.atAntDashDesignReactDashNative.esListPropsTypeMod

import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    style: StyleProp[TextStyle] = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[BriefProps]
  }
}

