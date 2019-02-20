package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure specifies an arbitrary elliptical arc.
  *
  * This structure contains all parameters necessary to specify arbitrary elliptical arcs. The parameters are modeled closely after the [SVG]{@link
  * url="http://www.w3c.org"} specification.
  *
  * As with the parameters below, there are mostly four different ellipses arcs (two different ellipses, on which four different arcs connect start and
  * end point) which satisfy the given set of constrains. Thus, there are two flags indicating which one of those ellipses should be taken.
  * @since OOo 2.0
  */
trait EllipticalArc extends js.Object {
  var EndPosition: RealPoint2D
  /** If `TRUE` , and there's a choice, take the arc that goes clock-wise from start to end point. */
  var IsClockwiseSweep: scala.Boolean
  /** If `TRUE` , and there's a choice, take the longer one of two arcs connecting start and end point. */
  var IsLargeArc: scala.Boolean
  var RadiusX: scala.Double
  var RadiusY: scala.Double
  var StartPosition: RealPoint2D
  /** Rotation angle of the x axis of the ellipse relative to the x axis of the reference coordinate system. */
  var XAxisRotation: scala.Double
}

