package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReversed extends js.Object {
  var reversed: Boolean
}

object AnonReversed {
  @scala.inline
  def apply(reversed: Boolean): AnonReversed = {
    val __obj = js.Dynamic.literal(reversed = reversed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReversed]
  }
}

