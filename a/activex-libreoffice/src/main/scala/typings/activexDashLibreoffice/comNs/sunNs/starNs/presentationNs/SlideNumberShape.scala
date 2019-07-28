package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the slide number presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
trait SlideNumberShape
  extends TextShape
     with Shape

object SlideNumberShape {
  @scala.inline
  def apply(Shape: Shape = null, TextShape: TextShape = null): SlideNumberShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, TextShape)
    __obj.asInstanceOf[SlideNumberShape]
  }
}

