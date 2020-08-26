package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.com_.sun.star.drawing.TextShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is implemented by the date and time presentation shape.
  *
  * {@link Presentation} shapes can be used in a presentation page layouts and their position and size is by default set by the presentation shapes on the
  * {@link com.sun.star.drawing.MasterPage} .
  */
@js.native
trait DateTimeShape
  extends TextShape
     with Shape

object DateTimeShape {
  @scala.inline
  def apply(Shape: Shape, TextShape: TextShape): DateTimeShape = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Shape)
    js.Dynamic.global.Object.assign(__obj, TextShape)
    __obj.asInstanceOf[DateTimeShape]
  }
}

