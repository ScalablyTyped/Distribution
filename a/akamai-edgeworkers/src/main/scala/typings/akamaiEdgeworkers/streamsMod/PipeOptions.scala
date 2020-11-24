package typings.akamaiEdgeworkers.streamsMod

import typings.akamaiEdgeworkers.anon.Aborted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeOptions extends js.Object {
  
  var preventAbort: js.UndefOr[Boolean] = js.native
  
  var preventCancel: js.UndefOr[Boolean] = js.native
  
  var preventClose: js.UndefOr[Boolean] = js.native
  
  var signal: js.UndefOr[Aborted] = js.native
}
object PipeOptions {
  
  @scala.inline
  def apply(): PipeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeOptions]
  }
  
  @scala.inline
  implicit class PipeOptionsOps[Self <: PipeOptions] (val x: Self) extends AnyVal {
    
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
    def setPreventAbort(value: Boolean): Self = this.set("preventAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventAbort: Self = this.set("preventAbort", js.undefined)
    
    @scala.inline
    def setPreventCancel(value: Boolean): Self = this.set("preventCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventCancel: Self = this.set("preventCancel", js.undefined)
    
    @scala.inline
    def setPreventClose(value: Boolean): Self = this.set("preventClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventClose: Self = this.set("preventClose", js.undefined)
    
    @scala.inline
    def setSignal(value: Aborted): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
