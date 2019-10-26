package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceActionssdkConversationResponseRichMod {
  import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
  import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponse

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponse
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.BasicCard
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.Table
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarousel
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponse
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseOrderMod.OrderUpdate
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestion
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponse[typings.actionsDashOnDashGoogle.distCommonMod.JsonObject]
    - typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2RichResponseItem
  */
  type RichResponseItem = _RichResponseItem | HtmlResponse[JsonObject] | String
}
