package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProjectEventsResponse extends StObject {
  
  /**
    * A structure that contains Evidently's response to the sent events, including an event ID and error codes, if any.
    */
  var eventResults: js.UndefOr[PutProjectEventsResultEntryList] = js.undefined
  
  /**
    * The number of events in the operation that could not be used by Evidently.
    */
  var failedEventCount: js.UndefOr[Integer] = js.undefined
}
object PutProjectEventsResponse {
  
  inline def apply(): PutProjectEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutProjectEventsResponse]
  }
  
  extension [Self <: PutProjectEventsResponse](x: Self) {
    
    inline def setEventResults(value: PutProjectEventsResultEntryList): Self = StObject.set(x, "eventResults", value.asInstanceOf[js.Any])
    
    inline def setEventResultsUndefined: Self = StObject.set(x, "eventResults", js.undefined)
    
    inline def setEventResultsVarargs(value: PutProjectEventsResultEntry*): Self = StObject.set(x, "eventResults", js.Array(value*))
    
    inline def setFailedEventCount(value: Integer): Self = StObject.set(x, "failedEventCount", value.asInstanceOf[js.Any])
    
    inline def setFailedEventCountUndefined: Self = StObject.set(x, "failedEventCount", js.undefined)
  }
}
