package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateBackMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()，App.onShow() 中获取到这份数据
    */
  var extraData: js.UndefOr[js.Any] = js.native
}
object NavigateBackMiniProgramOptions {
  
  @scala.inline
  def apply(): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
  
  @scala.inline
  implicit class NavigateBackMiniProgramOptionsOps[Self <: NavigateBackMiniProgramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
  }
}
