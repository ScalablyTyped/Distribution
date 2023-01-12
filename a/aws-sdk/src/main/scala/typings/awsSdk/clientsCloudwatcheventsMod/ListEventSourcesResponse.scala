package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventSourcesResponse extends StObject {
  
  /**
    * The list of event sources.
    */
  var EventSources: js.UndefOr[EventSourceList] = js.undefined
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
}
object ListEventSourcesResponse {
  
  inline def apply(): ListEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventSourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setEventSources(value: EventSourceList): Self = StObject.set(x, "EventSources", value.asInstanceOf[js.Any])
    
    inline def setEventSourcesUndefined: Self = StObject.set(x, "EventSources", js.undefined)
    
    inline def setEventSourcesVarargs(value: EventSource*): Self = StObject.set(x, "EventSources", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
