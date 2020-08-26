package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * an event has a source that causes an event to be fired and a trigger that defines under which condition an event should be raised and an offset if the
  * event should be raised a defined amount of time after the event is triggered.
  */
@js.native
trait ParagraphTarget extends js.Object {
  var Paragraph: Double = js.native
  var Shape: XShape = js.native
}

object ParagraphTarget {
  @scala.inline
  def apply(Paragraph: Double, Shape: XShape): ParagraphTarget = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphTarget]
  }
  @scala.inline
  implicit class ParagraphTargetOps[Self <: ParagraphTarget] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParagraph(value: Double): Self = this.set("Paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def setShape(value: XShape): Self = this.set("Shape", value.asInstanceOf[js.Any])
  }
  
}

