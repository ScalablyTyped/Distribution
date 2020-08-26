package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLAudioElement extends js.Object {
  @JSName("MSHTML.IHTMLAudioElement_typekey")
  var MSHTMLDotIHTMLAudioElement_typekey: IHTMLAudioElement = js.native
}

object IHTMLAudioElement {
  @scala.inline
  def apply(MSHTMLDotIHTMLAudioElement_typekey: IHTMLAudioElement): IHTMLAudioElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MSHTML.IHTMLAudioElement_typekey")(MSHTMLDotIHTMLAudioElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLAudioElement]
  }
  @scala.inline
  implicit class IHTMLAudioElementOps[Self <: IHTMLAudioElement] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLAudioElement_typekey(value: IHTMLAudioElement): Self = this.set("MSHTML.IHTMLAudioElement_typekey", value.asInstanceOf[js.Any])
  }
  
}

