package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPartnerEventsResponse extends StObject {
  
  /**
    * The list of events from this operation that were successfully written to the partner event bus.
    */
  var Entries: js.UndefOr[PutPartnerEventsResultEntryList] = js.undefined
  
  /**
    * The number of events from this operation that could not be written to the partner event bus.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}
object PutPartnerEventsResponse {
  
  inline def apply(): PutPartnerEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPartnerEventsResponse]
  }
  
  extension [Self <: PutPartnerEventsResponse](x: Self) {
    
    inline def setEntries(value: PutPartnerEventsResultEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: PutPartnerEventsResultEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    inline def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
