package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  /** 已加载完 */
  var done: String
  
  /** 加载中... */
  var loading: String
  
  /** 暂无数据 */
  var noData: String
  
  /** 下拉刷新 */
  var refreshableTitlePull: String
  
  /** 加载中... */
  var refreshableTitleRefreshing: String
  
  /** 释放加载 */
  var refreshableTitleRelease: String
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
  implicit class DoneMutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: String): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoData(value: String): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshableTitlePull(value: String): Self = StObject.set(x, "refreshableTitlePull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshableTitleRefreshing(value: String): Self = StObject.set(x, "refreshableTitleRefreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshableTitleRelease(value: String): Self = StObject.set(x, "refreshableTitleRelease", value.asInstanceOf[js.Any])
  }
}
