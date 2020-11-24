package typings.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitEvent extends js.Object {
  
  var emitEvent: js.UndefOr[Boolean] = js.native
  
  var onlySelf: js.UndefOr[Boolean] = js.native
}
object EmitEvent {
  
  @scala.inline
  def apply(): EmitEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitEvent]
  }
  
  @scala.inline
  implicit class EmitEventOps[Self <: EmitEvent] (val x: Self) extends AnyVal {
    
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
    def setEmitEvent(value: Boolean): Self = this.set("emitEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitEvent: Self = this.set("emitEvent", js.undefined)
    
    @scala.inline
    def setOnlySelf(value: Boolean): Self = this.set("onlySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlySelf: Self = this.set("onlySelf", js.undefined)
  }
}
