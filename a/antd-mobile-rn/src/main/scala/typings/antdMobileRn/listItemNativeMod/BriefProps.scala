package typings.antdMobileRn.listItemNativeMod

import typings.antdMobileRn.AnonBrief
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typings.antdMobileRn.listPropsTypeMod.BriefProps {
  var styles: js.UndefOr[AnonBrief] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: AnonBrief = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

