package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextPosition extends js.Object {
  var Paragraph: Double
  var PositionInParagraph: Double
}

object TextPosition {
  @scala.inline
  def apply(Paragraph: Double, PositionInParagraph: Double): TextPosition = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any], PositionInParagraph = PositionInParagraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPosition]
  }
}

