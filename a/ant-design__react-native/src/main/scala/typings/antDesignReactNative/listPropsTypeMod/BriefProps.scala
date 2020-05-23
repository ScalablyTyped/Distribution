package typings.antDesignReactNative.listPropsTypeMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
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
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

