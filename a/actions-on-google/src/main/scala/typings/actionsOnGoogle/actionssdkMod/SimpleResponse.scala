package typings.actionsOnGoogle.actionssdkMod

import typings.actionsOnGoogle.incomingMod._IncomingMessage
import typings.actionsOnGoogle.simpleMod.SimpleResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "SimpleResponse")
@js.native
class SimpleResponse protected ()
  extends typings.actionsOnGoogle.conversationMod.SimpleResponse
     with _IncomingMessage {
  def this(options: String) = this()
  /**
    * @param options SimpleResponse options
    * @public
    */
  def this(options: SimpleResponseOptions) = this()
}

