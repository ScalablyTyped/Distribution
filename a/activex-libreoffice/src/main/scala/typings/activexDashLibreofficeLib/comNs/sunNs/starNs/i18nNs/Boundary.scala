package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains start and end position of a word.
  *
  * It is used in word break iterator and text conversion.
  * @see XBreakIterator
  * @see XTextConversion
  */
trait Boundary extends js.Object {
  var endPos: scala.Double
  var startPos: scala.Double
}

object Boundary {
  @scala.inline
  def apply(endPos: scala.Double, startPos: scala.Double): Boundary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endPos")(endPos)
    __obj.updateDynamic("startPos")(startPos)
    __obj.asInstanceOf[Boundary]
  }
}

