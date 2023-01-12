package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLStyleFontFace extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLStyleFontFace_typekey")
  var MSHTMLDotHTMLStyleFontFace_typekey: HTMLStyleFontFace
  
  var cssText: String
  
  var fontsrc: String
  
  val parentRule: IHTMLCSSRule
  
  val parentStyleSheet: IHTMLStyleSheet
  
  val style: IHTMLRuleStyle
  
  val `type`: Double
}
object HTMLStyleFontFace {
  
  inline def apply(
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLStyleFontFace] (val x: Self) extends AnyVal {
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setFontsrc(value: String): Self = StObject.set(x, "fontsrc", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLStyleFontFace_typekey(value: HTMLStyleFontFace): Self = StObject.set(x, "MSHTML.HTMLStyleFontFace_typekey", value.asInstanceOf[js.Any])
    
    inline def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: IHTMLRuleStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
