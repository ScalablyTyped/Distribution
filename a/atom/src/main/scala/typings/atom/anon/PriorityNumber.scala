package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityNumber extends js.Object {
  var priority: Double
}

object PriorityNumber {
  @scala.inline
  def apply(priority: Double): PriorityNumber = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityNumber]
  }
}

