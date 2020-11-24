package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checked extends js.Object {
  
  val Checked: js.Any = js.native
  
  val Command: js.Any = js.native
}
object Checked {
  
  @scala.inline
  def apply(Checked: js.Any, Command: js.Any): Checked = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  @scala.inline
  implicit class CheckedOps[Self <: Checked] (val x: Self) extends AnyVal {
    
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
    def setChecked(value: js.Any): Self = this.set("Checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommand(value: js.Any): Self = this.set("Command", value.asInstanceOf[js.Any])
  }
}
