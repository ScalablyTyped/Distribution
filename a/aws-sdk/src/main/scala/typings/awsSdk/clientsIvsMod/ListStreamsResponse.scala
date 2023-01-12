package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsResponse extends StObject {
  
  /**
    * If there are more streams than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of streams.
    */
  var streams: StreamList
}
object ListStreamsResponse {
  
  inline def apply(streams: StreamList): ListStreamsResponse = {
    val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStreams(value: StreamList): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: StreamSummary*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
