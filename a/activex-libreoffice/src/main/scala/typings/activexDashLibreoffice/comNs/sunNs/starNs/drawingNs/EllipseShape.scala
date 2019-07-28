package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

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
  var CircleEndAngle: Double
  /** This is the kind of circle. */
  var CircleKind: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.CircleKind
  /** If the kind specifies an open circle, this is the start angle. */
  var CircleStartAngle: Double
}

object EllipseShape {
  @scala.inline
  def apply(
    CircleEndAngle: Double,
    CircleKind: CircleKind,
    CircleStartAngle: Double,
    FillProperties: FillProperties = null,
    LineProperties: LineProperties = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Text: Text = null
  ): EllipseShape = {
    val __obj = js.Dynamic.literal(CircleEndAngle = CircleEndAngle, CircleKind = CircleKind, CircleStartAngle = CircleStartAngle)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, FillProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[EllipseShape]
  }
}

