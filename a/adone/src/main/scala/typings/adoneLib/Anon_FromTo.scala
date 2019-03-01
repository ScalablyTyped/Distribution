package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromTo extends js.Object {
  var from: scala.Double
  var to: scala.Double
}

object Anon_FromTo {
  @scala.inline
  def apply(from: scala.Double, to: scala.Double): Anon_FromTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Anon_FromTo]
  }
}

