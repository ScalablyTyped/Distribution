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

