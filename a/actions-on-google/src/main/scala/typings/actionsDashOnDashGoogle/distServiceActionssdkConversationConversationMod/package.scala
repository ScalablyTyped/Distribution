package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServiceActionssdkConversationConversationMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.actionsDashOnDashGoogle.distCommonMod.JsonObject
  import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperMod.Helper
  import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponse
  import typings.std.Error

  type ExceptionHandler[TUserStorage, TConversation /* <: Conversation[TUserStorage] */] = js.Function2[/* conv */ TConversation, /* error */ Error, js.Promise[js.Any] | js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMod.RichResponse
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseItem
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMod.Image
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMod.Suggestions
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMod.MediaObject
    - typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperMod.Helper[
  typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.Intent, 
  typings.actionsDashOnDashGoogle.distCommonMod.JsonObject]
  */
  type Response = _Response | (Helper[Intent, JsonObject]) | HtmlResponse[JsonObject] | String
  type Traversed = StringDictionary[Boolean]
}
