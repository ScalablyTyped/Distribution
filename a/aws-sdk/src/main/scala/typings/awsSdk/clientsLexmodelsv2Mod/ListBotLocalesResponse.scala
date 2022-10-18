package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotLocalesResponse extends StObject {
  
  /**
    * The identifier of the bot to list locales for.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * Summary information for the locales that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more locales available, the nextToken field contains a token to get the next page of results.
    */
  var botLocaleSummaries: js.UndefOr[BotLocaleSummaryList] = js.undefined
  
  /**
    * The version of the bot.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListBotLocales operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListBotLocales operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBotLocalesResponse {
  
  inline def apply(): ListBotLocalesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotLocalesResponse]
  }
  
  extension [Self <: ListBotLocalesResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotLocaleSummaries(value: BotLocaleSummaryList): Self = StObject.set(x, "botLocaleSummaries", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleSummariesUndefined: Self = StObject.set(x, "botLocaleSummaries", js.undefined)
    
    inline def setBotLocaleSummariesVarargs(value: BotLocaleSummary*): Self = StObject.set(x, "botLocaleSummaries", js.Array(value*))
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
