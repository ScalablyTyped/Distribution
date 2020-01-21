package typings.angularCompiler.publicApiMod

import typings.angularCompiler.coreMod.MissingTranslationStrategy
import typings.angularCompiler.srcUtilMod.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "I18NHtmlParser")
@js.native
class I18NHtmlParser protected ()
  extends typings.angularCompiler.srcCompilerMod.I18NHtmlParser {
  def this(_htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser) = this()
  def this(_htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser, translations: String) = this()
  def this(
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String
  ) = this()
  def this(
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy
  ) = this()
  def this(
    _htmlParser: typings.angularCompiler.htmlParserMod.HtmlParser,
    translations: String,
    translationsFormat: String,
    missingTranslation: MissingTranslationStrategy,
    console: Console
  ) = this()
}

