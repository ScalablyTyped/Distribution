package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHide extends js.Object {
  var hide: Double
  var show: Double
}

object AnonHide {
  @scala.inline
  def apply(hide: Double, show: Double): AnonHide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHide]
  }
}

