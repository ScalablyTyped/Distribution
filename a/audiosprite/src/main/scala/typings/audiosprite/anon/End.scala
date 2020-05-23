package typings.audiosprite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: Double
  var loop: Boolean
  var start: Double
}

object End {
  @scala.inline
  def apply(end: Double, loop: Boolean, start: Double): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

