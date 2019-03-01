package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the necessary information for a three-dimensional cube.
  * @since OOo 2.0
  */
trait RealRectangle3D extends js.Object {
  var X1: scala.Double
  /**
    * maximum X coordinate.
    *
    * Must be greater than X1 for non-empty cubes.
    *
    * .
    */
  var X2: scala.Double
  var Y1: scala.Double
  /**
    * maximum Y coordinate.
    *
    * Must be greater than Y1 for non-empty cubes.
    */
  var Y2: scala.Double
  var Z1: scala.Double
  /**
    * maximum Z coordinate.
    *
    * Must be greater than Z1 for non-empty cubes.
    */
  var Z2: scala.Double
}

object RealRectangle3D {
  @scala.inline
  def apply(
    X1: scala.Double,
    X2: scala.Double,
    Y1: scala.Double,
    Y2: scala.Double,
    Z1: scala.Double,
    Z2: scala.Double
  ): RealRectangle3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X1")(X1)
    __obj.updateDynamic("X2")(X2)
    __obj.updateDynamic("Y1")(Y1)
    __obj.updateDynamic("Y2")(Y2)
    __obj.updateDynamic("Z1")(Z1)
    __obj.updateDynamic("Z2")(Z2)
    __obj.asInstanceOf[RealRectangle3D]
  }
}

