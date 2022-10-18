package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomVocabularyExportSpecification extends StObject {
  
  /**
    * The identifier of the bot that contains the custom vocabulary to export.
    */
  var botId: Id
  
  /**
    * The version of the bot that contains the custom vocabulary to export.
    */
  var botVersion: BotVersion
  
  /**
    * The locale of the bot that contains the custom vocabulary to export.
    */
  var localeId: LocaleId
}
object CustomVocabularyExportSpecification {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId): CustomVocabularyExportSpecification = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomVocabularyExportSpecification]
  }
  
  extension [Self <: CustomVocabularyExportSpecification](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
