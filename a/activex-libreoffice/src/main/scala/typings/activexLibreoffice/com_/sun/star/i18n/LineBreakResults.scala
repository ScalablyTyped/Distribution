package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.com_.sun.star.linguistic2.XHyphenatedWord
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
    val __obj = js.Dynamic.literal(breakIndex = breakIndex.asInstanceOf[js.Any], breakType = breakType.asInstanceOf[js.Any], rHyphenatedWord = rHyphenatedWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakResults]
  }
}

