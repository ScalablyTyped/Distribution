package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the graphic presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
trait GraphicObjectShape
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.GraphicObjectShape
     with Shape

object GraphicObjectShape {
  @scala.inline
  def apply(
    GraphicObjectShape: typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.GraphicObjectShape = null,
    Shape: Shape = null
  ): GraphicObjectShape = {
    val __obj = js.Dynamic.literal()
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, GraphicObjectShape)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Shape)
    __obj.asInstanceOf[GraphicObjectShape]
  }
}

