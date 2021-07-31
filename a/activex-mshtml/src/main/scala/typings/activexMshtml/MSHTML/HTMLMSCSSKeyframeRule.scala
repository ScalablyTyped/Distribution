package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLMSCSSKeyframeRule extends StObject {
  
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
  
  @scala.inline
  implicit class HTMLMSCSSKeyframeRuleMutableBuilder[Self <: HTMLMSCSSKeyframeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyText(value: String): Self = StObject.set(x, "keyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLMSCSSKeyframeRule_typekey(value: HTMLMSCSSKeyframeRule): Self = StObject.set(x, "MSHTML.HTMLMSCSSKeyframeRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
