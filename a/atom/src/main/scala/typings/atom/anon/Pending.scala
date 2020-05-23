package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pending extends js.Object {
  var pending: Boolean
}

object Pending {
  @scala.inline
  def apply(pending: Boolean): Pending = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pending]
  }
}

