package typings.ascii2mathml.mod

import typings.ascii2mathml.ascii2mathmlStrings.`inline`
import typings.ascii2mathml.ascii2mathmlStrings.block
import typings.ascii2mathml.ascii2mathmlStrings.ltr
import typings.ascii2mathml.ascii2mathmlStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var annotate: js.UndefOr[Boolean] = js.native
  var bare: js.UndefOr[Boolean] = js.native
  var colSep: js.UndefOr[String] = js.native
  var decimalMark: js.UndefOr[String] = js.native
  var dir: js.UndefOr[ltr | rtl] = js.native
  var display: js.UndefOr[`inline` | block] = js.native
  var rowSep: js.UndefOr[String] = js.native
  var standalone: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAnnotate(value: Boolean): Self = this.set("annotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotate: Self = this.set("annotate", js.undefined)
    @scala.inline
    def setBare(value: Boolean): Self = this.set("bare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBare: Self = this.set("bare", js.undefined)
    @scala.inline
    def setColSep(value: String): Self = this.set("colSep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColSep: Self = this.set("colSep", js.undefined)
    @scala.inline
    def setDecimalMark(value: String): Self = this.set("decimalMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalMark: Self = this.set("decimalMark", js.undefined)
    @scala.inline
    def setDir(value: ltr | rtl): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisplay(value: `inline` | block): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setRowSep(value: String): Self = this.set("rowSep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowSep: Self = this.set("rowSep", js.undefined)
    @scala.inline
    def setStandalone(value: Boolean): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
  }
  
}

