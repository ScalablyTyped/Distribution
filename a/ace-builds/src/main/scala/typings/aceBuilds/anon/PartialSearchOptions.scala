package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ace-builds.ace-builds.Ace.SearchOptions> */
@js.native
trait PartialSearchOptions extends js.Object {
  var backwards: js.UndefOr[Boolean] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var needle: js.UndefOr[String | RegExp] = js.native
  var preserveCase: js.UndefOr[Boolean] = js.native
  var preventScroll: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[Range] = js.native
  var regExp: js.UndefOr[RegExp] = js.native
  var skipCurrent: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[Range] = js.native
  var wholeWord: js.UndefOr[String] = js.native
  var wrap: js.UndefOr[Boolean] = js.native
}

object PartialSearchOptions {
  @scala.inline
  def apply(): PartialSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSearchOptions]
  }
  @scala.inline
  implicit class PartialSearchOptionsOps[Self <: PartialSearchOptions] (val x: Self) extends AnyVal {
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
    def deleteBackwards: Self = this.set("backwards", js.undefined)
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setNeedle(value: String | RegExp): Self = this.set("needle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedle: Self = this.set("needle", js.undefined)
    @scala.inline
    def setPreserveCase(value: Boolean): Self = this.set("preserveCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveCase: Self = this.set("preserveCase", js.undefined)
    @scala.inline
    def setPreventScroll(value: Boolean): Self = this.set("preventScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventScroll: Self = this.set("preventScroll", js.undefined)
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setRegExp(value: RegExp): Self = this.set("regExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
    @scala.inline
    def setSkipCurrent(value: Boolean): Self = this.set("skipCurrent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipCurrent: Self = this.set("skipCurrent", js.undefined)
    @scala.inline
    def setStart(value: Range): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setWholeWord(value: String): Self = this.set("wholeWord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWholeWord: Self = this.set("wholeWord", js.undefined)
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
  
}

