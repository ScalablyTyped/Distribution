package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteCustomVocabularyItemRequest extends StObject {
  
  /**
    * The identifier of the bot associated with this custom vocabulary.
    */
  var botId: Id
  
  /**
    * The identifier of the version of the bot associated with this custom vocabulary.
    */
  var botVersion: BotVersion
  
  /**
    * A list of custom vocabulary items requested to be deleted. Each entry must contain the unique custom vocabulary entry identifier.
    */
  var customVocabularyItemList: DeleteCustomVocabularyItemsList
  
  /**
    * The identifier of the language and locale where this custom vocabulary is used. The string must match one of the supported locales. For more information, see  Supported Languages .
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteCustomVocabularyItemRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemList(value: DeleteCustomVocabularyItemsList): Self = StObject.set(x, "customVocabularyItemList", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyItemListVarargs(value: CustomVocabularyEntryId*): Self = StObject.set(x, "customVocabularyItemList", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
