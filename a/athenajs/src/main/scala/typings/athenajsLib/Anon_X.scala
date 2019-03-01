package typings
package athenajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: scala.Double
  var x2: scala.Double
  var y: scala.Double
  var y2: scala.Double
}

object Anon_X {
  @scala.inline
  def apply(x: scala.Double, x2: scala.Double, y: scala.Double, y2: scala.Double): Anon_X = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("x2")(x2)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("y2")(y2)
    __obj.asInstanceOf[Anon_X]
  }
}

