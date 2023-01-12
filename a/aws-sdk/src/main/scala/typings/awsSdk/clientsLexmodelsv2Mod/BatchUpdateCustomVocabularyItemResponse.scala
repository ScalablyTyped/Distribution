package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateCustomVocabularyItemResponse extends StObject {
  
  /**
    * The unique identifier of the bot to the batch update response for the custom vocabulary item.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The bot version of the bot to the batch update response for the custom vocabulary item.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The errors of the action to batch update response for the custom vocabulary item.
    */
  var errors: js.UndefOr[FailedCustomVocabularyItems] = js.undefined
  
  /**
    * The locale identifier of the bot to the batch update response for the custom vocabulary item.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The resources of the action to batch update response for the custom vocabulary item.
    */
  var resources: js.UndefOr[CustomVocabularyItems] = js.undefined
}
object BatchUpdateCustomVocabularyItemResponse {
  
  inline def apply(): BatchUpdateCustomVocabularyItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateCustomVocabularyItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateCustomVocabularyItemResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setErrors(value: FailedCustomVocabularyItems): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: FailedCustomVocabularyItem*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setResources(value: CustomVocabularyItems): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: CustomVocabularyItem*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
