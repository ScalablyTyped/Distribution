package typings.antd.esMessageMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var content: ReactNode
  var duration: Double | Null
  var icon: js.UndefOr[ReactNode] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: NoticeType
}

object ArgsProps {
  @scala.inline
  def apply(
    content: ReactNode,
    `type`: NoticeType,
    duration: Int | Double = null,
    icon: ReactNode = null,
    onClose: () => Unit = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[ArgsProps]
  }
}

