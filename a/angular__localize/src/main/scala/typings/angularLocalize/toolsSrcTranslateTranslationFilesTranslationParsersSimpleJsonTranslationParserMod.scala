package typings.angularLocalize

import org.scalablytyped.runtime.StringDictionary
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.TranslationParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersSimpleJsonTranslationParserMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/simple_json_translation_parser", "SimpleJsonTranslationParser")
  @js.native
  open class SimpleJsonTranslationParser ()
    extends StObject
       with TranslationParser[SimpleJsonFile]
  
  trait SimpleJsonFile extends StObject {
    
    var locale: String
    
    var translations: StringDictionary[String]
  }
  object SimpleJsonFile {
    
    inline def apply(locale: String, translations: StringDictionary[String]): SimpleJsonFile = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleJsonFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleJsonFile] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: StringDictionary[String]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
}
