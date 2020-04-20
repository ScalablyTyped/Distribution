package typings.audiosprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: Double
  var loop: Boolean
  var start: Double
}

object AnonEnd {
  @scala.inline
  def apply(end: Double, loop: Boolean, start: Double): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

