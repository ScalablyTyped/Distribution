package typings.atAngularCompiler.srcMlUnderscoreParserLexerMod

import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", "tokenize")
@js.native
object tokenize extends js.Object {
  def apply(source: String, url: String, getTagDefinition: js.Function1[/* tagName */ String, TagDefinition]): TokenizeResult = js.native
  def apply(
    source: String,
    url: String,
    getTagDefinition: js.Function1[/* tagName */ String, TagDefinition],
    options: TokenizeOptions
  ): TokenizeResult = js.native
}

