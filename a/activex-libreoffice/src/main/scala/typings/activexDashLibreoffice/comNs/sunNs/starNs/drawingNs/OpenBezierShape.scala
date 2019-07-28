package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for an open Bezier shape. */
trait OpenBezierShape
  extends Text
     with Shape
     with LineProperties
     with PolyPolygonBezierDescriptor
     with ShadowProperties
     with RotationDescriptor

object OpenBezierShape {
  @scala.inline
  def apply(
    LineProperties: LineProperties = null,
    PolyPolygonBezierDescriptor: PolyPolygonBezierDescriptor = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Text: Text = null
  ): OpenBezierShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, PolyPolygonBezierDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[OpenBezierShape]
  }
}

