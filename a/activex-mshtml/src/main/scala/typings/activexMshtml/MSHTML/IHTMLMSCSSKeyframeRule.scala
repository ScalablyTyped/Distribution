package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLMSCSSKeyframeRule extends StObject {
  
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
  
  @scala.inline
  implicit class IHTMLMSCSSKeyframeRuleMutableBuilder[Self <: IHTMLMSCSSKeyframeRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyText(value: String): Self = StObject.set(x, "keyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLMSCSSKeyframeRule_typekey(value: IHTMLMSCSSKeyframeRule): Self = StObject.set(x, "MSHTML.IHTMLMSCSSKeyframeRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
