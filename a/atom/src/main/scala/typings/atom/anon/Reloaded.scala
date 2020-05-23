package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reloaded extends js.Object {
  var reloaded: Boolean
}

object Reloaded {
  @scala.inline
  def apply(reloaded: Boolean): Reloaded = {
    val __obj = js.Dynamic.literal(reloaded = reloaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reloaded]
  }
}

