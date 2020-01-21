package typings.aceDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: js.Any
  var right: js.Any
}

object AnonLeft {
  @scala.inline
  def apply(left: js.Any, right: js.Any): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLeft]
  }
}

