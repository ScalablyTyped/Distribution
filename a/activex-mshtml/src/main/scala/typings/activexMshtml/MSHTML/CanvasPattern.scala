package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPattern extends js.Object {
  @JSName("MSHTML.CanvasPattern_typekey")
  var MSHTMLDotCanvasPattern_typekey: CanvasPattern = js.native
}

object CanvasPattern {
  @scala.inline
  def apply(MSHTMLDotCanvasPattern_typekey: CanvasPattern): CanvasPattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.CanvasPattern_typekey")(MSHTMLDotCanvasPattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPattern]
  }
  @scala.inline
  implicit class CanvasPatternOps[Self <: CanvasPattern] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotCanvasPattern_typekey(value: CanvasPattern): Self = this.set("MSHTML.CanvasPattern_typekey", value.asInstanceOf[js.Any])
  }
  
}

