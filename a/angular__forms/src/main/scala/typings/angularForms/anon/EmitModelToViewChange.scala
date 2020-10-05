package typings.angularForms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmitModelToViewChange extends js.Object {
  var emitEvent: js.UndefOr[Boolean] = js.native
  var emitModelToViewChange: js.UndefOr[Boolean] = js.native
  var emitViewToModelChange: js.UndefOr[Boolean] = js.native
  var onlySelf: js.UndefOr[Boolean] = js.native
}

object EmitModelToViewChange {
  @scala.inline
  def apply(): EmitModelToViewChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmitModelToViewChange]
  }
  @scala.inline
  implicit class EmitModelToViewChangeOps[Self <: EmitModelToViewChange] (val x: Self) extends AnyVal {
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
    def setEmitModelToViewChange(value: Boolean): Self = this.set("emitModelToViewChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitModelToViewChange: Self = this.set("emitModelToViewChange", js.undefined)
    @scala.inline
    def setEmitViewToModelChange(value: Boolean): Self = this.set("emitViewToModelChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitViewToModelChange: Self = this.set("emitViewToModelChange", js.undefined)
    @scala.inline
    def setOnlySelf(value: Boolean): Self = this.set("onlySelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlySelf: Self = this.set("onlySelf", js.undefined)
  }
  
}

