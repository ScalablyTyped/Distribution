package typings.angularToastr.mod.angularAugmentingMod.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastContainerConfig extends js.Object {
  
  var autoDismiss: js.UndefOr[Boolean] = js.native
  
  var containerId: js.UndefOr[String] = js.native
  
  var maxOpened: js.UndefOr[Double] = js.native
  
  var newestOnTop: js.UndefOr[Boolean] = js.native
  
  var positionClass: js.UndefOr[String] = js.native
  
  var preventDuplicates: js.UndefOr[Boolean] = js.native
  
  var preventOpenDuplicates: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[String] = js.native
}
object IToastContainerConfig {
  
  @scala.inline
  def apply(): IToastContainerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastContainerConfig]
  }
  
  @scala.inline
  implicit class IToastContainerConfigOps[Self <: IToastContainerConfig] (val x: Self) extends AnyVal {
    
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
    def setAutoDismiss(value: Boolean): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setMaxOpened(value: Double): Self = this.set("maxOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOpened: Self = this.set("maxOpened", js.undefined)
    
    @scala.inline
    def setNewestOnTop(value: Boolean): Self = this.set("newestOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewestOnTop: Self = this.set("newestOnTop", js.undefined)
    
    @scala.inline
    def setPositionClass(value: String): Self = this.set("positionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionClass: Self = this.set("positionClass", js.undefined)
    
    @scala.inline
    def setPreventDuplicates(value: Boolean): Self = this.set("preventDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDuplicates: Self = this.set("preventDuplicates", js.undefined)
    
    @scala.inline
    def setPreventOpenDuplicates(value: Boolean): Self = this.set("preventOpenDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventOpenDuplicates: Self = this.set("preventOpenDuplicates", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
