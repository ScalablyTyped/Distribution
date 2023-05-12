package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterLogEventsResponse extends StObject {
  
  /**
    * The matched events.
    */
  var events: js.UndefOr[FilteredLogEvents] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. The token expires after 24 hours.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  Important As of May 15, 2020, this parameter is no longer supported. This parameter returns an empty list. Indicates which log streams have been searched and whether each has been searched completely.
    */
  var searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined
}
object FilterLogEventsResponse {
  
  inline def apply(): FilterLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterLogEventsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterLogEventsResponse] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: FilteredLogEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: FilteredLogEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSearchedLogStreams(value: SearchedLogStreams): Self = StObject.set(x, "searchedLogStreams", value.asInstanceOf[js.Any])
    
    inline def setSearchedLogStreamsUndefined: Self = StObject.set(x, "searchedLogStreams", js.undefined)
    
    inline def setSearchedLogStreamsVarargs(value: SearchedLogStream*): Self = StObject.set(x, "searchedLogStreams", js.Array(value*))
  }
}
