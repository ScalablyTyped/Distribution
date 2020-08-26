package typings.activexLibreoffice.com_.sun.star.i18n

import typings.activexLibreoffice.com_.sun.star.linguistic2.XHyphenatedWord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results of method {@link XBreakIterator.getLineBreak()} . */
@js.native
trait LineBreakResults extends js.Object {
  var breakIndex: Double = js.native
  var breakType: Double = js.native
  var rHyphenatedWord: XHyphenatedWord = js.native
}

object LineBreakResults {
  @scala.inline
  def apply(breakIndex: Double, breakType: Double, rHyphenatedWord: XHyphenatedWord): LineBreakResults = {
    val __obj = js.Dynamic.literal(breakIndex = breakIndex.asInstanceOf[js.Any], breakType = breakType.asInstanceOf[js.Any], rHyphenatedWord = rHyphenatedWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineBreakResults]
  }
  @scala.inline
  implicit class LineBreakResultsOps[Self <: LineBreakResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreakIndex(value: Double): Self = this.set("breakIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakType(value: Double): Self = this.set("breakType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRHyphenatedWord(value: XHyphenatedWord): Self = this.set("rHyphenatedWord", value.asInstanceOf[js.Any])
  }
  
}

