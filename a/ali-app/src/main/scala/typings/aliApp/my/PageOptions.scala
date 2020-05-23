package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 下拉刷新 https://docs.alipay.com/mini/api/ui-pulldown
/**
  * Page 实现的接口对象
  */
trait PageOptions
  extends /* key */ StringDictionary[js.Any] {
  var data: js.Any
  /**
    * 下拉刷新
    * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
    * 需要在页面对应的 .json 配置文件中配置 "pullRefresh": true 选项，才能开启下拉刷新事件。
    * 当处理完数据刷新后，调用 my.stopPullDownRefresh 可以停止当前页面的下拉刷新。
    */
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
  def onError(): Unit
  def onHide(): Unit
  def onLaunch(options: Options): Unit
  def onShow(options: Options): Unit
}

object PageOptions {
  @scala.inline
  def apply(
    data: js.Any,
    onError: () => Unit,
    onHide: () => Unit,
    onLaunch: Options => Unit,
    onShow: Options => Unit,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    onPullDownRefresh: js.ThisFunction0[/* this */ Page, Unit] = null
  ): PageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onError = js.Any.fromFunction0(onError), onHide = js.Any.fromFunction0(onHide), onLaunch = js.Any.fromFunction1(onLaunch), onShow = js.Any.fromFunction1(onShow))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(onPullDownRefresh.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageOptions]
  }
}

