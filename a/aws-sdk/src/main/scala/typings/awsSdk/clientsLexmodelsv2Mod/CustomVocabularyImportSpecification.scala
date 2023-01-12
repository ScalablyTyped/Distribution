package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomVocabularyImportSpecification extends StObject {
  
  /**
    * The identifier of the bot to import the custom vocabulary to.
    */
  var botId: Id
  
  /**
    * The version of the bot to import the custom vocabulary to.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the local to import the custom vocabulary to. The value must be en_GB.
    */
  var localeId: LocaleId
}
object CustomVocabularyImportSpecification {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId): CustomVocabularyImportSpecification = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomVocabularyImportSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomVocabularyImportSpecification] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
