package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAhead extends js.Object {
  var ahead: Double
  var behind: Double
}

object AnonAhead {
  @scala.inline
  def apply(ahead: Double, behind: Double): AnonAhead = {
    val __obj = js.Dynamic.literal(ahead = ahead.asInstanceOf[js.Any], behind = behind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAhead]
  }
}

