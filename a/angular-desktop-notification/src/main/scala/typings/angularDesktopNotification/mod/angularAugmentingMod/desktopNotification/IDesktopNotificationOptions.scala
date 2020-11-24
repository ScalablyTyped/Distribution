package typings.angularDesktopNotification.mod.angularAugmentingMod.desktopNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait IDesktopNotificationOptions extends js.Object {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var showOnPageHidden: js.UndefOr[Boolean] = js.native
}
object IDesktopNotificationOptions {
  
  @scala.inline
  def apply(): IDesktopNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDesktopNotificationOptions]
  }
  
  @scala.inline
  implicit class IDesktopNotificationOptionsOps[Self <: IDesktopNotificationOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setShowOnPageHidden(value: Boolean): Self = this.set("showOnPageHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnPageHidden: Self = this.set("showOnPageHidden", js.undefined)
  }
}
