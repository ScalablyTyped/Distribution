package typings.atom

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var target: String | Node
}

object AnonTarget {
  @scala.inline
  def apply(target: String | Node): AnonTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

