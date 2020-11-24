package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessNewMacroTasksSynchronously extends js.Object {
  
  var processNewMacroTasksSynchronously: Boolean = js.native
}
object ProcessNewMacroTasksSynchronously {
  
  @scala.inline
  def apply(processNewMacroTasksSynchronously: Boolean): ProcessNewMacroTasksSynchronously = {
    val __obj = js.Dynamic.literal(processNewMacroTasksSynchronously = processNewMacroTasksSynchronously.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessNewMacroTasksSynchronously]
  }
  
  @scala.inline
  implicit class ProcessNewMacroTasksSynchronouslyOps[Self <: ProcessNewMacroTasksSynchronously] (val x: Self) extends AnyVal {
    
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
    def setProcessNewMacroTasksSynchronously(value: Boolean): Self = this.set("processNewMacroTasksSynchronously", value.asInstanceOf[js.Any])
  }
}
