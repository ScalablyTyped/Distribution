package typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the necessary information for a three-dimensional cube.
  * @since OOo 2.0
  */
trait RealRectangle3D extends js.Object {
  var X1: Double
  /**
    * maximum X coordinate.
    *
    * Must be greater than X1 for non-empty cubes.
    *
    * .
    */
  var X2: Double
  var Y1: Double
  /**
    * maximum Y coordinate.
    *
    * Must be greater than Y1 for non-empty cubes.
    */
  var Y2: Double
  var Z1: Double
  /**
    * maximum Z coordinate.
    *
    * Must be greater than Z1 for non-empty cubes.
    */
  var Z2: Double
}

object RealRectangle3D {
  @scala.inline
  def apply(X1: Double, X2: Double, Y1: Double, Y2: Double, Z1: Double, Z2: Double): RealRectangle3D = {
    val __obj = js.Dynamic.literal(X1 = X1, X2 = X2, Y1 = Y1, Y2 = Y2, Z1 = Z1, Z2 = Z2)
  
    __obj.asInstanceOf[RealRectangle3D]
  }
}

