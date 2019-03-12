package typings
package actioncableLib.ActionCableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def perform(action: java.lang.String, data: js.Object): scala.Unit
  def send(data: js.Any): scala.Boolean
  def unsubscribe(): scala.Unit
}

object Channel {
  @scala.inline
  def apply(
    perform: (java.lang.String, js.Object) => scala.Unit,
    send: js.Any => scala.Boolean,
    unsubscribe: () => scala.Unit
  ): Channel = {
    val __obj = js.Dynamic.literal(perform = js.Any.fromFunction2(perform), send = js.Any.fromFunction1(send), unsubscribe = js.Any.fromFunction0(unsubscribe))
  
    __obj.asInstanceOf[Channel]
  }
}

