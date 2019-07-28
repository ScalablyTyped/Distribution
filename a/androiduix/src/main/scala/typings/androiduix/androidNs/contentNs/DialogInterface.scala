package typings.androiduix.androidNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInterface extends js.Object {
  def cancel(): Unit
  def dismiss(): Unit
}

object DialogInterface {
  @scala.inline
  def apply(cancel: () => Unit, dismiss: () => Unit): DialogInterface = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dismiss = js.Any.fromFunction0(dismiss))
  
    __obj.asInstanceOf[DialogInterface]
  }
}

