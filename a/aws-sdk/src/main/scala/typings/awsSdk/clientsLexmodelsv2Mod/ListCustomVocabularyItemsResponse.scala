package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomVocabularyItemsResponse extends StObject {
  
  /**
    * The unique identifier of the bot to the list custom vocabulary response.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The bot version of the bot to the list custom vocabulary response.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The custom vocabulary items from the list custom vocabulary response.
    */
  var customVocabularyItems: js.UndefOr[CustomVocabularyItems] = js.undefined
  
  /**
    * The locale identifier of the bot to the list custom vocabulary response.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The nextToken identifier to the list custom vocabulary response.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListCustomVocabularyItemsResponse {
  
  inline def apply(): ListCustomVocabularyItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomVocabularyItemsResponse]
  }
  
  extension [Self <: ListCustomVocabularyItemsResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCustomVocabularyItems(value: CustomVocabularyItems): Self = StObject.set(x, "customVocabularyItems", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemsUndefined: Self = StObject.set(x, "customVocabularyItems", js.undefined)
    
    inline def setCustomVocabularyItemsVarargs(value: CustomVocabularyItem*): Self = StObject.set(x, "customVocabularyItems", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
