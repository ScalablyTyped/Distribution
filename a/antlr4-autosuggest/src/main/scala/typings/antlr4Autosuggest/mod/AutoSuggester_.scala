package typings.antlr4Autosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSuggester_ extends js.Object {
  def autosuggest(inputText: String): js.Array[String]
}

object AutoSuggester_ {
  @scala.inline
  def apply(autosuggest: String => js.Array[String]): AutoSuggester_ = {
    val __obj = js.Dynamic.literal(autosuggest = js.Any.fromFunction1(autosuggest))
  
    __obj.asInstanceOf[AutoSuggester_]
  }
}

