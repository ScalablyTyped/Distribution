package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotsResponse extends StObject {
  
  /**
    * Summary information for the bots that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more bots available, the nextToken field contains a token to the next page of results.
    */
  var botSummaries: js.UndefOr[BotSummaryList] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListBots operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListBots operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBotsResponse {
  
  inline def apply(): ListBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBotsResponse] (val x: Self) extends AnyVal {
    
    inline def setBotSummaries(value: BotSummaryList): Self = StObject.set(x, "botSummaries", value.asInstanceOf[js.Any])
    
    inline def setBotSummariesUndefined: Self = StObject.set(x, "botSummaries", js.undefined)
    
    inline def setBotSummariesVarargs(value: BotSummary*): Self = StObject.set(x, "botSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
