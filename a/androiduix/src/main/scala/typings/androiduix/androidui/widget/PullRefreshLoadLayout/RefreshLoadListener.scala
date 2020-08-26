package typings.androiduix.androidui.widget.PullRefreshLoadLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshLoadListener extends js.Object {
  def onLoadMore(prll: typings.androiduix.androidui.widget.PullRefreshLoadLayout): Unit = js.native
  def onRefresh(prll: typings.androiduix.androidui.widget.PullRefreshLoadLayout): Unit = js.native
}

object RefreshLoadListener {
  @scala.inline
  def apply(
    onLoadMore: typings.androiduix.androidui.widget.PullRefreshLoadLayout => Unit,
    onRefresh: typings.androiduix.androidui.widget.PullRefreshLoadLayout => Unit
  ): RefreshLoadListener = {
    val __obj = js.Dynamic.literal(onLoadMore = js.Any.fromFunction1(onLoadMore), onRefresh = js.Any.fromFunction1(onRefresh))
    __obj.asInstanceOf[RefreshLoadListener]
  }
  @scala.inline
  implicit class RefreshLoadListenerOps[Self <: RefreshLoadListener] (val x: Self) extends AnyVal {
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
    def setOnLoadMore(value: typings.androiduix.androidui.widget.PullRefreshLoadLayout => Unit): Self = this.set("onLoadMore", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRefresh(value: typings.androiduix.androidui.widget.PullRefreshLoadLayout => Unit): Self = this.set("onRefresh", js.Any.fromFunction1(value))
  }
  
}

