package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportResourceSpecification extends StObject {
  
  /**
    * Parameters for exporting a bot.
    */
  var botExportSpecification: js.UndefOr[BotExportSpecification] = js.undefined
  
  /**
    * Parameters for exporting a bot locale.
    */
  var botLocaleExportSpecification: js.UndefOr[BotLocaleExportSpecification] = js.undefined
  
  /**
    * The parameters required to export a custom vocabulary.
    */
  var customVocabularyExportSpecification: js.UndefOr[CustomVocabularyExportSpecification] = js.undefined
}
object ExportResourceSpecification {
  
  inline def apply(): ExportResourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportResourceSpecification]
  }
  
  extension [Self <: ExportResourceSpecification](x: Self) {
    
    inline def setBotExportSpecification(value: BotExportSpecification): Self = StObject.set(x, "botExportSpecification", value.asInstanceOf[js.Any])
    
    inline def setBotExportSpecificationUndefined: Self = StObject.set(x, "botExportSpecification", js.undefined)
    
    inline def setBotLocaleExportSpecification(value: BotLocaleExportSpecification): Self = StObject.set(x, "botLocaleExportSpecification", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleExportSpecificationUndefined: Self = StObject.set(x, "botLocaleExportSpecification", js.undefined)
    
    inline def setCustomVocabularyExportSpecification(value: CustomVocabularyExportSpecification): Self = StObject.set(x, "customVocabularyExportSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyExportSpecificationUndefined: Self = StObject.set(x, "customVocabularyExportSpecification", js.undefined)
  }
}
