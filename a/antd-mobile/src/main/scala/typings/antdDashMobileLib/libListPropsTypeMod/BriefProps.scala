package typings
package antdDashMobileLib.libListPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties | js.Object | js.Array[js.Object]] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    style: reactLib.reactMod.CSSProperties | js.Object | js.Array[js.Object] = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[BriefProps]
  }
}

