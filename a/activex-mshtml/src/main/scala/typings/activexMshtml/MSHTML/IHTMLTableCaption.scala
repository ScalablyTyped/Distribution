package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLTableCaption extends js.Object {
  @JSName("MSHTML.IHTMLTableCaption_typekey")
  var MSHTMLDotIHTMLTableCaption_typekey: IHTMLTableCaption
  var align: String
  var vAlign: String
}

object IHTMLTableCaption {
  @scala.inline
  def apply(MSHTMLDotIHTMLTableCaption_typekey: IHTMLTableCaption, align: String, vAlign: String): IHTMLTableCaption = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], vAlign = vAlign.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLTableCaption_typekey")(MSHTMLDotIHTMLTableCaption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLTableCaption]
  }
}

