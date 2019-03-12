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
  def apply(autosuggest: java.lang.String => js.Array[java.lang.String]): AutoSuggester = {
    val __obj = js.Dynamic.literal(autosuggest = js.Any.fromFunction1(autosuggest))
  
    __obj.asInstanceOf[AutoSuggester]
  }
}

