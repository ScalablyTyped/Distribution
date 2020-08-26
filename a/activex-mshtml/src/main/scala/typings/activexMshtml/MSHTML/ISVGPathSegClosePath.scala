package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGPathSegClosePath extends js.Object {
  @JSName("MSHTML.ISVGPathSegClosePath_typekey")
  var MSHTMLDotISVGPathSegClosePath_typekey: ISVGPathSegClosePath = js.native
}

object ISVGPathSegClosePath {
  @scala.inline
  def apply(MSHTMLDotISVGPathSegClosePath_typekey: ISVGPathSegClosePath): ISVGPathSegClosePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.ISVGPathSegClosePath_typekey")(MSHTMLDotISVGPathSegClosePath_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGPathSegClosePath]
  }
  @scala.inline
  implicit class ISVGPathSegClosePathOps[Self <: ISVGPathSegClosePath] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGPathSegClosePath_typekey(value: ISVGPathSegClosePath): Self = this.set("MSHTML.ISVGPathSegClosePath_typekey", value.asInstanceOf[js.Any])
  }
  
}

