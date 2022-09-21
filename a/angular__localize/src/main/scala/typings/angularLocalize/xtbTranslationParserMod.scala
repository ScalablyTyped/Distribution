package typings.angularLocalize

import typings.angularLocalize.translationParserMod.TranslationParser
import typings.angularLocalize.translationUtilsMod.XmlTranslationParserHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xtbTranslationParserMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/xtb_translation_parser", "XtbTranslationParser")
  @js.native
  open class XtbTranslationParser ()
    extends StObject
       with TranslationParser[XmlTranslationParserHint] {
    
    /* private */ var extractBundle: Any = js.native
    
    /* private */ var extractBundleDeprecated: Any = js.native
  }
}
