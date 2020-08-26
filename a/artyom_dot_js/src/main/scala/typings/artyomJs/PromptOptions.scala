package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptOptions extends js.Object {
  var beforePrompt: js.UndefOr[js.Function] = js.native
  var onEndPrompt: js.UndefOr[js.Function] = js.native
  var onMatch: js.UndefOr[js.Function] = js.native
  var onStartPrompt: js.UndefOr[js.Function] = js.native
  var options: js.Any = js.native
  var question: String = js.native
  var smart: js.UndefOr[Boolean] = js.native
}

object PromptOptions {
  @scala.inline
  def apply(options: js.Any, question: String): PromptOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
  @scala.inline
  implicit class PromptOptionsOps[Self <: PromptOptions] (val x: Self) extends AnyVal {
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
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforePrompt(value: js.Function): Self = this.set("beforePrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeforePrompt: Self = this.set("beforePrompt", js.undefined)
    @scala.inline
    def setOnEndPrompt(value: js.Function): Self = this.set("onEndPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEndPrompt: Self = this.set("onEndPrompt", js.undefined)
    @scala.inline
    def setOnMatch(value: js.Function): Self = this.set("onMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnMatch: Self = this.set("onMatch", js.undefined)
    @scala.inline
    def setOnStartPrompt(value: js.Function): Self = this.set("onStartPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnStartPrompt: Self = this.set("onStartPrompt", js.undefined)
    @scala.inline
    def setSmart(value: Boolean): Self = this.set("smart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmart: Self = this.set("smart", js.undefined)
  }
  
}

