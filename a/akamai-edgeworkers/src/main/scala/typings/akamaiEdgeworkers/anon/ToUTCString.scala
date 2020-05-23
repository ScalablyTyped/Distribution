package typings.akamaiEdgeworkers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToUTCString extends js.Object {
  def toUTCString(): String
}

object ToUTCString {
  @scala.inline
  def apply(toUTCString: () => String): ToUTCString = {
    val __obj = js.Dynamic.literal(toUTCString = js.Any.fromFunction0(toUTCString))
    __obj.asInstanceOf[ToUTCString]
  }
}

