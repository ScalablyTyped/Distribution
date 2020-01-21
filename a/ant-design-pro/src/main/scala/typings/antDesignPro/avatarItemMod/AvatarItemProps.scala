package typings.antDesignPro.avatarItemMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarItemProps extends js.Object {
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var src: String
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tips: ReactNode
}

object AvatarItemProps {
  @scala.inline
  def apply(
    src: String,
    onClick: () => Unit = null,
    size: SizeType = null,
    style: CSSProperties = null,
    tips: ReactNode = null
  ): AvatarItemProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarItemProps]
  }
}

