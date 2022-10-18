package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPartnerEventsRequest extends StObject {
  
  /**
    * The list of events to write to the event bus.
    */
  var Entries: PutPartnerEventsRequestEntryList
}
object PutPartnerEventsRequest {
  
  inline def apply(Entries: PutPartnerEventsRequestEntryList): PutPartnerEventsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPartnerEventsRequest]
  }
  
  extension [Self <: PutPartnerEventsRequest](x: Self) {
    
    inline def setEntries(value: PutPartnerEventsRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: PutPartnerEventsRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
  }
}
