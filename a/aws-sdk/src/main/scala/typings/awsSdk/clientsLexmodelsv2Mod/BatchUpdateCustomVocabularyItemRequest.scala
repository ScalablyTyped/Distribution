package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateCustomVocabularyItemRequest extends StObject {
  
  /**
    * The unique identifier of the bot to the batch update request for the custom vocabulary item.
    */
  var botId: Id
  
  /**
    * The bot version of the bot to the batch update request for the custom vocabulary item.
    */
  var botVersion: BotVersion
  
  /**
    * The custom vocabulary item list of the bot to the batch update request for the custom vocabulary item.
    */
  var customVocabularyItemList: UpdateCustomVocabularyItemsList
  
  /**
    * The locale identifier of the bot to the batch update request for the custom vocabulary item.
    */
  var localeId: LocaleId
}
object BatchUpdateCustomVocabularyItemRequest {
  
  inline def apply(
    botId: Id,
    botVersion: BotVersion,
    customVocabularyItemList: UpdateCustomVocabularyItemsList,
    localeId: LocaleId
  ): BatchUpdateCustomVocabularyItemRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], customVocabularyItemList = customVocabularyItemList.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateCustomVocabularyItemRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateCustomVocabularyItemRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemList(value: UpdateCustomVocabularyItemsList): Self = StObject.set(x, "customVocabularyItemList", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemListVarargs(value: CustomVocabularyItem*): Self = StObject.set(x, "customVocabularyItemList", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
