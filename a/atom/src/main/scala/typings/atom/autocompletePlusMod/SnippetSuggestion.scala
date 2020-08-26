package typings.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetSuggestion
  extends SuggestionBase
     with AnySuggestion {
  /**
    *  A snippet string. This will allow users to tab through function arguments
    *  or other options.
    */
  var snippet: String = js.native
}

object SnippetSuggestion {
  @scala.inline
  def apply(snippet: String): SnippetSuggestion = {
    val __obj = js.Dynamic.literal(snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnippetSuggestion]
  }
  @scala.inline
  implicit class SnippetSuggestionOps[Self <: SnippetSuggestion] (val x: Self) extends AnyVal {
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
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
  }
  
}

