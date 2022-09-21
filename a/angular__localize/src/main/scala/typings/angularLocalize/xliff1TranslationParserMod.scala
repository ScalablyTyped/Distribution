package typings.angularLocalize

import typings.angularLocalize.translationParserMod.TranslationParser
import typings.angularLocalize.translationUtilsMod.XmlTranslationParserHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xliff1TranslationParserMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/xliff1_translation_parser", "Xliff1TranslationParser")
  @js.native
  open class Xliff1TranslationParser ()
    extends StObject
       with TranslationParser[XmlTranslationParserHint] {
    
    /* private */ var extractBundle: Any = js.native
    
    /* private */ var extractBundleDeprecated: Any = js.native
  }
}
