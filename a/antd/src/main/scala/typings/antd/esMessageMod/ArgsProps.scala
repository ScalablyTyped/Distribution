package typings.antd.esMessageMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgsProps extends js.Object {
  var content: ReactNode
  var duration: Double | Null
  var icon: js.UndefOr[ReactNode] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: NoticeType
}

object ArgsProps {
  @scala.inline
  def apply(
    `type`: NoticeType,
    content: ReactNode = null,
    duration: Int | Double = null,
    icon: ReactNode = null,
    key: String | Double = null,
    onClose: () => Unit = null
  ): ArgsProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[ArgsProps]
  }
}

