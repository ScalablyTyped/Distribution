package typings.atAntDashDesignProDashLayout.esGridContentMod

import typings.atAntDashDesignProDashLayout.esDefaultSettingsMod.ContentWidth
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridContentProps extends js.Object {
  var children: ReactNode
  var contentWidth: js.UndefOr[ContentWidth] = js.undefined
}

object GridContentProps {
  @scala.inline
  def apply(children: ReactNode, contentWidth: ContentWidth = null): GridContentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    __obj.asInstanceOf[GridContentProps]
  }
}

