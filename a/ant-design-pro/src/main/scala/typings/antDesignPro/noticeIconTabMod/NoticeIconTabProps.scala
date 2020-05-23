package typings.antDesignPro.noticeIconTabMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeIconTabProps extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var emptyImage: js.UndefOr[String] = js.undefined
  var emptyText: js.UndefOr[ReactNode] = js.undefined
  var list: js.UndefOr[js.Array[NoticeIconData]] = js.undefined
  var locale: js.Any
  var name: js.UndefOr[String] = js.undefined
  var showClear: js.UndefOr[Boolean] = js.undefined
  var showViewMore: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  def onClear(item: js.Any): Unit
  def onClick(item: js.Any): Unit
  def onViewMore(e: js.Any): Unit
}

object NoticeIconTabProps {
  @scala.inline
  def apply(
    locale: js.Any,
    onClear: js.Any => Unit,
    onClick: js.Any => Unit,
    onViewMore: js.Any => Unit,
    count: js.UndefOr[Double] = js.undefined,
    data: js.Array[_] = null,
    emptyImage: String = null,
    emptyText: ReactNode = null,
    list: js.Array[NoticeIconData] = null,
    name: String = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    showViewMore: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    title: String = null
  ): NoticeIconTabProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1(onClear), onClick = js.Any.fromFunction1(onClick), onViewMore = js.Any.fromFunction1(onViewMore))
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (emptyImage != null) __obj.updateDynamic("emptyImage")(emptyImage.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showViewMore)) __obj.updateDynamic("showViewMore")(showViewMore.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeIconTabProps]
  }
}

