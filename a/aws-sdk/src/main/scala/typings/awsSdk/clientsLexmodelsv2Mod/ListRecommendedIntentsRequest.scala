package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendedIntentsRequest extends StObject {
  
  /**
    * The unique identifier of the bot associated with the recommended intents.
    */
  var botId: Id
  
  /**
    * The identifier of the bot recommendation that contains the recommended intents.
    */
  var botRecommendationId: Id
  
  /**
    * The version of the bot that contains the recommended intents.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the language and locale of the recommended intents.
    */
  var localeId: LocaleId
  
  /**
    * The maximum number of bot recommendations to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListRecommendedIntents operation contains more results than specified in the maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListRecommendedIntentsRequest {
  
  inline def apply(botId: Id, botRecommendationId: Id, botVersion: DraftBotVersion, localeId: LocaleId): ListRecommendedIntentsRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botRecommendationId = botRecommendationId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendedIntentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecommendedIntentsRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
