package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotRecommendationsResponse extends StObject {
  
  /**
    * The unique identifier of the bot that contains the bot recommendation list.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * Summary information for the bot recommendations that meet the filter specified in this request. The length of the list is specified in the maxResults parameter of the request. If there are more bot recommendations available, the nextToken field contains a token to get the next page of results.
    */
  var botRecommendationSummaries: js.UndefOr[BotRecommendationSummaryList] = js.undefined
  
  /**
    * The version of the bot that contains the bot recommendation list.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The identifier of the language and locale of the bot recommendation list.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListBotRecommendations operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListBotRecommendations operation request to get the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBotRecommendationsResponse {
  
  inline def apply(): ListBotRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotRecommendationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBotRecommendationsResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotRecommendationSummaries(value: BotRecommendationSummaryList): Self = StObject.set(x, "botRecommendationSummaries", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationSummariesUndefined: Self = StObject.set(x, "botRecommendationSummaries", js.undefined)
    
    inline def setBotRecommendationSummariesVarargs(value: BotRecommendationSummary*): Self = StObject.set(x, "botRecommendationSummaries", js.Array(value*))
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
