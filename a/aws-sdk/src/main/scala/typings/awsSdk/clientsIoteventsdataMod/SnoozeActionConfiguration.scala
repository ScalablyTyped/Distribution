package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnoozeActionConfiguration extends StObject {
  
  /**
    * The note that you can leave when you snooze the alarm.
    */
  var note: js.UndefOr[Note] = js.undefined
  
  /**
    * The snooze time in seconds. The alarm automatically changes to the NORMAL state after this duration.
    */
  var snoozeDuration: js.UndefOr[SnoozeDuration] = js.undefined
}
object SnoozeActionConfiguration {
  
  inline def apply(): SnoozeActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnoozeActionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnoozeActionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setNote(value: Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setSnoozeDuration(value: SnoozeDuration): Self = StObject.set(x, "snoozeDuration", value.asInstanceOf[js.Any])
    
    inline def setSnoozeDurationUndefined: Self = StObject.set(x, "snoozeDuration", js.undefined)
  }
}
