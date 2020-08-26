package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Done extends js.Object {
  /** 已加载完 */
  var done: String = js.native
  /** 加载中... */
  var loading: String = js.native
  /** 暂无数据 */
  var noData: String = js.native
  /** 下拉刷新 */
  var refreshableTitlePull: String = js.native
  /** 加载中... */
  var refreshableTitleRefreshing: String = js.native
  /** 释放加载 */
  var refreshableTitleRelease: String = js.native
}

object Done {
  @scala.inline
  def apply(
    done: String,
    loading: String,
    noData: String,
    refreshableTitlePull: String,
    refreshableTitleRefreshing: String,
    refreshableTitleRelease: String
  ): Done = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], noData = noData.asInstanceOf[js.Any], refreshableTitlePull = refreshableTitlePull.asInstanceOf[js.Any], refreshableTitleRefreshing = refreshableTitleRefreshing.asInstanceOf[js.Any], refreshableTitleRelease = refreshableTitleRelease.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
  @scala.inline
  implicit class DoneOps[Self <: Done] (val x: Self) extends AnyVal {
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
    def setDone(value: String): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoData(value: String): Self = this.set("noData", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshableTitlePull(value: String): Self = this.set("refreshableTitlePull", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshableTitleRefreshing(value: String): Self = this.set("refreshableTitleRefreshing", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshableTitleRelease(value: String): Self = this.set("refreshableTitleRelease", value.asInstanceOf[js.Any])
  }
  
}

