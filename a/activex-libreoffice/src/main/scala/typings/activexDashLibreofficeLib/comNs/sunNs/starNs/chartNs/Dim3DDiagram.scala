package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a service for diagrams that support the capability to render themselves as three-dimensional diagrams as well as two-dimensional ones. */
trait Dim3DDiagram
  extends X3DDisplay
     with X3DDefaultSetter {
  /** If set to `TRUE` , the chart becomes a three-dimensional chart. Otherwise it is two-dimensional. */
  var Dim3D: scala.Boolean
  /** Perspective of 3D charts ( [0,100] ). */
  var Perspective: scala.Double
  /** Horizontal rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationHorizontal: scala.Double
  /** Vertical rotation of 3D charts in degrees ( ]-180,180] ). */
  var RotationVertical: scala.Double
}

