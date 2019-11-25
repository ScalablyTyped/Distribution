package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: Double
  var deleted: Double
}

object Anon_Added {
  @scala.inline
  def apply(added: Double, deleted: Double): Anon_Added = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Added]
  }
}

