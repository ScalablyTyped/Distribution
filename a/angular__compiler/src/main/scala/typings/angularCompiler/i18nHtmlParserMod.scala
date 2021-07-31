package typings.angularCompiler

import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.htmlParserMod.HtmlParser
import typings.angularCompiler.srcUtilMod.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nHtmlParserMod {
  
  @JSImport("@angular/compiler/src/i18n/i18n_html_parser", "I18NHtmlParser")
  @js.native
  class I18NHtmlParser protected () extends HtmlParser {
    def this(_htmlParser: HtmlParser) = this()
    def this(_htmlParser: HtmlParser, translations: String) = this()
    def this(_htmlParser: HtmlParser, translations: String, translationsFormat: String) = this()
    def this(_htmlParser: HtmlParser, translations: Unit, translationsFormat: String) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: Unit,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: Unit,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: Unit,
      translationsFormat: Unit,
      missingTranslation: MissingTranslationStrategy
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: Unit,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: Unit,
      missingTranslation: Unit,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: String,
      translationsFormat: Unit,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: Unit,
      translationsFormat: String,
      missingTranslation: Unit,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: Unit,
      translationsFormat: String,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: Unit,
      translationsFormat: Unit,
      missingTranslation: Unit,
      console: Console
    ) = this()
    def this(
      _htmlParser: HtmlParser,
      translations: Unit,
      translationsFormat: Unit,
      missingTranslation: MissingTranslationStrategy,
      console: Console
    ) = this()
    
    var _htmlParser: js.Any = js.native
    
    var _translationBundle: js.Any = js.native
    
    var getTagDefinition: js.Any = js.native
  }
}
