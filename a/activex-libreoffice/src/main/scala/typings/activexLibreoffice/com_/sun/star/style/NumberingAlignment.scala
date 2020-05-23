package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specify the alignment of a numbering level. */
trait NumberingAlignment extends js.Object {
  /** set the alignment from the numbering. Use the {@link com.sun.star.style.HorizontalAlignment} enum to change the alignment. */
  var Alignment: HorizontalAlignment
  /** the distance between the numbering symbol and text. */
  var Insertion: Double
  /** the minimum distance between the numbering symbol and the following text. */
  var TextMarginDistance: Double
  /** the distance between left margin and the numbering symbol. */
  var TextNumberingDistance: Double
}

object NumberingAlignment {
  @scala.inline
  def apply(
    Alignment: HorizontalAlignment,
    Insertion: Double,
    TextMarginDistance: Double,
    TextNumberingDistance: Double
  ): NumberingAlignment = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Insertion = Insertion.asInstanceOf[js.Any], TextMarginDistance = TextMarginDistance.asInstanceOf[js.Any], TextNumberingDistance = TextNumberingDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberingAlignment]
  }
}

