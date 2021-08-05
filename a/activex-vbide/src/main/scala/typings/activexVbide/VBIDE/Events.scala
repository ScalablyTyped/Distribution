package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  def CommandBarEvents(CommandBarControl: js.Any): typings.activexVbide.VBIDE.CommandBarEvents
  
  def ReferencesEvents(VBProject: VBProject): typings.activexVbide.VBIDE.ReferencesEvents
  
  /* private */ @JSName("VBIDE.Events_typekey")
  var VBIDEDotEvents_typekey: Events
}
object Events {
  
  inline def apply(
    CommandBarEvents: js.Any => CommandBarEvents,
    ReferencesEvents: VBProject => ReferencesEvents,
    VBIDEDotEvents_typekey: Events
  ): Events = {
    val __obj = js.Dynamic.literal(CommandBarEvents = js.Any.fromFunction1(CommandBarEvents), ReferencesEvents = js.Any.fromFunction1(ReferencesEvents))
    __obj.updateDynamic("VBIDE.Events_typekey")(VBIDEDotEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setCommandBarEvents(value: js.Any => CommandBarEvents): Self = StObject.set(x, "CommandBarEvents", js.Any.fromFunction1(value))
    
    inline def setReferencesEvents(value: VBProject => ReferencesEvents): Self = StObject.set(x, "ReferencesEvents", js.Any.fromFunction1(value))
    
    inline def setVBIDEDotEvents_typekey(value: Events): Self = StObject.set(x, "VBIDE.Events_typekey", value.asInstanceOf[js.Any])
  }
}
