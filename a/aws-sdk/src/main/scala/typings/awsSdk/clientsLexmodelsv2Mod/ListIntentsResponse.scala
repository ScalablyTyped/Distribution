package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntentsResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the intent.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that contains the intent.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * Summary information for the intents that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more intents available, the nextToken field contains a token to get the next page of results.
    */
  var intentSummaries: js.UndefOr[IntentSummaryList] = js.undefined
  
  /**
    * The language and locale of the intents in the list.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListIntents operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListIntents operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListIntentsResponse {
  
  inline def apply(): ListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIntentsResponse]
  }
  
  extension [Self <: ListIntentsResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setIntentSummaries(value: IntentSummaryList): Self = StObject.set(x, "intentSummaries", value.asInstanceOf[js.Any])
    
    inline def setIntentSummariesUndefined: Self = StObject.set(x, "intentSummaries", js.undefined)
    
    inline def setIntentSummariesVarargs(value: IntentSummary*): Self = StObject.set(x, "intentSummaries", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
