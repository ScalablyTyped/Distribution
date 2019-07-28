package typings.atAngularCompiler.srcMlUnderscoreParserParserMod

import typings.atAngularCompiler.srcMlUnderscoreParserLexerMod.TokenizeOptions
import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/parser", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(getTagDefinition: js.Function1[/* tagName */ String, TagDefinition]) = this()
  def getTagDefinition(tagName: String): TagDefinition = js.native
  def parse(source: String, url: String): ParseTreeResult = js.native
  def parse(source: String, url: String, options: TokenizeOptions): ParseTreeResult = js.native
}

