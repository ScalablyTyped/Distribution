package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableActionConfiguration extends StObject {
  
  /**
    * The note that you can leave when you enable the alarm.
    */
  var note: js.UndefOr[Note] = js.undefined
}
object EnableActionConfiguration {
  
  inline def apply(): EnableActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableActionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableActionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setNote(value: Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
