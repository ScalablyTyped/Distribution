package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLStyleSheetRule extends js.Object {
  @JSName("MSHTML.IHTMLStyleSheetRule_typekey")
  var MSHTMLDotIHTMLStyleSheetRule_typekey: IHTMLStyleSheetRule
  val readOnly: Boolean
  var selectorText: String
  val style: IHTMLRuleStyle
}

object IHTMLStyleSheetRule {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLStyleSheetRule_typekey: IHTMLStyleSheetRule,
    readOnly: Boolean,
    selectorText: String,
    style: IHTMLRuleStyle
  ): IHTMLStyleSheetRule = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLStyleSheetRule_typekey")(MSHTMLDotIHTMLStyleSheetRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleSheetRule]
  }
}

