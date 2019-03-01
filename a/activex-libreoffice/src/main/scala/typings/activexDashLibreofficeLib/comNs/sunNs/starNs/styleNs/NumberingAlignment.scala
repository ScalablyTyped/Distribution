package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specify the alignment of a numbering level. */
trait NumberingAlignment extends js.Object {
  /** set the alignment from the numbering. Use the {@link com.sun.star.style.HorizontalAlignment} enum to change the alignment. */
  var Alignment: HorizontalAlignment
  /** the distance between the numbering symbol and text. */
  var Insertion: scala.Double
  /** the minimum distance between the numbering symbol and the following text. */
  var TextMarginDistance: scala.Double
  /** the distance between left margin and the numbering symbol. */
  var TextNumberingDistance: scala.Double
}

object NumberingAlignment {
  @scala.inline
  def apply(
    Alignment: HorizontalAlignment,
    Insertion: scala.Double,
    TextMarginDistance: scala.Double,
    TextNumberingDistance: scala.Double
  ): NumberingAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Alignment")(Alignment)
    __obj.updateDynamic("Insertion")(Insertion)
    __obj.updateDynamic("TextMarginDistance")(TextMarginDistance)
    __obj.updateDynamic("TextNumberingDistance")(TextNumberingDistance)
    __obj.asInstanceOf[NumberingAlignment]
  }
}

