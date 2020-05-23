package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait First extends js.Object {
  var first: Double
  var last: Double
}

object First {
  @scala.inline
  def apply(first: Double, last: Double): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
}

