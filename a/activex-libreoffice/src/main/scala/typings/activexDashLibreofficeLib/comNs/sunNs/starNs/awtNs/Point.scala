package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 2-dimensional point using the Cartesian coordinate system. */
trait Point extends js.Object {
  /** specifies the x-coordinate. */
  var X: scala.Double
  /** specifies the y-coordinate. */
  var Y: scala.Double
}

object Point {
  @scala.inline
  def apply(X: scala.Double, Y: scala.Double): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Point]
  }
}

