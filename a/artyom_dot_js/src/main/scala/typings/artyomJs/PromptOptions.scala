package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions extends js.Object {
  var beforePrompt: js.UndefOr[js.Function] = js.undefined
  var onEndPrompt: js.UndefOr[js.Function] = js.undefined
  var onMatch: js.UndefOr[js.Function] = js.undefined
  var onStartPrompt: js.UndefOr[js.Function] = js.undefined
  var options: js.Any
  var question: String
  var smart: js.UndefOr[Boolean] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(
    options: js.Any,
    question: String,
    beforePrompt: js.Function = null,
    onEndPrompt: js.Function = null,
    onMatch: js.Function = null,
    onStartPrompt: js.Function = null,
    smart: js.UndefOr[Boolean] = js.undefined
  ): PromptOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
    if (beforePrompt != null) __obj.updateDynamic("beforePrompt")(beforePrompt.asInstanceOf[js.Any])
    if (onEndPrompt != null) __obj.updateDynamic("onEndPrompt")(onEndPrompt.asInstanceOf[js.Any])
    if (onMatch != null) __obj.updateDynamic("onMatch")(onMatch.asInstanceOf[js.Any])
    if (onStartPrompt != null) __obj.updateDynamic("onStartPrompt")(onStartPrompt.asInstanceOf[js.Any])
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptOptions]
  }
}

