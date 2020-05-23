package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCSSImportRule extends js.Object {
  @JSName("MSHTML.HTMLCSSImportRule_typekey")
  var MSHTMLDotHTMLCSSImportRule_typekey: HTMLCSSImportRule
  var cssText: String
  val href: String
  var media: js.Any
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val styleSheet: IHTMLStyleSheet
  val `type`: Double
}

object HTMLCSSImportRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSImportRule_typekey: HTMLCSSImportRule,
    cssText: String,
    href: String,
    media: js.Any,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    styleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLCSSImportRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], styleSheet = styleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSImportRule_typekey")(MSHTMLDotHTMLCSSImportRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSImportRule]
  }
}

