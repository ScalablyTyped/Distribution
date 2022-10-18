package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotVersionsResponse extends StObject {
  
  /**
    * The identifier of the bot to list versions for.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * Summary information for the bot versions that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more versions available, the nextToken field contains a token to get the next page of results.
    */
  var botVersionSummaries: js.UndefOr[BotVersionSummaryList] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListBotVersions operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListBotAliases operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBotVersionsResponse {
  
  inline def apply(): ListBotVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotVersionsResponse]
  }
  
  extension [Self <: ListBotVersionsResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersionSummaries(value: BotVersionSummaryList): Self = StObject.set(x, "botVersionSummaries", value.asInstanceOf[js.Any])
    
    inline def setBotVersionSummariesUndefined: Self = StObject.set(x, "botVersionSummaries", js.undefined)
    
    inline def setBotVersionSummariesVarargs(value: BotVersionSummary*): Self = StObject.set(x, "botVersionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
