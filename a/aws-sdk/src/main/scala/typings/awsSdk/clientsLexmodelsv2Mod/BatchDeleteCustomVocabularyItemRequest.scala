package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteCustomVocabularyItemRequest extends StObject {
  
  /**
    * The unique identifier of the bot to batch delete request for the custom vocabulary item.
    */
  var botId: Id
  
  /**
    * The version of the bot to batch delete request for the custom vocabulary item.
    */
  var botVersion: BotVersion
  
  /**
    * The custom vocabulary list to batch delete request for the custom vocabulary item.
    */
  var customVocabularyItemList: DeleteCustomVocabularyItemsList
  
  /**
    * The locale identifier of the bot to batch delete request for the custom vocabulary item.
    */
  var localeId: LocaleId
}
object BatchDeleteCustomVocabularyItemRequest {
  
  inline def apply(
    botId: Id,
    botVersion: BotVersion,
    customVocabularyItemList: DeleteCustomVocabularyItemsList,
    localeId: LocaleId
  ): BatchDeleteCustomVocabularyItemRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], customVocabularyItemList = customVocabularyItemList.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteCustomVocabularyItemRequest]
  }
  
  extension [Self <: BatchDeleteCustomVocabularyItemRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemList(value: DeleteCustomVocabularyItemsList): Self = StObject.set(x, "customVocabularyItemList", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemListVarargs(value: CustomVocabularyEntryId*): Self = StObject.set(x, "customVocabularyItemList", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
