package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDispWindow extends js.Object {
  
  val pDispWindow: js.Any = js.native
}
object PDispWindow {
  
  @scala.inline
  def apply(pDispWindow: js.Any): PDispWindow = {
    val __obj = js.Dynamic.literal(pDispWindow = pDispWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDispWindow]
  }
  
  @scala.inline
  implicit class PDispWindowOps[Self <: PDispWindow] (val x: Self) extends AnyVal {
    
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
    def setPDispWindow(value: js.Any): Self = this.set("pDispWindow", value.asInstanceOf[js.Any])
  }
}
