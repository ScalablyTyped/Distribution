package typings.aceBuilds.mod.Ace

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
  var backwards: Boolean = js.native
  var caseSensitive: Boolean = js.native
  var needle: String | RegExp = js.native
  var preserveCase: Boolean = js.native
  var preventScroll: Boolean = js.native
  var range: Range = js.native
  var regExp: RegExp = js.native
  var skipCurrent: Boolean = js.native
  var start: Range = js.native
  var wholeWord: String = js.native
  var wrap: Boolean = js.native
}

object SearchOptions {
  @scala.inline
  def apply(
    backwards: Boolean,
    caseSensitive: Boolean,
    needle: String | RegExp,
    preserveCase: Boolean,
    preventScroll: Boolean,
    range: Range,
    regExp: RegExp,
    skipCurrent: Boolean,
    start: Range,
    wholeWord: String,
    wrap: Boolean
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], needle = needle.asInstanceOf[js.Any], preserveCase = preserveCase.asInstanceOf[js.Any], preventScroll = preventScroll.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], skipCurrent = skipCurrent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], wholeWord = wholeWord.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
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
    def setBackwards(value: Boolean): Self = this.set("backwards", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedle(value: String | RegExp): Self = this.set("needle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveCase(value: Boolean): Self = this.set("preserveCase", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreventScroll(value: Boolean): Self = this.set("preventScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegExp(value: RegExp): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipCurrent(value: Boolean): Self = this.set("skipCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Range): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setWholeWord(value: String): Self = this.set("wholeWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
  }
  
}

