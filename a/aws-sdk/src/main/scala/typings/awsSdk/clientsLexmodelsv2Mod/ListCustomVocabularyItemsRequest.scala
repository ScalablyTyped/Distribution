package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomVocabularyItemsRequest extends StObject {
  
  /**
    * The unique identifier of the bot to the list custom vocabulary request.
    */
  var botId: Id
  
  /**
    * The bot version of the bot to the list custom vocabulary request.
    */
  var botVersion: BotVersion
  
  /**
    * The locale identifier of the bot to the list custom vocabulary request.
    */
  var localeId: LocaleId
  
  /**
    * The maximum results to the list custom vocabulary request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The nextToken identifier to the list custom vocabulary request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCustomVocabularyItemsRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId): ListCustomVocabularyItemsRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomVocabularyItemsRequest]
  }
  
  extension [Self <: ListCustomVocabularyItemsRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
