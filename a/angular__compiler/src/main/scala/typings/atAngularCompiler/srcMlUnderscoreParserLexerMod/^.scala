package typings.atAngularCompiler.srcMlUnderscoreParserLexerMod

import typings.atAngularCompiler.srcMlUnderscoreParserTagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/ml_parser/lexer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def tokenize(source: String, url: String, getTagDefinition: js.Function1[/* tagName */ String, TagDefinition]): TokenizeResult = js.native
  def tokenize(
    source: String,
    url: String,
    getTagDefinition: js.Function1[/* tagName */ String, TagDefinition],
    options: TokenizeOptions
  ): TokenizeResult = js.native
}

