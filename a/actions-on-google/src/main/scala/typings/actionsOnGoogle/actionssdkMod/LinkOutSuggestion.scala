package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.incomingMod._IncomingMessage
import typings.actionsOnGoogle.linkoutMod.LinkOutSuggestionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "LinkOutSuggestion")
@js.native
class LinkOutSuggestion protected ()
  extends typings.actionsOnGoogle.conversationMod.LinkOutSuggestion
     with _IncomingMessage {
  /**
    * @param options LinkOutSuggestion options
    * @public
    */
  def this(options: LinkOutSuggestionOptions) = this()
}

