package typings.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object conversationConversationMod {
  
  type ExceptionHandler[TUserStorage, TConversation /* <: typings.actionsOnGoogle.conversationConversationMod.Conversation[TUserStorage] */] = js.Function2[/* conv */ TConversation, /* error */ typings.std.Error, js.Promise[js.Any] | js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.actionsOnGoogle.responseMod.RichResponse
    - typings.actionsOnGoogle.richMod.RichResponseItem
    - typings.actionsOnGoogle.responseMod.Image
    - typings.actionsOnGoogle.responseMod.Suggestions
    - typings.actionsOnGoogle.responseMod.MediaObject
    - typings.actionsOnGoogle.helperMod.Helper[
  typings.actionsOnGoogle.conversationConversationMod.Intent, 
  typings.actionsOnGoogle.commonMod.JsonObject]
  */
  type Response = typings.actionsOnGoogle.conversationConversationMod._Response | (typings.actionsOnGoogle.helperMod.Helper[
    typings.actionsOnGoogle.conversationConversationMod.Intent, 
    typings.actionsOnGoogle.commonMod.JsonObject
  ]) | typings.actionsOnGoogle.htmlMod.HtmlResponse[typings.actionsOnGoogle.commonMod.JsonObject] | java.lang.String
  
  type Traversed = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
