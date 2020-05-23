package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLMSCSSKeyframeRule extends js.Object {
  @JSName("MSHTML.HTMLMSCSSKeyframeRule_typekey")
  var MSHTMLDotHTMLMSCSSKeyframeRule_typekey: HTMLMSCSSKeyframeRule
  var cssText: String
  var keyText: String
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val style: IHTMLRuleStyle
  val `type`: Double
}

object HTMLMSCSSKeyframeRule {
  @scala.inline
  def apply(
    MSHTMLDotHTMLMSCSSKeyframeRule_typekey: HTMLMSCSSKeyframeRule,
    cssText: String,
    keyText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLMSCSSKeyframeRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], keyText = keyText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLMSCSSKeyframeRule_typekey")(MSHTMLDotHTMLMSCSSKeyframeRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLMSCSSKeyframeRule]
  }
}

