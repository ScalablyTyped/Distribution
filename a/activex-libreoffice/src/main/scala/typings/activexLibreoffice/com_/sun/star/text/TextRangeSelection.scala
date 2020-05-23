package typings.activexLibreoffice.com_.sun.star.text

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
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRangeSelection]
  }
}

