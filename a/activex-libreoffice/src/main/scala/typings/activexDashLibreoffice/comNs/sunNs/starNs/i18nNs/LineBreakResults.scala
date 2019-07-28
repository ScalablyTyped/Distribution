package typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.linguistic2Ns.XHyphenatedWord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results of method {@link XBreakIterator.getLineBreak()} . */
trait LineBreakResults extends js.Object {
  var breakIndex: Double
  var breakType: Double
  var rHyphenatedWord: XHyphenatedWord
}

object LineBreakResults {
  @scala.inline
  def apply(breakIndex: Double, breakType: Double, rHyphenatedWord: XHyphenatedWord): LineBreakResults = {
    val __obj = js.Dynamic.literal(breakIndex = breakIndex, breakType = breakType, rHyphenatedWord = rHyphenatedWord)
  
    __obj.asInstanceOf[LineBreakResults]
  }
}

