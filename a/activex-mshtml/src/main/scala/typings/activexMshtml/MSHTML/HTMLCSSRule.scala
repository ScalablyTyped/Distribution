package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLCSSRule extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLCSSRule_typekey")
  var MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule
  
  var cssText: String
  
  val parentRule: IHTMLCSSRule
  
  val parentStyleSheet: IHTMLStyleSheet
  
  val `type`: Double
}
object HTMLCSSRule {
  
  inline def apply(
    MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLCSSRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSRule_typekey")(MSHTMLDotHTMLCSSRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLCSSRule] (val x: Self) extends AnyVal {
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLCSSRule_typekey(value: HTMLCSSRule): Self = StObject.set(x, "MSHTML.HTMLCSSRule_typekey", value.asInstanceOf[js.Any])
    
    inline def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
