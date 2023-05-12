package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateCustomVocabularyItemRequest extends StObject {
  
  /**
    * The identifier of the bot associated with this custom vocabulary
    */
  var botId: Id
  
  /**
    * The identifier of the version of the bot associated with this custom vocabulary.
    */
  var botVersion: BotVersion
  
  /**
    * A list of custom vocabulary items with updated fields. Each entry must contain a phrase and can optionally contain a displayAs and/or a weight.
    */
  var customVocabularyItemList: UpdateCustomVocabularyItemsList
  
  /**
    * The identifier of the language and locale where this custom vocabulary is used. The string must match one of the supported locales. For more information, see  Supported Languages .
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
