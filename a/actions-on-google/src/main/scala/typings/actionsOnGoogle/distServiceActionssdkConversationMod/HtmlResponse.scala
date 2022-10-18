package typings.actionsOnGoogle.distServiceActionssdkConversationMod

import typings.actionsOnGoogle.distCommonMod.JsonObject
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
open class HtmlResponse[TData /* <: JsonObject */] ()
  extends typings.actionsOnGoogle.distServiceActionssdkConversationResponseMod.HtmlResponse[TData] {
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  def this(options: HtmlResponseOptions[TData]) = this()
}
