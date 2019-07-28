package typings.antlr4DashAutosuggest.antlr4DashAutosuggestMod

import typings.antlr4.antlr4Mod.Lexer
import typings.antlr4.antlr4Mod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4-autosuggest", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def autosuggester(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser]): AutoSuggester = js.native
  def autosuggester(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser], casePref: CasePreference): AutoSuggester = js.native
}

