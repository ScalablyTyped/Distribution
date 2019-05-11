package typings
package antdLib.esMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var content: reactLib.reactMod.ReactNode
  var duration: scala.Double | scala.Null
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var `type`: NoticeType
}

object ArgsProps {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNode,
    `type`: NoticeType,
    duration: scala.Int | scala.Double = null,
    icon: reactLib.reactMod.ReactNode = null,
    onClose: () => scala.Unit = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[ArgsProps]
  }
}

