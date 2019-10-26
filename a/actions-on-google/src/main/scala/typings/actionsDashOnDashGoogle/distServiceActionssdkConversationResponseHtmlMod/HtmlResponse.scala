package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod

import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/html", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
class HtmlResponse[TData /* <: JsonObject */] () extends GoogleActionsV2UiElementsHtmlResponse {
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  def this(options: HtmlResponseOptions[TData]) = this()
  /** @public */
  /** @public */
  var data: TData = js.native
  /** @public */
  /** @public */
  var suppress: Boolean = js.native
}

