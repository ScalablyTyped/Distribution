package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLCSSNamespaceRule extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLCSSNamespaceRule_typekey")
  var MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule
  
  var cssText: String
  
  val namespaceURI: String
  
  val parentRule: IHTMLCSSRule
  
  val parentStyleSheet: IHTMLStyleSheet
  
  val prefix: String
  
  val `type`: Double
}
object HTMLCSSNamespaceRule {
  
  inline def apply(
    MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule,
    cssText: String,
    namespaceURI: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    prefix: String,
    `type`: Double
  ): HTMLCSSNamespaceRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSNamespaceRule_typekey")(MSHTMLDotHTMLCSSNamespaceRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSNamespaceRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLCSSNamespaceRule] (val x: Self) extends AnyVal {
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLCSSNamespaceRule_typekey(value: HTMLCSSNamespaceRule): Self = StObject.set(x, "MSHTML.HTMLCSSNamespaceRule_typekey", value.asInstanceOf[js.Any])
    
    inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    inline def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
