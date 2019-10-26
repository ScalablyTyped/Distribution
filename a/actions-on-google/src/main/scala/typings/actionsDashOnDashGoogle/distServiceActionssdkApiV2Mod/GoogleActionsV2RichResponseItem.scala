package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2RichResponseItem extends _RichResponseItem {
  /**
    * A basic card.
    */
  var basicCard: js.UndefOr[GoogleActionsV2UiElementsBasicCard] = js.undefined
  /**
    * Carousel browse card, use collection_browse instead..
    */
  var carouselBrowse: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowse] = js.undefined
  /**
    * Html response used to render on Canvas.
    */
  var htmlResponse: js.UndefOr[GoogleActionsV2UiElementsHtmlResponse] = js.undefined
  /**
    * Response indicating a set of media to be played.
    */
  var mediaResponse: js.UndefOr[GoogleActionsV2MediaResponse] = js.undefined
  /**
    * Optional named identifier of this Item.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Voice and text-only response.
    */
  var simpleResponse: js.UndefOr[GoogleActionsV2SimpleResponse] = js.undefined
  /**
    * Structured payload to be processed by Google.
    */
  var structuredResponse: js.UndefOr[GoogleActionsV2StructuredResponse] = js.undefined
  /**
    * Table card.
    */
  var tableCard: js.UndefOr[GoogleActionsV2UiElementsTableCard] = js.undefined
}

object GoogleActionsV2RichResponseItem {
  @scala.inline
  def apply(
    basicCard: GoogleActionsV2UiElementsBasicCard = null,
    carouselBrowse: GoogleActionsV2UiElementsCarouselBrowse = null,
    htmlResponse: GoogleActionsV2UiElementsHtmlResponse = null,
    mediaResponse: GoogleActionsV2MediaResponse = null,
    name: String = null,
    simpleResponse: GoogleActionsV2SimpleResponse = null,
    structuredResponse: GoogleActionsV2StructuredResponse = null,
    tableCard: GoogleActionsV2UiElementsTableCard = null
  ): GoogleActionsV2RichResponseItem = {
    val __obj = js.Dynamic.literal()
    if (basicCard != null) __obj.updateDynamic("basicCard")(basicCard)
    if (carouselBrowse != null) __obj.updateDynamic("carouselBrowse")(carouselBrowse)
    if (htmlResponse != null) __obj.updateDynamic("htmlResponse")(htmlResponse)
    if (mediaResponse != null) __obj.updateDynamic("mediaResponse")(mediaResponse)
    if (name != null) __obj.updateDynamic("name")(name)
    if (simpleResponse != null) __obj.updateDynamic("simpleResponse")(simpleResponse)
    if (structuredResponse != null) __obj.updateDynamic("structuredResponse")(structuredResponse)
    if (tableCard != null) __obj.updateDynamic("tableCard")(tableCard)
    __obj.asInstanceOf[GoogleActionsV2RichResponseItem]
  }
}

