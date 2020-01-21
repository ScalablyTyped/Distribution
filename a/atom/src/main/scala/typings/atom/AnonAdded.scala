package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdded extends js.Object {
  var added: Double
  var deleted: Double
}

object AnonAdded {
  @scala.inline
  def apply(added: Double, deleted: Double): AnonAdded = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdded]
  }
}

