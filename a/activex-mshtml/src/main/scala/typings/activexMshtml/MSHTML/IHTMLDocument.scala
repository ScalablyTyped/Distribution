package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLDocument extends js.Object {
  @JSName("MSHTML.IHTMLDocument_typekey")
  var MSHTMLDotIHTMLDocument_typekey: IHTMLDocument = js.native
  val Script: js.Any = js.native
}

object IHTMLDocument {
  @scala.inline
  def apply(MSHTMLDotIHTMLDocument_typekey: IHTMLDocument, Script: js.Any): IHTMLDocument = {
    val __obj = js.Dynamic.literal(Script = Script.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocument_typekey")(MSHTMLDotIHTMLDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocument]
  }
  @scala.inline
  implicit class IHTMLDocumentOps[Self <: IHTMLDocument] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLDocument_typekey(value: IHTMLDocument): Self = this.set("MSHTML.IHTMLDocument_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: js.Any): Self = this.set("Script", value.asInstanceOf[js.Any])
  }
  
}

