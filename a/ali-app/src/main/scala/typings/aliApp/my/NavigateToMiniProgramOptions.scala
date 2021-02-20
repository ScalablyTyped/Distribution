package typings.aliApp.my

import typings.aliApp.aliAppStrings.develop
import typings.aliApp.aliAppStrings.release
import typings.aliApp.aliAppStrings.trial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 小程序跳转 https://docs.alipay.com/mini/api/open-miniprogram
@js.native
trait NavigateToMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 要跳转的目标小程序appId
    */
  var appId: String = js.native
  
  /**
    * 要打开的小程序版本，有效值 develop（开发版），trial（体验版），release（正式版） ，仅在当前小程序为开发版或体验版时此参数有效；如果当前小程序是正式版，则打开的小程序必定是正式版。默认值 release
    */
  var envVersion: js.UndefOr[develop | trial | release | String] = js.native
  
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch() ，App.onShow() 中获取到这份数据
    */
  var extraData: js.UndefOr[js.Any] = js.native
  
  /**
    * 打开的页面路径，如果为空则打开首页
    */
  var path: js.UndefOr[String] = js.native
}
object NavigateToMiniProgramOptions {
  
  @scala.inline
  def apply(appId: String): NavigateToMiniProgramOptions = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToMiniProgramOptions]
  }
  
  @scala.inline
  implicit class NavigateToMiniProgramOptionsMutableBuilder[Self <: NavigateToMiniProgramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVersion(value: develop | trial | release | String): Self = StObject.set(x, "envVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVersionUndefined: Self = StObject.set(x, "envVersion", js.undefined)
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
