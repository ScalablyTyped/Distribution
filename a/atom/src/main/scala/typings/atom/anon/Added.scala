package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Added extends js.Object {
  var added: Double
  var deleted: Double
}

object Added {
  @scala.inline
  def apply(added: Double, deleted: Double): Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Added]
  }
}

