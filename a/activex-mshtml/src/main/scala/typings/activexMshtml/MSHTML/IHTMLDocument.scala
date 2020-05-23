package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLDocument extends js.Object {
  @JSName("MSHTML.IHTMLDocument_typekey")
  var MSHTMLDotIHTMLDocument_typekey: IHTMLDocument
  val Script: js.Any
}

object IHTMLDocument {
  @scala.inline
  def apply(MSHTMLDotIHTMLDocument_typekey: IHTMLDocument, Script: js.Any): IHTMLDocument = {
    val __obj = js.Dynamic.literal(Script = Script.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocument_typekey")(MSHTMLDotIHTMLDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocument]
  }
}

