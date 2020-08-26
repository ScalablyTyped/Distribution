package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLStyleSheetPage extends js.Object {
  @JSName("MSHTML.IHTMLStyleSheetPage_typekey")
  var MSHTMLDotIHTMLStyleSheetPage_typekey: IHTMLStyleSheetPage = js.native
  val pseudoClass: String = js.native
  val selector: String = js.native
}

object IHTMLStyleSheetPage {
  @scala.inline
  def apply(MSHTMLDotIHTMLStyleSheetPage_typekey: IHTMLStyleSheetPage, pseudoClass: String, selector: String): IHTMLStyleSheetPage = {
    val __obj = js.Dynamic.literal(pseudoClass = pseudoClass.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLStyleSheetPage_typekey")(MSHTMLDotIHTMLStyleSheetPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleSheetPage]
  }
  @scala.inline
  implicit class IHTMLStyleSheetPageOps[Self <: IHTMLStyleSheetPage] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLStyleSheetPage_typekey(value: IHTMLStyleSheetPage): Self = this.set("MSHTML.IHTMLStyleSheetPage_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPseudoClass(value: String): Self = this.set("pseudoClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
  
}

