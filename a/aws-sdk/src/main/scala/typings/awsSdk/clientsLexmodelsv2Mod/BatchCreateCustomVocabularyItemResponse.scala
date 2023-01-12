package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateCustomVocabularyItemResponse extends StObject {
  
  /**
    * The unique identifier of the bot to batch create response for the custom vocabulary item.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The bot version of the bot to batch create the custom vocabulary item response for.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The errors of the action to batch create the custom vocabulary item response for a bot.
    */
  var errors: js.UndefOr[FailedCustomVocabularyItems] = js.undefined
  
  /**
    * The unique locale identifier of the bot to batch create the custom vocabulary item response for.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The resources of the action to batch create the custom vocabulary item response for a bot.
    */
  var resources: js.UndefOr[CustomVocabularyItems] = js.undefined
}
object BatchCreateCustomVocabularyItemResponse {
  
  inline def apply(): BatchCreateCustomVocabularyItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateCustomVocabularyItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateCustomVocabularyItemResponse] (val x: Self) extends AnyVal {
    
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
