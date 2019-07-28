package typings.atAngularCompiler.srcI18nMod

import typings.atAngularCompiler.srcCoreMod.MissingTranslationStrategy
import typings.atAngularCompiler.srcMlUnderscoreParserHtmlUnderscoreParserMod.HtmlParser
import typings.atAngularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n", "I18NHtmlParser")
@js.native
class I18NHtmlParser protected ()
  extends typings.atAngularCompiler.srcI18nI18nUnderscoreHtmlUnderscoreParserMod.I18NHtmlParser {
  def this(_htmlParser: HtmlParser) = this()
  def this(_htmlParser: HtmlParser, translations: String) = this()
  def this(_htmlParser: HtmlParser, translations: String, translationsFormat: String) = this()
  def this(
    _htmlParser: HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy
  ) = this()
  def this(
    _htmlParser: HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy,
    console: Console
  ) = this()
}

