package typings.antlr4DashAutosuggest.antlr4DashAutosuggestMod

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

