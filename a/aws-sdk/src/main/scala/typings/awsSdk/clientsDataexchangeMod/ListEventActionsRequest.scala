package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventActionsRequest extends StObject {
  
  /**
    * The unique identifier for the event source.
    */
  var EventSourceId: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of results returned by a single call.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.MaxResults] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListEventActionsRequest {
  
  inline def apply(): ListEventActionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventActionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventActionsRequest] (val x: Self) extends AnyVal {
    
    inline def setEventSourceId(value: string): Self = StObject.set(x, "EventSourceId", value.asInstanceOf[js.Any])
    
    inline def setEventSourceIdUndefined: Self = StObject.set(x, "EventSourceId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
