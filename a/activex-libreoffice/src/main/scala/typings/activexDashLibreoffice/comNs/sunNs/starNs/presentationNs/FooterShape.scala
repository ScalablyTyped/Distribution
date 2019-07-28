package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.TextShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the footer presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
trait FooterShape
  extends TextShape
     with Shape

object FooterShape {
  @scala.inline
  def apply(Shape: Shape = null, TextShape: TextShape = null): FooterShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, TextShape)
    __obj.asInstanceOf[FooterShape]
  }
}

