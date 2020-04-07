package typings.astring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrite extends js.Object {
  def write(s: String): Unit
}

object AnonWrite {
  @scala.inline
  def apply(write: String => Unit): AnonWrite = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[AnonWrite]
  }
}

