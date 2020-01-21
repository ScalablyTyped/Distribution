package typings.akamaiEdgeworkers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonToUTCString extends js.Object {
  def toUTCString(): String
}

object AnonToUTCString {
  @scala.inline
  def apply(toUTCString: () => String): AnonToUTCString = {
    val __obj = js.Dynamic.literal(toUTCString = js.Any.fromFunction0(toUTCString))
  
    __obj.asInstanceOf[AnonToUTCString]
  }
}

