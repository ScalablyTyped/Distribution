package typings.angularLocalize

import org.scalablytyped.runtime.StringDictionary
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.ParseAnalysis
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.ParsedTranslationBundle
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.TranslationParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersSimpleJsonTranslationParserMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/simple_json_translation_parser", "SimpleJsonTranslationParser")
  @js.native
  open class SimpleJsonTranslationParser ()
    extends StObject
       with TranslationParser[SimpleJsonFile] {
    
    /**
      * Analyze the file to see if this parser can parse the given file.
      *
      * @param filePath The absolute path to the translation file.
      * @param contents The contents of the translation file.
      * @returns Information indicating whether the file can be parsed by this parser.
      */
    /* CompleteClass */
    override def analyze(filePath: String, contents: String): ParseAnalysis[SimpleJsonFile] = js.native
    
    def parse(_filePath: String, contents: String): ParsedTranslationBundle = js.native
    /**
      * Parses the given file, extracting the target locale and translations.
      *
      * Note that this method should not throw an error. Check the `bundle.diagnostics` property for
      * potential parsing errors and warnings.
      *
      * @param filePath The absolute path to the translation file.
      * @param contents The contents of the translation file.
      * @param hint A value that can be used by the parser to speed up parsing of the file. This will
      * have been provided as the return result from calling `analyze()`.
      * @returns The translation bundle parsed from the file.
      * @throws No errors. If there was a problem with parsing the bundle will contain errors
      * in the `diagnostics` property.
      */
    /* CompleteClass */
    override def parse(filePath: String, contents: String, hint: SimpleJsonFile): ParsedTranslationBundle = js.native
  }
  
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
