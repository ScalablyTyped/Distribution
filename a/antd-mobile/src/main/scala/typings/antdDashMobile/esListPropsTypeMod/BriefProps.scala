package typings.antdDashMobile.esListPropsTypeMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object BriefProps {
  @scala.inline
  def apply(style: CSSProperties = null, wrap: js.UndefOr[Boolean] = js.undefined): BriefProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[BriefProps]
  }
}

