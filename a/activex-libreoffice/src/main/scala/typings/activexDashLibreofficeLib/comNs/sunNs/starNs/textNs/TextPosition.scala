package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextPosition extends js.Object {
  var Paragraph: scala.Double
  var PositionInParagraph: scala.Double
}

object TextPosition {
  @scala.inline
  def apply(Paragraph: scala.Double, PositionInParagraph: scala.Double): TextPosition = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph, PositionInParagraph = PositionInParagraph)
  
    __obj.asInstanceOf[TextPosition]
  }
}

