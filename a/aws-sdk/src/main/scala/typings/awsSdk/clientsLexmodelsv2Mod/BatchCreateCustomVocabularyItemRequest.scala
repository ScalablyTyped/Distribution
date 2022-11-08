package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateCustomVocabularyItemRequest extends StObject {
  
  /**
    * The unique identifier of the bot to batch create the custom vocabulary item for.
    */
  var botId: Id
  
  /**
    * The bot version of the bot to batch create the custom vocabulary item for.
    */
  var botVersion: BotVersion
  
  /**
    * The custom vocabulary item list of the bot to batch create the custom vocabulary item for.
    */
  var customVocabularyItemList: CreateCustomVocabularyItemsList
  
  /**
    * The unique locale identifier of the bot to batch create the custom vocabulary item for.
    */
  var localeId: LocaleId
}
object BatchCreateCustomVocabularyItemRequest {
  
  inline def apply(
    botId: Id,
    botVersion: BotVersion,
    customVocabularyItemList: CreateCustomVocabularyItemsList,
    localeId: LocaleId
  ): BatchCreateCustomVocabularyItemRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], customVocabularyItemList = customVocabularyItemList.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchCreateCustomVocabularyItemRequest]
  }
  
  extension [Self <: BatchCreateCustomVocabularyItemRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemList(value: CreateCustomVocabularyItemsList): Self = StObject.set(x, "customVocabularyItemList", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemListVarargs(value: NewCustomVocabularyItem*): Self = StObject.set(x, "customVocabularyItemList", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
