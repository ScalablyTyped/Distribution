package typings.angularLocalize

import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.ParseAnalysis
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.ParsedTranslationBundle
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.TranslationParser
import typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationUtilsMod.XmlTranslationParserHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersXliff2TranslationParserMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/xliff2_translation_parser", "Xliff2TranslationParser")
  @js.native
  open class Xliff2TranslationParser ()
    extends StObject
       with TranslationParser[XmlTranslationParserHint] {
    
    /**
      * Analyze the file to see if this parser can parse the given file.
      *
      * @param filePath The absolute path to the translation file.
      * @param contents The contents of the translation file.
      * @returns Information indicating whether the file can be parsed by this parser.
      */
    /* CompleteClass */
    override def analyze(filePath: String, contents: String): ParseAnalysis[XmlTranslationParserHint] = js.native
    
    /* private */ var extractBundle: Any = js.native
    
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
    override def parse(filePath: String, contents: String, hint: XmlTranslationParserHint): ParsedTranslationBundle = js.native
  }
}
