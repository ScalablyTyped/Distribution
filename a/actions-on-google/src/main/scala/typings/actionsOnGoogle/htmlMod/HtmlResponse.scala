package typings.actionsOnGoogle.htmlMod

import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/html", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
class HtmlResponse[TData /* <: JsonObject */] () extends GoogleActionsV2UiElementsHtmlResponse {
  def this(options: HtmlResponseOptions[TData]) = this()
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  
  /** @public */
  /** @public */
  var data: TData = js.native
  
  /** @public */
  /** @public */
  var suppress: Boolean = js.native
}
