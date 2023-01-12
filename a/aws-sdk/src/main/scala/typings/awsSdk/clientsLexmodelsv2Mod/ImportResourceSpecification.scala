package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportResourceSpecification extends StObject {
  
  /**
    * Parameters for importing a bot.
    */
  var botImportSpecification: js.UndefOr[BotImportSpecification] = js.undefined
  
  /**
    * Parameters for importing a bot locale.
    */
  var botLocaleImportSpecification: js.UndefOr[BotLocaleImportSpecification] = js.undefined
  
  var customVocabularyImportSpecification: js.UndefOr[CustomVocabularyImportSpecification] = js.undefined
}
object ImportResourceSpecification {
  
  inline def apply(): ImportResourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportResourceSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportResourceSpecification] (val x: Self) extends AnyVal {
    
    inline def setBotImportSpecification(value: BotImportSpecification): Self = StObject.set(x, "botImportSpecification", value.asInstanceOf[js.Any])
    
    inline def setBotImportSpecificationUndefined: Self = StObject.set(x, "botImportSpecification", js.undefined)
    
    inline def setBotLocaleImportSpecification(value: BotLocaleImportSpecification): Self = StObject.set(x, "botLocaleImportSpecification", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleImportSpecificationUndefined: Self = StObject.set(x, "botLocaleImportSpecification", js.undefined)
    
    inline def setCustomVocabularyImportSpecification(value: CustomVocabularyImportSpecification): Self = StObject.set(x, "customVocabularyImportSpecification", value.asInstanceOf[js.Any])
    
    inline def setCustomVocabularyImportSpecificationUndefined: Self = StObject.set(x, "customVocabularyImportSpecification", js.undefined)
  }
}
