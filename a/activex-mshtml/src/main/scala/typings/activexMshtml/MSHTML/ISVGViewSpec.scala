package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGViewSpec extends js.Object {
  @JSName("MSHTML.ISVGViewSpec_typekey")
  var MSHTMLDotISVGViewSpec_typekey: ISVGViewSpec = js.native
}

object ISVGViewSpec {
  @scala.inline
  def apply(MSHTMLDotISVGViewSpec_typekey: ISVGViewSpec): ISVGViewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.ISVGViewSpec_typekey")(MSHTMLDotISVGViewSpec_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGViewSpec]
  }
  @scala.inline
  implicit class ISVGViewSpecOps[Self <: ISVGViewSpec] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGViewSpec_typekey(value: ISVGViewSpec): Self = this.set("MSHTML.ISVGViewSpec_typekey", value.asInstanceOf[js.Any])
  }
  
}

