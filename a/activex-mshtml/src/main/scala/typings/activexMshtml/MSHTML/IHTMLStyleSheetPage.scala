package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLStyleSheetPage extends js.Object {
  @JSName("MSHTML.IHTMLStyleSheetPage_typekey")
  var MSHTMLDotIHTMLStyleSheetPage_typekey: IHTMLStyleSheetPage
  val pseudoClass: String
  val selector: String
}

object IHTMLStyleSheetPage {
  @scala.inline
  def apply(MSHTMLDotIHTMLStyleSheetPage_typekey: IHTMLStyleSheetPage, pseudoClass: String, selector: String): IHTMLStyleSheetPage = {
    val __obj = js.Dynamic.literal(pseudoClass = pseudoClass.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLStyleSheetPage_typekey")(MSHTMLDotIHTMLStyleSheetPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleSheetPage]
  }
}

