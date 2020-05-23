package typings.antDesignPro.globalFooterMod

import typings.antDesignPro.anon.BlankTarget
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalFooterProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[ReactNode] = js.undefined
  var links: js.UndefOr[js.Array[BlankTarget]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GlobalFooterProps {
  @scala.inline
  def apply(
    className: String = null,
    copyright: ReactNode = null,
    links: js.Array[BlankTarget] = null,
    style: CSSProperties = null
  ): GlobalFooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalFooterProps]
  }
}

