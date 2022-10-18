package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsResponse extends StObject {
  
  /**
    * A token used to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of streams.
    */
  var streams: js.UndefOr[StreamsSummary] = js.undefined
}
object ListStreamsResponse {
  
  inline def apply(): ListStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsResponse]
  }
  
  extension [Self <: ListStreamsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStreams(value: StreamsSummary): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsUndefined: Self = StObject.set(x, "streams", js.undefined)
    
    inline def setStreamsVarargs(value: StreamSummary*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
