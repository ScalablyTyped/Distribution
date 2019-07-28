package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is for a polygon shape.
  *
  * A poly-polygon has 2 or more straight lines, with the first and last point connected by a straight line.
  */
trait PolyPolygonShape
  extends Text
     with Shape
     with LineProperties
     with FillProperties
     with PolyPolygonDescriptor
     with ShadowProperties
     with RotationDescriptor

object PolyPolygonShape {
  @scala.inline
  def apply(
    FillProperties: FillProperties = null,
    LineProperties: LineProperties = null,
    PolyPolygonDescriptor: PolyPolygonDescriptor = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    Text: Text = null
  ): PolyPolygonShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, FillProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, PolyPolygonDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[PolyPolygonShape]
  }
}

