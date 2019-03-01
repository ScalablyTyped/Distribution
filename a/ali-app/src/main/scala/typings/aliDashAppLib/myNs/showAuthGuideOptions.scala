package typings
package aliDashAppLib.myNs

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
  var authType: aliDashAppLib.aliDashAppLibStrings.BACKGROUNDER | aliDashAppLib.aliDashAppLibStrings.SHORTCUT | aliDashAppLib.aliDashAppLibStrings.MICROPHONE | aliDashAppLib.aliDashAppLibStrings.ADDRESSBOOK | aliDashAppLib.aliDashAppLibStrings.CAMERA | aliDashAppLib.aliDashAppLibStrings.PHOTO | aliDashAppLib.aliDashAppLibStrings.NOTIFICATION | aliDashAppLib.aliDashAppLibStrings.SELFSTARTING | aliDashAppLib.aliDashAppLibStrings.LBSSERVICE | aliDashAppLib.aliDashAppLibStrings.LBS
}

object showAuthGuideOptions {
  @scala.inline
  def apply(
    authType: aliDashAppLib.aliDashAppLibStrings.BACKGROUNDER | aliDashAppLib.aliDashAppLibStrings.SHORTCUT | aliDashAppLib.aliDashAppLibStrings.MICROPHONE | aliDashAppLib.aliDashAppLibStrings.ADDRESSBOOK | aliDashAppLib.aliDashAppLibStrings.CAMERA | aliDashAppLib.aliDashAppLibStrings.PHOTO | aliDashAppLib.aliDashAppLibStrings.NOTIFICATION | aliDashAppLib.aliDashAppLibStrings.SELFSTARTING | aliDashAppLib.aliDashAppLibStrings.LBSSERVICE | aliDashAppLib.aliDashAppLibStrings.LBS,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): showAuthGuideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[showAuthGuideOptions]
  }
}

