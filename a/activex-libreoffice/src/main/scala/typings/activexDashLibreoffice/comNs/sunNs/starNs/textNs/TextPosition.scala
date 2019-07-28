package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

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
    val __obj = js.Dynamic.literal(Paragraph = Paragraph, PositionInParagraph = PositionInParagraph)
  
    __obj.asInstanceOf[TextPosition]
  }
}

