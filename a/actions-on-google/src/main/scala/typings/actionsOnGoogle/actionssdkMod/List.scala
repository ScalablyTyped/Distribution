package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.incomingMod._IncomingMessage
import typings.actionsOnGoogle.listMod.ListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "List")
@js.native
class List protected ()
  extends typings.actionsOnGoogle.conversationMod.List
     with _IncomingMessage {
  /**
    * @param options List options
    * @public
    */
  def this(options: ListOptions) = this()
}

