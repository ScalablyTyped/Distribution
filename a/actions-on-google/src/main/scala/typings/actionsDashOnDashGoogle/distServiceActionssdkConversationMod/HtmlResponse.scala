package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationMod

import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
class HtmlResponse[TData /* <: JsonObject */] ()
  extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMod.HtmlResponse[TData] {
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  def this(options: HtmlResponseOptions[TData]) = this()
}

