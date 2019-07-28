package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a dimensioning shape. */
trait MeasureShape
  extends Text
     with Shape
     with MeasureProperties
     with LineProperties
     with ShadowProperties
     with RotationDescriptor {
  /** this point is the end of the measured distance */
  var EndPosition: Point
  /** this point is the start of the measured distance */
  var StartPosition: Point
}

object MeasureShape {
  @scala.inline
  def apply(
    EndPosition: Point,
    LineProperties: LineProperties = null,
    MeasureProperties: MeasureProperties = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    StartPosition: Point,
    Text: Text = null
  ): MeasureShape = {
    val __obj = js.Dynamic.literal(EndPosition = EndPosition, StartPosition = StartPosition)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, MeasureProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[MeasureShape]
  }
}

