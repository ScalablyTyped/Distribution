package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReloaded extends js.Object {
  var reloaded: Boolean
}

object AnonReloaded {
  @scala.inline
  def apply(reloaded: Boolean): AnonReloaded = {
    val __obj = js.Dynamic.literal(reloaded = reloaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReloaded]
  }
}

