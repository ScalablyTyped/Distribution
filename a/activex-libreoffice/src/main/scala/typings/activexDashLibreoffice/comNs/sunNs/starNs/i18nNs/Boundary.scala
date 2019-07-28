package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

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
  var endPos: Double
  var startPos: Double
}

object Boundary {
  @scala.inline
  def apply(endPos: Double, startPos: Double): Boundary = {
    val __obj = js.Dynamic.literal(endPos = endPos, startPos = startPos)
  
    __obj.asInstanceOf[Boundary]
  }
}

