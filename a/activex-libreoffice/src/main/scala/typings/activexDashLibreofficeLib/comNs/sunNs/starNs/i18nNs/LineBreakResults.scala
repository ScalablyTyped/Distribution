package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results of method {@link XBreakIterator.getLineBreak()} . */
trait LineBreakResults extends js.Object {
  var breakIndex: scala.Double
  var breakType: scala.Double
  var rHyphenatedWord: activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.XHyphenatedWord
}

object LineBreakResults {
  @scala.inline
  def apply(
    breakIndex: scala.Double,
    breakType: scala.Double,
    rHyphenatedWord: activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns.XHyphenatedWord
  ): LineBreakResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("breakIndex")(breakIndex)
    __obj.updateDynamic("breakType")(breakType)
    __obj.updateDynamic("rHyphenatedWord")(rHyphenatedWord)
    __obj.asInstanceOf[LineBreakResults]
  }
}

