package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for an ellipse or circle shape. */
trait EllipseShape
  extends Text
     with Shape
     with LineProperties
     with FillProperties
     with ShadowProperties
     with RotationDescriptor {
  /** If the kind specifies an open circle, this is the end angle. */
  var CircleEndAngle: scala.Double
  /** This is the kind of circle. */
  var CircleKind: CircleKind
  /** If the kind specifies an open circle, this is the start angle. */
  var CircleStartAngle: scala.Double
}

