package typings
package antdLib.libMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var content: reactLib.reactMod.ReactNs.ReactNode
  var duration: scala.Double | scala.Null
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var `type`: NoticeType
}

object ArgsProps {
  @scala.inline
  def apply(
    content: reactLib.reactMod.ReactNs.ReactNode,
    `type`: NoticeType,
    duration: scala.Int | scala.Double = null,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    onClose: js.Function0[scala.Unit] = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    __obj.asInstanceOf[ArgsProps]
  }
}

