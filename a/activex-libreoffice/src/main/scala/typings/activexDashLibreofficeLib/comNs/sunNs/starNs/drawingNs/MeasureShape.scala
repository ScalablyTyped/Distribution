package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

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
  var EndPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** this point is the start of the measured distance */
  var StartPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
}

object MeasureShape {
  @scala.inline
  def apply(
    EndPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LineProperties: LineProperties = null,
    MeasureProperties: MeasureProperties = null,
    RotationDescriptor: RotationDescriptor = null,
    ShadowProperties: ShadowProperties = null,
    Shape: Shape = null,
    StartPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Text: Text = null
  ): MeasureShape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EndPosition")(EndPosition)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, LineProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, MeasureProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, RotationDescriptor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ShadowProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    __obj.updateDynamic("StartPosition")(StartPosition)
    js.Dynamic.global.Object.assign(__obj, Text)
    __obj.asInstanceOf[MeasureShape]
  }
}

