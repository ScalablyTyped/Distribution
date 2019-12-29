package typings.antDashDesignDashPro.libFooterToolbarMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterToolbarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extra: ReactNode
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FooterToolbarProps {
  @scala.inline
  def apply(className: String = null, extra: ReactNode = null, style: CSSProperties = null): FooterToolbarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterToolbarProps]
  }
}

