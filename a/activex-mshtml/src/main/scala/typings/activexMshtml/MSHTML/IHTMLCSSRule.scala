package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLCSSRule extends js.Object {
  @JSName("MSHTML.IHTMLCSSRule_typekey")
  var MSHTMLDotIHTMLCSSRule_typekey: IHTMLCSSRule
  var cssText: String
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val `type`: Double
}

object IHTMLCSSRule {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLCSSRule_typekey: IHTMLCSSRule,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): IHTMLCSSRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLCSSRule_typekey")(MSHTMLDotIHTMLCSSRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLCSSRule]
  }
}

