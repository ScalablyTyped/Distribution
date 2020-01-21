package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  def close(): Unit
}

object AnonClose {
  @scala.inline
  def apply(close: () => Unit): AnonClose = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[AnonClose]
  }
}

