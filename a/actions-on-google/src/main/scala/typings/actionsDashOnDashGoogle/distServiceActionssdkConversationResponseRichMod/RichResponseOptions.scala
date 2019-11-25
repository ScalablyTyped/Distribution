package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsLinkOutSuggestion
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSuggestionMod.Suggestions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RichResponseOptions extends js.Object {
  /**
    * Ordered list of either SimpleResponse objects or BasicCard objects.
    * First item must be SimpleResponse. There can be at most one card.
    * @public
    */
  var items: js.UndefOr[js.Array[RichResponseItem]] = js.undefined
  /**
    * Link Out Suggestion chip for this rich response. Optional.
    * @public
    */
  var link: js.UndefOr[GoogleActionsV2UiElementsLinkOutSuggestion] = js.undefined
  /**
    * Ordered list of text suggestions to display. Optional.
    * @public
    */
  var suggestions: js.UndefOr[js.Array[String] | Suggestions] = js.undefined
}

object RichResponseOptions {
  @scala.inline
  def apply(
    items: js.Array[RichResponseItem] = null,
    link: GoogleActionsV2UiElementsLinkOutSuggestion = null,
    suggestions: js.Array[String] | Suggestions = null
  ): RichResponseOptions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichResponseOptions]
  }
}

