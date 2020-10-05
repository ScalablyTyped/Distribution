package typings.angularCompiler.mlParserLexerMod

import typings.angularCompiler.tagsMod.TagDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

