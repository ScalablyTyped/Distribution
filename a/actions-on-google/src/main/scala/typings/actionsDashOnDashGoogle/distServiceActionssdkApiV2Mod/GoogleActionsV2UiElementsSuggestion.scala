package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2UiElementsSuggestion extends js.Object {
  /**
    * The text shown the in the suggestion chip. When tapped, this text will be
    * posted back to the conversation verbatim as if the user had typed it.
    * Each title must be unique among the set of suggestion chips.
    * Max 25 chars
    * Required
    */
  var title: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2UiElementsSuggestion {
  @scala.inline
  def apply(title: String = null): GoogleActionsV2UiElementsSuggestion = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2UiElementsSuggestion]
  }
}

