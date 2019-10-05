package typings.aliDashApp.my

import typings.aliDashApp.aliDashAppStrings.ADDRESSBOOK
import typings.aliDashApp.aliDashAppStrings.BACKGROUNDER
import typings.aliDashApp.aliDashAppStrings.CAMERA
import typings.aliDashApp.aliDashAppStrings.LBS
import typings.aliDashApp.aliDashAppStrings.LBSSERVICE
import typings.aliDashApp.aliDashAppStrings.MICROPHONE
import typings.aliDashApp.aliDashAppStrings.NOTIFICATION
import typings.aliDashApp.aliDashAppStrings.PHOTO
import typings.aliDashApp.aliDashAppStrings.SELFSTARTING
import typings.aliDashApp.aliDashAppStrings.SHORTCUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 权限引导 https://docs.alipay.com/mini/api/show-auth-guide
trait showAuthGuideOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 引导的权限标识，用于标识该权限类型(如 LBS)
  		 * 支持的 authType 如下：
  		 *
  		 * 权限名称	权限码	支持平台
  		 * 后台保活权限	BACKGROUNDER	Android
  		 * 桌面快捷权限	SHORTCUT	Android
  		 * 麦克风权限	MICROPHONE	iOS
  		 * 通讯录权限	ADDRESSBOOK	iOS
  		 * 相机权限	CAMERA	iOS
  		 * 照片权限	PHOTO	iOS
  		 * push通知栏权限	NOTIFICATION	iOS
  		 * 自启动权限	SELFSTARTING	Android
  		 * lbs总开关	LBSSERVICE	iOS
  		 * lbs开关(app)	LBS	iOS
  		 */
  var authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS
}

object showAuthGuideOptions {
  @scala.inline
  def apply(
    authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): showAuthGuideOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[showAuthGuideOptions]
  }
}

