package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure defines a two-dimensional point
  *
  * This structure contains x and y real-valued coordinates of a two-dimensional point.
  * @since OOo 2.0
  */
trait RealPoint2D extends js.Object {
  var X: scala.Double
  var Y: scala.Double
}

object RealPoint2D {
  @scala.inline
  def apply(X: scala.Double, Y: scala.Double): RealPoint2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[RealPoint2D]
  }
}

