package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextPosition extends js.Object {
  var Paragraph: Double = js.native
  var PositionInParagraph: Double = js.native
}

object TextPosition {
  @scala.inline
  def apply(Paragraph: Double, PositionInParagraph: Double): TextPosition = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any], PositionInParagraph = PositionInParagraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPosition]
  }
  @scala.inline
  implicit class TextPositionOps[Self <: TextPosition] (val x: Self) extends AnyVal {
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
    def setPositionInParagraph(value: Double): Self = this.set("PositionInParagraph", value.asInstanceOf[js.Any])
  }
  
}

