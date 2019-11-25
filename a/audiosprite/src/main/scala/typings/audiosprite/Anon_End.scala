package typings.audiosprite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: Double
  var loop: Boolean
  var start: Double
}

object Anon_End {
  @scala.inline
  def apply(end: Double, loop: Boolean, start: Double): Anon_End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_End]
  }
}

