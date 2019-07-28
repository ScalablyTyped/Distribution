package typings.androiduix.androidNs.osNs.HandlerNs

import typings.androiduix.androidNs.osNs.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def handleMessage(msg: Message): Boolean
}

object Callback {
  @scala.inline
  def apply(handleMessage: Message => Boolean): Callback = {
    val __obj = js.Dynamic.literal(handleMessage = js.Any.fromFunction1(handleMessage))
  
    __obj.asInstanceOf[Callback]
  }
}

