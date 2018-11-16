package typings
package antlr4DashAutosuggestLib.antlr4DashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4-autosuggest", JSImport.Namespace)
@js.native
object antlr4DashAutosuggestModMembers extends js.Object {
  def autosuggester(
    lexerCtr: Constructor[antlr4Lib.antlr4Mod.Lexer],
    parserCtr: Constructor[antlr4Lib.antlr4Mod.Parser]
  ): AutoSuggester = js.native
  def autosuggester(
    lexerCtr: Constructor[antlr4Lib.antlr4Mod.Lexer],
    parserCtr: Constructor[antlr4Lib.antlr4Mod.Parser],
    casePref: CasePreference
  ): AutoSuggester = js.native
}

