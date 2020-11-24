package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtViewWindow extends js.Object {
  
  val ProtViewWindow: ProtectedViewWindow = js.native
}
object ProtViewWindow {
  
  @scala.inline
  def apply(ProtViewWindow: ProtectedViewWindow): ProtViewWindow = {
    val __obj = js.Dynamic.literal(ProtViewWindow = ProtViewWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtViewWindow]
  }
  
  @scala.inline
  implicit class ProtViewWindowOps[Self <: ProtViewWindow] (val x: Self) extends AnyVal {
    
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
    def setProtViewWindow(value: ProtectedViewWindow): Self = this.set("ProtViewWindow", value.asInstanceOf[js.Any])
  }
}
