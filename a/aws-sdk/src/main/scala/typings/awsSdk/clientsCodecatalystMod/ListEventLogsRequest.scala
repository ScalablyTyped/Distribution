package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventLogsRequest extends StObject {
  
  /**
    * The time after which you do not want any events retrieved, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var endTime: js.Date
  
  /**
    * The name of the event.
    */
  var eventName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to show in a single call to this API. If the number of results is larger than the number you specified, the response will include a NextToken element, which you can use to obtain additional results.
    */
  var maxResults: js.UndefOr[ListEventLogsRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[ListEventLogsRequestNextTokenString] = js.undefined
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
  
  /**
    * The date and time when you want to start retrieving events, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var startTime: js.Date
}
object ListEventLogsRequest {
  
  inline def apply(endTime: js.Date, spaceName: NameString, startTime: js.Date): ListEventLogsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventLogsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEventLogsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setMaxResults(value: ListEventLogsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListEventLogsRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
