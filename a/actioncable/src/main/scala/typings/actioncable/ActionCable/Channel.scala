package typings.actioncable.ActionCable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def perform(action: String, data: js.Object): Unit
  def send(data: js.Any): Boolean
  def unsubscribe(): Unit
}

object Channel {
  @scala.inline
  def apply(perform: (String, js.Object) => Unit, send: js.Any => Boolean, unsubscribe: () => Unit): Channel = {
    val __obj = js.Dynamic.literal(perform = js.Any.fromFunction2(perform), send = js.Any.fromFunction1(send), unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Channel]
  }
}

