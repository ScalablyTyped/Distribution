package typings.actioncable

import typings.actioncable.ActionCable.Cable
import typings.actioncable.ActionCable.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInterface extends js.Object {
  
  var cable: js.UndefOr[Cable] = js.native
  
  var network: js.UndefOr[Channel] = js.native
}
object AppInterface {
  
  @scala.inline
  def apply(): AppInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInterface]
  }
  
  @scala.inline
  implicit class AppInterfaceOps[Self <: AppInterface] (val x: Self) extends AnyVal {
    
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
    def setCable(value: Cable): Self = this.set("cable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCable: Self = this.set("cable", js.undefined)
    
    @scala.inline
    def setNetwork(value: Channel): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
  }
}
