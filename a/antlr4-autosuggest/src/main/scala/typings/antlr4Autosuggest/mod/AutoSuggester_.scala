package typings.antlr4Autosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSuggester_ extends js.Object {
  def autosuggest(inputText: String): js.Array[String] = js.native
}

object AutoSuggester_ {
  @scala.inline
  def apply(autosuggest: String => js.Array[String]): AutoSuggester_ = {
    val __obj = js.Dynamic.literal(autosuggest = js.Any.fromFunction1(autosuggest))
    __obj.asInstanceOf[AutoSuggester_]
  }
  @scala.inline
  implicit class AutoSuggester_Ops[Self <: AutoSuggester_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutosuggest(value: String => js.Array[String]): Self = this.set("autosuggest", js.Any.fromFunction1(value))
  }
  
}

