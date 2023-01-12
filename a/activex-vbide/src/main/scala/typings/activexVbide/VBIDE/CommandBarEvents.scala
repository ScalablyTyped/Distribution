package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandBarEvents extends StObject {
  
  /* private */ @JSName("VBIDE.CommandBarEvents_typekey")
  var VBIDEDotCommandBarEvents_typekey: CommandBarEvents
}
object CommandBarEvents {
  
  inline def apply(VBIDEDotCommandBarEvents_typekey: CommandBarEvents): CommandBarEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VBIDE.CommandBarEvents_typekey")(VBIDEDotCommandBarEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandBarEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommandBarEvents] (val x: Self) extends AnyVal {
    
    inline def setVBIDEDotCommandBarEvents_typekey(value: CommandBarEvents): Self = StObject.set(x, "VBIDE.CommandBarEvents_typekey", value.asInstanceOf[js.Any])
  }
}
