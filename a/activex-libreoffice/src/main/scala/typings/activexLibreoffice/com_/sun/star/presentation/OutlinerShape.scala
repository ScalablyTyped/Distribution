package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.com_.sun.star.drawing.TextShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the outline presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
trait OutlinerShape
  extends TextShape
     with Shape

object OutlinerShape {
  @scala.inline
  def apply(Shape: Shape, TextShape: TextShape): OutlinerShape = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, TextShape)
    __obj.asInstanceOf[OutlinerShape]
  }
}

