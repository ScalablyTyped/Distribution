package typings.angularLocalize

import typings.angularLocalize.angularLocalizeBooleans.`false`
import typings.angularLocalize.angularLocalizeBooleans.`true`
import typings.angularLocalize.localizeMod.MessageId
import typings.angularLocalize.localizeMod.ɵParsedTranslation
import typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod {
  
  trait CanParseAnalysis[Hint]
    extends StObject
       with ParseAnalysis[Hint] {
    
    var canParse: `true`
    
    var diagnostics: Diagnostics
    
    var hint: Hint
  }
  object CanParseAnalysis {
    
    inline def apply[Hint](diagnostics: Diagnostics, hint: Hint): CanParseAnalysis[Hint] = {
      val __obj = js.Dynamic.literal(canParse = true, diagnostics = diagnostics.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanParseAnalysis[Hint]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CanParseAnalysis[?], Hint] (val x: Self & CanParseAnalysis[Hint]) extends AnyVal {
      
      inline def setCanParse(value: `true`): Self = StObject.set(x, "canParse", value.asInstanceOf[js.Any])
      
      inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setHint(value: Hint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    }
  }
  
  trait CannotParseAnalysis
    extends StObject
       with ParseAnalysis[Any] {
    
    var canParse: `false`
    
    var diagnostics: Diagnostics
  }
  object CannotParseAnalysis {
    
    inline def apply(diagnostics: Diagnostics): CannotParseAnalysis = {
      val __obj = js.Dynamic.literal(canParse = false, diagnostics = diagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[CannotParseAnalysis]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CannotParseAnalysis] (val x: Self) extends AnyVal {
      
      inline def setCanParse(value: `false`): Self = StObject.set(x, "canParse", value.asInstanceOf[js.Any])
      
      inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.CanParseAnalysis[Hint]
    - typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.CannotParseAnalysis
  */
  trait ParseAnalysis[Hint] extends StObject
  object ParseAnalysis {
    
    inline def CanParseAnalysis[Hint](diagnostics: Diagnostics, hint: Hint): typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.CanParseAnalysis[Hint] = {
      val __obj = js.Dynamic.literal(canParse = true, diagnostics = diagnostics.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.CanParseAnalysis[Hint]]
    }
    
    inline def CannotParseAnalysis(diagnostics: Diagnostics): typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.CannotParseAnalysis = {
      val __obj = js.Dynamic.literal(canParse = false, diagnostics = diagnostics.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularLocalize.toolsSrcTranslateTranslationFilesTranslationParsersTranslationParserMod.CannotParseAnalysis]
    }
  }
  
  trait ParsedTranslationBundle extends StObject {
    
    var diagnostics: Diagnostics
    
    var locale: js.UndefOr[String] = js.undefined
    
    var translations: Record[MessageId, ɵParsedTranslation]
  }
  object ParsedTranslationBundle {
    
    inline def apply(diagnostics: Diagnostics, translations: Record[MessageId, ɵParsedTranslation]): ParsedTranslationBundle = {
      val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedTranslationBundle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedTranslationBundle] (val x: Self) extends AnyVal {
      
      inline def setDiagnostics(value: Diagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setTranslations(value: Record[MessageId, ɵParsedTranslation]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranslationParser[Hint] extends StObject {
    
    /**
      * Analyze the file to see if this parser can parse the given file.
      *
      * @param filePath The absolute path to the translation file.
      * @param contents The contents of the translation file.
      * @returns Information indicating whether the file can be parsed by this parser.
      */
    def analyze(filePath: String, contents: String): ParseAnalysis[Hint]
    
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
    def parse(filePath: String, contents: String, hint: Hint): ParsedTranslationBundle
  }
  object TranslationParser {
    
    inline def apply[Hint](
      analyze: (String, String) => ParseAnalysis[Hint],
      parse: (String, String, Hint) => ParsedTranslationBundle
    ): TranslationParser[Hint] = {
      val __obj = js.Dynamic.literal(analyze = js.Any.fromFunction2(analyze), parse = js.Any.fromFunction3(parse))
      __obj.asInstanceOf[TranslationParser[Hint]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TranslationParser[?], Hint] (val x: Self & TranslationParser[Hint]) extends AnyVal {
      
      inline def setAnalyze(value: (String, String) => ParseAnalysis[Hint]): Self = StObject.set(x, "analyze", js.Any.fromFunction2(value))
      
      inline def setParse(value: (String, String, Hint) => ParsedTranslationBundle): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    }
  }
}
