package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var card: js.UndefOr[Card] = js.native
  var directives: js.UndefOr[js.Any] = js.native
  var outputSpeech: js.UndefOr[OutputSpeech] = js.native
  var reprompt: js.UndefOr[Reprompt] = js.native
  var shouldEndSession: js.UndefOr[Boolean] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setCard(value: Card): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
    @scala.inline
    def setDirectives(value: js.Any): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setOutputSpeech(value: OutputSpeech): Self = this.set("outputSpeech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputSpeech: Self = this.set("outputSpeech", js.undefined)
    @scala.inline
    def setReprompt(value: Reprompt): Self = this.set("reprompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReprompt: Self = this.set("reprompt", js.undefined)
    @scala.inline
    def setShouldEndSession(value: Boolean): Self = this.set("shouldEndSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldEndSession: Self = this.set("shouldEndSession", js.undefined)
  }
  
}

