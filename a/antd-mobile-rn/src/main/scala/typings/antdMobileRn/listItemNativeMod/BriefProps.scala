package typings.antdMobileRn.listItemNativeMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps
  extends typings.antdMobileRn.listPropsTypeMod.BriefProps {
  var styles: js.UndefOr[typings.antdMobileRn.anon.Brief] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: typings.antdMobileRn.anon.Brief = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefProps]
  }
}

