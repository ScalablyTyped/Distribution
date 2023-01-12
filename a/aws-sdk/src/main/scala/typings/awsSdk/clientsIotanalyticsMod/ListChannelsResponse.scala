package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChannelsResponse extends StObject {
  
  /**
    * A list of ChannelSummary objects.
    */
  var channelSummaries: js.UndefOr[ChannelSummaries] = js.undefined
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListChannelsResponse {
  
  inline def apply(): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListChannelsResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelSummaries(value: ChannelSummaries): Self = StObject.set(x, "channelSummaries", value.asInstanceOf[js.Any])
    
    inline def setChannelSummariesUndefined: Self = StObject.set(x, "channelSummaries", js.undefined)
    
    inline def setChannelSummariesVarargs(value: ChannelSummary*): Self = StObject.set(x, "channelSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
