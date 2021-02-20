package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBarEvents extends StObject {
  
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
  implicit class CommandBarEventsMutableBuilder[Self <: CommandBarEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVBIDEDotCommandBarEvents_typekey(value: CommandBarEvents): Self = StObject.set(x, "VBIDE.CommandBarEvents_typekey", value.asInstanceOf[js.Any])
  }
}
