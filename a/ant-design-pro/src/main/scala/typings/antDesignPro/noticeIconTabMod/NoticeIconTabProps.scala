package typings.antDesignPro.noticeIconTabMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoticeIconTabProps extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var data: js.UndefOr[js.Array[_]] = js.native
  var emptyImage: js.UndefOr[String] = js.native
  var emptyText: js.UndefOr[ReactNode] = js.native
  var list: js.UndefOr[js.Array[NoticeIconData]] = js.native
  var locale: js.Any = js.native
  var name: js.UndefOr[String] = js.native
  var showClear: js.UndefOr[Boolean] = js.native
  var showViewMore: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[String] = js.native
  def onClear(item: js.Any): Unit = js.native
  def onClick(item: js.Any): Unit = js.native
  def onViewMore(e: js.Any): Unit = js.native
}

object NoticeIconTabProps {
  @scala.inline
  def apply(locale: js.Any, onClear: js.Any => Unit, onClick: js.Any => Unit, onViewMore: js.Any => Unit): NoticeIconTabProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1(onClear), onClick = js.Any.fromFunction1(onClick), onViewMore = js.Any.fromFunction1(onViewMore))
    __obj.asInstanceOf[NoticeIconTabProps]
  }
  @scala.inline
  implicit class NoticeIconTabPropsOps[Self <: NoticeIconTabProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClear(value: js.Any => Unit): Self = this.set("onClear", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: js.Any => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnViewMore(value: js.Any => Unit): Self = this.set("onViewMore", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setEmptyImage(value: String): Self = this.set("emptyImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyImage: Self = this.set("emptyImage", js.undefined)
    @scala.inline
    def setEmptyText(value: ReactNode): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyText: Self = this.set("emptyText", js.undefined)
    @scala.inline
    def setListVarargs(value: NoticeIconData*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: js.Array[NoticeIconData]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setShowClear(value: Boolean): Self = this.set("showClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowClear: Self = this.set("showClear", js.undefined)
    @scala.inline
    def setShowViewMore(value: Boolean): Self = this.set("showViewMore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowViewMore: Self = this.set("showViewMore", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

