package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCSSRule extends js.Object {
  @JSName("MSHTML.HTMLCSSRule_typekey")
  var MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule
  var cssText: String
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val `type`: Double
}

object HTMLCSSRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLCSSRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSRule_typekey")(MSHTMLDotHTMLCSSRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSRule]
  }
}

