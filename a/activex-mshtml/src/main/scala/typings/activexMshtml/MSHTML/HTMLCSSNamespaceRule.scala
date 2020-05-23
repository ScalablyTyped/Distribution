package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCSSNamespaceRule extends js.Object {
  @JSName("MSHTML.HTMLCSSNamespaceRule_typekey")
  var MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule
  var cssText: String
  val namespaceURI: String
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val prefix: String
  val `type`: Double
}

object HTMLCSSNamespaceRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule,
    cssText: String,
    namespaceURI: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    prefix: String,
    `type`: Double
  ): HTMLCSSNamespaceRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSNamespaceRule_typekey")(MSHTMLDotHTMLCSSNamespaceRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSNamespaceRule]
  }
}

