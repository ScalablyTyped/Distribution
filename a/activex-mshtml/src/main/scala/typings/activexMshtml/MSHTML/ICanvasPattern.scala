package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasPattern extends js.Object {
  @JSName("MSHTML.ICanvasPattern_typekey")
  var MSHTMLDotICanvasPattern_typekey: ICanvasPattern = js.native
}

object ICanvasPattern {
  @scala.inline
  def apply(MSHTMLDotICanvasPattern_typekey: ICanvasPattern): ICanvasPattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.ICanvasPattern_typekey")(MSHTMLDotICanvasPattern_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasPattern]
  }
  @scala.inline
  implicit class ICanvasPatternOps[Self <: ICanvasPattern] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotICanvasPattern_typekey(value: ICanvasPattern): Self = this.set("MSHTML.ICanvasPattern_typekey", value.asInstanceOf[js.Any])
  }
  
}

