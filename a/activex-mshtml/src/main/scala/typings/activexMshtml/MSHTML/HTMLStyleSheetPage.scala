package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLStyleSheetPage extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLStyleSheetPage_typekey")
  var MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage
  
  val constructor: Any
  
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
  
  inline def apply(
    MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage,
    constructor: Any,
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLStyleSheetPage] (val x: Self) extends AnyVal {
    
    inline def setConstructor(value: Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLStyleSheetPage_typekey(value: HTMLStyleSheetPage): Self = StObject.set(x, "MSHTML.HTMLStyleSheetPage_typekey", value.asInstanceOf[js.Any])
    
    inline def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setPseudoClass(value: String): Self = StObject.set(x, "pseudoClass", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorText(value: String): Self = StObject.set(x, "selectorText", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: IHTMLRuleStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
