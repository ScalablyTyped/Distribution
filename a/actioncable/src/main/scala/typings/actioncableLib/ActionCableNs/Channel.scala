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
    perform: js.Function2[java.lang.String, js.Object, scala.Unit],
    send: js.Function1[js.Any, scala.Boolean],
    unsubscribe: js.Function0[scala.Unit]
  ): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("perform")(perform)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[Channel]
  }
}

