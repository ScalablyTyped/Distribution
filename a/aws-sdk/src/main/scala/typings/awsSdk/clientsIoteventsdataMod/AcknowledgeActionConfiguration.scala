package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeActionConfiguration extends StObject {
  
  /**
    * The note that you can leave when you acknowledge the alarm.
    */
  var note: js.UndefOr[Note] = js.undefined
}
object AcknowledgeActionConfiguration {
  
  inline def apply(): AcknowledgeActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeActionConfiguration]
  }
  
  extension [Self <: AcknowledgeActionConfiguration](x: Self) {
    
    inline def setNote(value: Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
