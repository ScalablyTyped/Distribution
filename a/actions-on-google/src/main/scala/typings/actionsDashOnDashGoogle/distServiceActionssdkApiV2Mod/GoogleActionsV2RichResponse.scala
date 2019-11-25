package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2RichResponse extends js.Object {
  /**
    * A list of UI elements which compose the response
    * The items must meet the following requirements:
    * 1. The first item must be a
    * SimpleResponse
    * 2. At most two SimpleResponse
    * 3. At most one rich response item (e.g.
    * BasicCard,
    *  StructuredResponse,
    *  MediaResponse, or
    *  HtmlResponse)
    * 4. You cannot use a rich response item if you're using an
    * actions.intent.OPTION intent
    *  ie ListSelect or
    *     CarouselSelect
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2RichResponseItem]] = js.undefined
  /**
    * An additional suggestion chip that can link out to the associated app
    * or site.
    */
  var linkOutSuggestion: js.UndefOr[GoogleActionsV2UiElementsLinkOutSuggestion] = js.undefined
  /**
    * A list of suggested replies. These will always appear at the end of the
    * response. If used in a FinalResponse,
    * they will be ignored.
    */
  var suggestions: js.UndefOr[js.Array[GoogleActionsV2UiElementsSuggestion]] = js.undefined
}

object GoogleActionsV2RichResponse {
  @scala.inline
  def apply(
    items: js.Array[GoogleActionsV2RichResponseItem] = null,
    linkOutSuggestion: GoogleActionsV2UiElementsLinkOutSuggestion = null,
    suggestions: js.Array[GoogleActionsV2UiElementsSuggestion] = null
  ): GoogleActionsV2RichResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (linkOutSuggestion != null) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2RichResponse]
  }
}

