package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done extends js.Object {
  /** 已加载完 */
  var done: java.lang.String
  /** 加载中... */
  var loading: java.lang.String
  /** 暂无数据 */
  var noData: java.lang.String
  /** 下拉刷新 */
  var refreshableTitlePull: java.lang.String
  /** 加载中... */
  var refreshableTitleRefreshing: java.lang.String
  /** 释放加载 */
  var refreshableTitleRelease: java.lang.String
}

object Anon_Done {
  @scala.inline
  def apply(
    done: java.lang.String,
    loading: java.lang.String,
    noData: java.lang.String,
    refreshableTitlePull: java.lang.String,
    refreshableTitleRefreshing: java.lang.String,
    refreshableTitleRelease: java.lang.String
  ): Anon_Done = {
    val __obj = js.Dynamic.literal(done = done, loading = loading, noData = noData, refreshableTitlePull = refreshableTitlePull, refreshableTitleRefreshing = refreshableTitleRefreshing, refreshableTitleRelease = refreshableTitleRelease)
  
    __obj.asInstanceOf[Anon_Done]
  }
}

