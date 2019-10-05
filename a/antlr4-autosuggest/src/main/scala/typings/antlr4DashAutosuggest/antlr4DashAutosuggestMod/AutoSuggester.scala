package typings.antlr4DashAutosuggest.antlr4DashAutosuggestMod

import typings.antlr4.antlr4Mod.Lexer
import typings.antlr4.antlr4Mod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSuggester extends js.Object {
  def autosuggest(inputText: String): js.Array[String]
}

object AutoSuggester {
  @scala.inline
  def apply(autosuggest: String => js.Array[String]): AutoSuggester = {
    val __obj = js.Dynamic.literal(autosuggest = js.Any.fromFunction1(autosuggest))
  
    __obj.asInstanceOf[AutoSuggester]
  }
}

@JSImport("antlr4-autosuggest", "autosuggester")
@js.native
object autosuggester extends js.Object {
  def apply(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser]): AutoSuggester = js.native
  def apply(lexerCtr: Constructor[Lexer], parserCtr: Constructor[Parser], casePref: CasePreference): AutoSuggester = js.native
}

