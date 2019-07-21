package typings
package atAntDashDesignProDashLayoutLib.esGridContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridContentProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var contentWidth: js.UndefOr[atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth] = js.undefined
}

object GridContentProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    contentWidth: atAntDashDesignProDashLayoutLib.esDefaultSettingsMod.ContentWidth = null
  ): GridContentProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth)
    __obj.asInstanceOf[GridContentProps]
  }
}

