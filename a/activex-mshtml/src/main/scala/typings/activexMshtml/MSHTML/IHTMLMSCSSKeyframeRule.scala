package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLMSCSSKeyframeRule extends js.Object {
  @JSName("MSHTML.IHTMLMSCSSKeyframeRule_typekey")
  var MSHTMLDotIHTMLMSCSSKeyframeRule_typekey: IHTMLMSCSSKeyframeRule
  var keyText: String
  val style: IHTMLRuleStyle
}

object IHTMLMSCSSKeyframeRule {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLMSCSSKeyframeRule_typekey: IHTMLMSCSSKeyframeRule,
    keyText: String,
    style: IHTMLRuleStyle
  ): IHTMLMSCSSKeyframeRule = {
    val __obj = js.Dynamic.literal(keyText = keyText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLMSCSSKeyframeRule_typekey")(MSHTMLDotIHTMLMSCSSKeyframeRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLMSCSSKeyframeRule]
  }
}

