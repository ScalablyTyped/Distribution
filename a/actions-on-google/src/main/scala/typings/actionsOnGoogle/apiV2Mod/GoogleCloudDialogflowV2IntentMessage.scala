package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessage extends js.Object {
  var basicCard: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCard] = js.undefined
  var card: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCard] = js.undefined
  var carouselSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageCarouselSelect] = js.undefined
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  var linkOutSuggestion: js.UndefOr[GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion] = js.undefined
  var listSelect: js.UndefOr[GoogleCloudDialogflowV2IntentMessageListSelect] = js.undefined
  var payload: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var platform: js.UndefOr[GoogleCloudDialogflowV2IntentMessagePlatform] = js.undefined
  var quickReplies: js.UndefOr[GoogleCloudDialogflowV2IntentMessageQuickReplies] = js.undefined
  var simpleResponses: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSimpleResponses] = js.undefined
  var suggestions: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSuggestions] = js.undefined
  var text: js.UndefOr[GoogleCloudDialogflowV2IntentMessageText] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessage {
  @scala.inline
  def apply(
    basicCard: GoogleCloudDialogflowV2IntentMessageBasicCard = null,
    card: GoogleCloudDialogflowV2IntentMessageCard = null,
    carouselSelect: GoogleCloudDialogflowV2IntentMessageCarouselSelect = null,
    image: GoogleCloudDialogflowV2IntentMessageImage = null,
    linkOutSuggestion: GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion = null,
    listSelect: GoogleCloudDialogflowV2IntentMessageListSelect = null,
    payload: ApiClientObjectMap[_] = null,
    platform: GoogleCloudDialogflowV2IntentMessagePlatform = null,
    quickReplies: GoogleCloudDialogflowV2IntentMessageQuickReplies = null,
    simpleResponses: GoogleCloudDialogflowV2IntentMessageSimpleResponses = null,
    suggestions: GoogleCloudDialogflowV2IntentMessageSuggestions = null,
    text: GoogleCloudDialogflowV2IntentMessageText = null
  ): GoogleCloudDialogflowV2IntentMessage = {
    val __obj = js.Dynamic.literal()
    if (basicCard != null) __obj.updateDynamic("basicCard")(basicCard.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (carouselSelect != null) __obj.updateDynamic("carouselSelect")(carouselSelect.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (linkOutSuggestion != null) __obj.updateDynamic("linkOutSuggestion")(linkOutSuggestion.asInstanceOf[js.Any])
    if (listSelect != null) __obj.updateDynamic("listSelect")(listSelect.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (simpleResponses != null) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessage]
  }
}

