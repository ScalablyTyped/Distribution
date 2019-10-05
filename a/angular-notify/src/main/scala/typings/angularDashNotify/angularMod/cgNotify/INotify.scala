package typings.angularDashNotify.angularMod.cgNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotify extends js.Object {
  /**
    * The message to show.
    */
  var message: String
  /**
    * Close this open notifications.
    */
  def close(): Unit
}

object INotify {
  @scala.inline
  def apply(close: () => Unit, message: String): INotify = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), message = message)
  
    __obj.asInstanceOf[INotify]
  }
}

