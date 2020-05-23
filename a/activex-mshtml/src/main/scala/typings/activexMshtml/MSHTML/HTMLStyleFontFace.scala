package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLStyleFontFace extends js.Object {
  @JSName("MSHTML.HTMLStyleFontFace_typekey")
  var MSHTMLDotHTMLStyleFontFace_typekey: HTMLStyleFontFace
  var cssText: String
  var fontsrc: String
  val parentRule: IHTMLCSSRule
  val parentStyleSheet: IHTMLStyleSheet
  val style: IHTMLRuleStyle
  val `type`: Double
}

object HTMLStyleFontFace {
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleFontFace_typekey: HTMLStyleFontFace,
    cssText: String,
    fontsrc: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLStyleFontFace = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], fontsrc = fontsrc.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLStyleFontFace_typekey")(MSHTMLDotHTMLStyleFontFace_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleFontFace]
  }
}

