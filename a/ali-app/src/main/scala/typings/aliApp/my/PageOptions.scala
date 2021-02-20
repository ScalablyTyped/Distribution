package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 下拉刷新 https://docs.alipay.com/mini/api/ui-pulldown
/**
  * Page 实现的接口对象
  */
@js.native
trait PageOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var data: js.Any = js.native
  
  def onError(): Unit = js.native
  
  def onHide(): Unit = js.native
  
  def onLaunch(options: Options): Unit = js.native
  
  /**
    * 下拉刷新
    * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
    * 需要在页面对应的 .json 配置文件中配置 "pullRefresh": true 选项，才能开启下拉刷新事件。
    * 当处理完数据刷新后，调用 my.stopPullDownRefresh 可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
  
  def onShow(options: Options): Unit = js.native
}
object PageOptions {
  
  @scala.inline
  def apply(
    data: js.Any,
    onError: () => Unit,
    onHide: () => Unit,
    onLaunch: Options => Unit,
    onShow: Options => Unit
  ): PageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onHide = js.Any.fromFunction0(onHide), onLaunch = js.Any.fromFunction1(onLaunch), onShow = js.Any.fromFunction1(onShow))
    __obj.asInstanceOf[PageOptions]
  }
  
  @scala.inline
  implicit class PageOptionsMutableBuilder[Self <: PageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLaunch(value: Options => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPullDownRefresh(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onPullDownRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
    
    @scala.inline
    def setOnShow(value: Options => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
  }
}
