package typings
package audiospriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: scala.Double
  var loop: scala.Boolean
  var start: scala.Double
}

object Anon_End {
  @scala.inline
  def apply(end: scala.Double, loop: scala.Boolean, start: scala.Double): Anon_End = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loop")(loop)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[Anon_End]
  }
}

