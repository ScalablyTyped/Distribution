package typings.atAntDashDesignProDashLayout.esGridContentMod

import typings.atAntDashDesignProDashLayout.esDefaultSettingsMod.ContentWidth
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridContentProps extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GridContentProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    contentWidth: ContentWidth = null,
    style: CSSProperties = null
  ): GridContentProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GridContentProps]
  }
}

