package typings.antlr4Autosuggest.mod

import typings.antlr4.mod.Lexer
import typings.antlr4.mod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4-autosuggest", "autosuggester")
@js.native
object autosuggester extends js.Object {
  def apply(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser]): AutoSuggester_ = js.native
  def apply(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser], casePref: CasePreference): AutoSuggester_ = js.native
}

