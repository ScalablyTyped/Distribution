package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLStyleSheetPage extends js.Object {
  @JSName("MSHTML.HTMLStyleSheetPage_typekey")
  var MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage
  val constructor: js.Any
  var cssText: String
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val pseudoClass: String
  val selector: String
  var selectorText: String
  val style: IHTMLRuleStyle
  val `type`: Double
}

object HTMLStyleSheetPage {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage,
    constructor: js.Any,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    pseudoClass: String,
    selector: String,
    selectorText: String,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLStyleSheetPage = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], pseudoClass = pseudoClass.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLStyleSheetPage_typekey")(MSHTMLDotHTMLStyleSheetPage_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleSheetPage]
  }
}

