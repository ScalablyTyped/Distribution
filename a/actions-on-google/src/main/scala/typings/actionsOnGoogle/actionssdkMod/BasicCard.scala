package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.basicMod.BasicCardOptions
import typings.actionsOnGoogle.incomingMod._IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "BasicCard")
@js.native
class BasicCard protected ()
  extends typings.actionsOnGoogle.conversationMod.BasicCard
     with _IncomingMessage {
  /** @public */
  def this(options: BasicCardOptions) = this()
}

