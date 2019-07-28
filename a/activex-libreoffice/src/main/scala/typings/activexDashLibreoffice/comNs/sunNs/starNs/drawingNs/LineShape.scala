package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is for a simple {@link Shape} with lines. */
trait LineShape
  extends Text
     with Shape
     with LineProperties
     with PolyPolygonDescriptor
     with ShadowProperties
     with RotationDescriptor

object LineShape {
  @scala.inline
  def apply(
    LineProperties: LineProperties = null,
    PolyPolygonDescriptor: PolyPolygonDescriptor = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Text: Text = null
  ): LineShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, PolyPolygonDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[LineShape]
  }
}

