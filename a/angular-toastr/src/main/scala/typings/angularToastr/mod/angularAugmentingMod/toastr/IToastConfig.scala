package typings.angularToastr.mod.angularAugmentingMod.toastr

import typings.angularToastr.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastConfig extends IToastBaseConfig {
  
  var iconClasses: js.UndefOr[Error] = js.native
}
object IToastConfig {
  
  @scala.inline
  def apply(): IToastConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastConfig]
  }
  
  @scala.inline
  implicit class IToastConfigOps[Self <: IToastConfig] (val x: Self) extends AnyVal {
    
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
    def setIconClasses(value: Error): Self = this.set("iconClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClasses: Self = this.set("iconClasses", js.undefined)
  }
}
