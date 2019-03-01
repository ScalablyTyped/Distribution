package typings
package artyomDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions extends js.Object {
  var beforePrompt: js.UndefOr[js.Function] = js.undefined
  var onEndPrompt: js.UndefOr[js.Function] = js.undefined
  var onMatch: js.UndefOr[js.Function] = js.undefined
  var onStartPrompt: js.UndefOr[js.Function] = js.undefined
  var options: js.Any
  var question: java.lang.String
  var smart: js.UndefOr[scala.Boolean] = js.undefined
}

object PromptOptions {
  @scala.inline
  def apply(
    options: js.Any,
    question: java.lang.String,
    beforePrompt: js.Function = null,
    onEndPrompt: js.Function = null,
    onMatch: js.Function = null,
    onStartPrompt: js.Function = null,
    smart: js.UndefOr[scala.Boolean] = js.undefined
  ): PromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("question")(question)
    if (beforePrompt != null) __obj.updateDynamic("beforePrompt")(beforePrompt)
    if (onEndPrompt != null) __obj.updateDynamic("onEndPrompt")(onEndPrompt)
    if (onMatch != null) __obj.updateDynamic("onMatch")(onMatch)
    if (onStartPrompt != null) __obj.updateDynamic("onStartPrompt")(onStartPrompt)
    if (!js.isUndefined(smart)) __obj.updateDynamic("smart")(smart)
    __obj.asInstanceOf[PromptOptions]
  }
}

