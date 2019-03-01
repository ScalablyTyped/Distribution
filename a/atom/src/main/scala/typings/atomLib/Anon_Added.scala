package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Added extends js.Object {
  var added: scala.Double
  var deleted: scala.Double
}

object Anon_Added {
  @scala.inline
  def apply(added: scala.Double, deleted: scala.Double): Anon_Added = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("added")(added)
    __obj.updateDynamic("deleted")(deleted)
    __obj.asInstanceOf[Anon_Added]
  }
}

