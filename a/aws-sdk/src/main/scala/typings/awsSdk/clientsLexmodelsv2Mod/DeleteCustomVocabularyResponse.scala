package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomVocabularyResponse extends StObject {
  
  /**
    * The identifier of the bot that the custom vocabulary was removed from.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that the custom vocabulary was removed from.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The status of removing the custom vocabulary.
    */
  var customVocabularyStatus: js.UndefOr[CustomVocabularyStatus] = js.undefined
  
  /**
    * The locale identifier for the locale that the custom vocabulary was removed from.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
}
object DeleteCustomVocabularyResponse {
  
  inline def apply(): DeleteCustomVocabularyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomVocabularyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCustomVocabularyResponse] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCustomVocabularyStatus(value: CustomVocabularyStatus): Self = StObject.set(x, "customVocabularyStatus", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyStatusUndefined: Self = StObject.set(x, "customVocabularyStatus", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
  }
}
