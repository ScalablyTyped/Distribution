package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 小程序跳转 https://docs.alipay.com/mini/api/open-miniprogram
trait NavigateToMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 要跳转的目标小程序appId
  		 */
  var appId: java.lang.String
  /**
  		 * 要打开的小程序版本，有效值 develop（开发版），trial（体验版），release（正式版） ，仅在当前小程序为开发版或体验版时此参数有效；如果当前小程序是正式版，则打开的小程序必定是正式版。默认值 release
  		 */
  var envVersion: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.develop | aliDashAppLib.aliDashAppLibStrings.trial | aliDashAppLib.aliDashAppLibStrings.release | java.lang.String
  ] = js.undefined
  /**
  		 * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch() ，App.onShow() 中获取到这份数据
  		 */
  var extraData: js.UndefOr[js.Any] = js.undefined
  /**
  		 * 打开的页面路径，如果为空则打开首页
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object NavigateToMiniProgramOptions {
  @scala.inline
  def apply(
    appId: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    envVersion: aliDashAppLib.aliDashAppLibStrings.develop | aliDashAppLib.aliDashAppLibStrings.trial | aliDashAppLib.aliDashAppLibStrings.release | java.lang.String = null,
    extraData: js.Any = null,
    fail: js.Any => scala.Unit = null,
    path: java.lang.String = null,
    success: js.Any => scala.Unit = null
  ): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (envVersion != null) __obj.updateDynamic("envVersion")(envVersion.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (path != null) __obj.updateDynamic("path")(path)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
}

