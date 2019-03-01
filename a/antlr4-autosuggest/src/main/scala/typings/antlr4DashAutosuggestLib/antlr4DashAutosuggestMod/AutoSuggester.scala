package typings
package antlr4DashAutosuggestLib.antlr4DashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSuggester extends js.Object {
  def autosuggest(inputText: java.lang.String): js.Array[java.lang.String]
}

object AutoSuggester {
  @scala.inline
  def apply(autosuggest: js.Function1[java.lang.String, js.Array[java.lang.String]]): AutoSuggester = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autosuggest")(autosuggest)
    __obj.asInstanceOf[AutoSuggester]
  }
}

