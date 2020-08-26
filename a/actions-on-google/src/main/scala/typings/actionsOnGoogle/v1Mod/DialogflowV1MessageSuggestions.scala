package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.suggestion_chips
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogflowV1MessageSuggestions
  extends DialogflowV1BaseGoogleMessage[suggestion_chips]
     with DialogflowV1Message {
  var suggestions: js.UndefOr[js.Array[DialogflowV1MessageSuggestion]] = js.native
}

object DialogflowV1MessageSuggestions {
  @scala.inline
  def apply(platform: google): DialogflowV1MessageSuggestions = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageSuggestions]
  }
  @scala.inline
  implicit class DialogflowV1MessageSuggestionsOps[Self <: DialogflowV1MessageSuggestions] (val x: Self) extends AnyVal {
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
    def setSuggestionsVarargs(value: DialogflowV1MessageSuggestion*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[DialogflowV1MessageSuggestion]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
  }
  
}

