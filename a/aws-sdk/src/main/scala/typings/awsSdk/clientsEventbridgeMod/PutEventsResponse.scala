package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsResponse extends StObject {
  
  /**
    * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
    */
  var Entries: js.UndefOr[PutEventsResultEntryList] = js.undefined
  
  /**
    * The number of failed entries.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.undefined
}
object PutEventsResponse {
  
  inline def apply(): PutEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsResponse]
  }
  
  extension [Self <: PutEventsResponse](x: Self) {
    
    inline def setEntries(value: PutEventsResultEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: PutEventsResultEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setFailedEntryCount(value: Integer): Self = StObject.set(x, "FailedEntryCount", value.asInstanceOf[js.Any])
    
    inline def setFailedEntryCountUndefined: Self = StObject.set(x, "FailedEntryCount", js.undefined)
  }
}
