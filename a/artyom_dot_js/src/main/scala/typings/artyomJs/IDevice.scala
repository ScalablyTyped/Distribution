package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDevice extends js.Object {
  
  var isChrome: js.UndefOr[Boolean] = js.native
  
  var isMobile: js.UndefOr[Boolean] = js.native
}
object IDevice {
  
  @scala.inline
  def apply(): IDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDevice]
  }
  
  @scala.inline
  implicit class IDeviceOps[Self <: IDevice] (val x: Self) extends AnyVal {
    
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
    def setIsChrome(value: Boolean): Self = this.set("isChrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChrome: Self = this.set("isChrome", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
  }
}
