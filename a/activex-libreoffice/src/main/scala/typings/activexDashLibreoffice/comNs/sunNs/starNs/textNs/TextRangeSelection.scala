package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRangeSelection extends js.Object {
  var End: TextPosition
  var Start: TextPosition
}

object TextRangeSelection {
  @scala.inline
  def apply(End: TextPosition, Start: TextPosition): TextRangeSelection = {
    val __obj = js.Dynamic.literal(End = End, Start = Start)
  
    __obj.asInstanceOf[TextRangeSelection]
  }
}

