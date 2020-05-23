package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLStyleSheetRule extends js.Object {
  @JSName("MSHTML.HTMLStyleSheetRule_typekey")
  var MSHTMLDotHTMLStyleSheetRule_typekey: HTMLStyleSheetRule
  val constructor: js.Any
  var cssText: String
  var ie9_selectorText: String
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val readOnly: Boolean
  var selectorText: String
  val style: IHTMLRuleStyle
  val `type`: Double
  def msGetSpecificity(index: Double): Double
}

object HTMLStyleSheetRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleSheetRule_typekey: HTMLStyleSheetRule,
    constructor: js.Any,
    cssText: String,
    ie9_selectorText: String,
    msGetSpecificity: Double => Double,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    readOnly: Boolean,
    selectorText: String,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLStyleSheetRule = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], ie9_selectorText = ie9_selectorText.asInstanceOf[js.Any], msGetSpecificity = js.Any.fromFunction1(msGetSpecificity), parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLStyleSheetRule_typekey")(MSHTMLDotHTMLStyleSheetRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleSheetRule]
  }
}

