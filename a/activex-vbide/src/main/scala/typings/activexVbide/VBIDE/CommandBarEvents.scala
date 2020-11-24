package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBarEvents extends js.Object {
  
  @JSName("VBIDE.CommandBarEvents_typekey")
  var VBIDEDotCommandBarEvents_typekey: CommandBarEvents = js.native
}
object CommandBarEvents {
  
  @scala.inline
  def apply(VBIDEDotCommandBarEvents_typekey: CommandBarEvents): CommandBarEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VBIDE.CommandBarEvents_typekey")(VBIDEDotCommandBarEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandBarEvents]
  }
  
  @scala.inline
  implicit class CommandBarEventsOps[Self <: CommandBarEvents] (val x: Self) extends AnyVal {
    
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
    def setVBIDEDotCommandBarEvents_typekey(value: CommandBarEvents): Self = this.set("VBIDE.CommandBarEvents_typekey", value.asInstanceOf[js.Any])
  }
}
