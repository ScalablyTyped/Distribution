package typings.antDesignPro.noticeIconTabMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeIconData extends js.Object {
  var avatar: js.UndefOr[String | ReactNode] = js.undefined
  var datetime: js.UndefOr[ReactNode] = js.undefined
  var description: js.UndefOr[ReactNode] = js.undefined
  var extra: js.UndefOr[ReactNode] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object NoticeIconData {
  @scala.inline
  def apply(
    avatar: String | ReactNode = null,
    datetime: ReactNode = null,
    description: ReactNode = null,
    extra: ReactNode = null,
    style: CSSProperties = null,
    title: ReactNode = null
  ): NoticeIconData = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeIconData]
  }
}

