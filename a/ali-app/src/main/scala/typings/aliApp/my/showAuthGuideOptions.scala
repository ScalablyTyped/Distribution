package typings.aliApp.my

import typings.aliApp.aliAppStrings.ADDRESSBOOK
import typings.aliApp.aliAppStrings.BACKGROUNDER
import typings.aliApp.aliAppStrings.CAMERA
import typings.aliApp.aliAppStrings.LBS
import typings.aliApp.aliAppStrings.LBSSERVICE
import typings.aliApp.aliAppStrings.MICROPHONE
import typings.aliApp.aliAppStrings.NOTIFICATION
import typings.aliApp.aliAppStrings.PHOTO
import typings.aliApp.aliAppStrings.SELFSTARTING
import typings.aliApp.aliAppStrings.SHORTCUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 权限引导 https://docs.alipay.com/mini/api/show-auth-guide
@js.native
trait showAuthGuideOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 引导的权限标识，用于标识该权限类型(如 LBS)
    * 支持的 authType 如下：
    *
    * 权限名称    权限码    支持平台
    * 后台保活权限    BACKGROUNDER    Android
    * 桌面快捷权限    SHORTCUT    Android
    * 麦克风权限    MICROPHONE    iOS
    * 通讯录权限    ADDRESSBOOK    iOS
    * 相机权限    CAMERA    iOS
    * 照片权限    PHOTO    iOS
    * push通知栏权限    NOTIFICATION    iOS
    * 自启动权限    SELFSTARTING    Android
    * lbs总开关    LBSSERVICE    iOS
    * lbs开关(app)    LBS    iOS
    */
  var authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS = js.native
}
object showAuthGuideOptions {
  
  @scala.inline
  def apply(
    authType: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS
  ): showAuthGuideOptions = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any])
    __obj.asInstanceOf[showAuthGuideOptions]
  }
  
  @scala.inline
  implicit class showAuthGuideOptionsMutableBuilder[Self <: showAuthGuideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthType(
      value: BACKGROUNDER | SHORTCUT | MICROPHONE | ADDRESSBOOK | CAMERA | PHOTO | NOTIFICATION | SELFSTARTING | LBSSERVICE | LBS
    ): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
  }
}
