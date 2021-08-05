package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLCSSRule extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLCSSRule_typekey")
  var MSHTMLDotIHTMLCSSRule_typekey: IHTMLCSSRule
  
  var cssText: String
  
  val parentRule: IHTMLCSSRule
  
  val parentStyleSheet: IHTMLStyleSheet
  
  val `type`: Double
}
object IHTMLCSSRule {
  
  inline def apply(
    MSHTMLDotIHTMLCSSRule_typekey: IHTMLCSSRule,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): IHTMLCSSRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLCSSRule_typekey")(MSHTMLDotIHTMLCSSRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLCSSRule]
  }
  
  extension [Self <: IHTMLCSSRule](x: Self) {
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLCSSRule_typekey(value: IHTMLCSSRule): Self = StObject.set(x, "MSHTML.IHTMLCSSRule_typekey", value.asInstanceOf[js.Any])
    
    inline def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
