package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendedIntentsResponse extends StObject {
  
  /**
    * The unique identifier of the bot associated with the recommended intent.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the bot recommendation that contains the recommended intent.
    */
  var botRecommendationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that contains the intent.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The identifier of the language and locale of the intents to list. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListRecommendedIntents operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListRecommendedIntents operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Summary information for the intents that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more intents available, the nextToken field contains a token to get the next page of results.
    */
  var summaryList: js.UndefOr[RecommendedIntentSummaryList] = js.undefined
}
object ListRecommendedIntentsResponse {
  
  inline def apply(): ListRecommendedIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendedIntentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRecommendedIntentsResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationIdUndefined: Self = StObject.set(x, "botRecommendationId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaryList(value: RecommendedIntentSummaryList): Self = StObject.set(x, "summaryList", value.asInstanceOf[js.Any])
    
    inline def setSummaryListUndefined: Self = StObject.set(x, "summaryList", js.undefined)
    
    inline def setSummaryListVarargs(value: RecommendedIntentSummary*): Self = StObject.set(x, "summaryList", js.Array(value*))
  }
}
