package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 下拉刷新 https://docs.alipay.com/mini/api/ui-pulldown
/**
	 * Page 实现的接口对象
	 */
trait PageOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var data: js.Any
  /**
  		 * 下拉刷新
  		 * 在 Page 中定义 onPullDownRefresh 处理函数，监听该页面用户下拉刷新事件。
  		 * 需要在页面对应的 .json 配置文件中配置 "pullRefresh": true 选项，才能开启下拉刷新事件。
  		 * 当处理完数据刷新后，调用 my.stopPullDownRefresh 可以停止当前页面的下拉刷新。
  		 */
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ Page, scala.Unit]] = js.undefined
  def onError(`this`: Page): scala.Unit
  def onHide(`this`: Page): scala.Unit
  def onLaunch(`this`: Page, options: Options): scala.Unit
  def onShow(`this`: Page, options: Options): scala.Unit
}

object PageOptions {
  @scala.inline
  def apply(
    data: js.Any,
    onError: Page => scala.Unit,
    onHide: Page => scala.Unit,
    onLaunch: (Page, Options) => scala.Unit,
    onShow: (Page, Options) => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onPullDownRefresh: js.ThisFunction0[/* this */ Page, scala.Unit] = null
  ): PageOptions = {
    val __obj = js.Dynamic.literal(data = data, onError = js.Any.fromFunction1(onError), onHide = js.Any.fromFunction1(onHide), onLaunch = js.Any.fromFunction2(onLaunch), onShow = js.Any.fromFunction2(onShow))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(onPullDownRefresh)
    __obj.asInstanceOf[PageOptions]
  }
}

