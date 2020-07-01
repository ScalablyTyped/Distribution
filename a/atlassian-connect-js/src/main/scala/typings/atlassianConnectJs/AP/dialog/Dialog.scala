package typings.atlassianConnectJs.AP.dialog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dialog extends js.Object {
  def on(name: String, callback: js.Function0[Unit]): Unit
}

object Dialog {
  @scala.inline
  def apply(on: (String, js.Function0[Unit]) => Unit): Dialog = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[Dialog]
  }
}

