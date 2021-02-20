package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLStyleFontFace extends StObject {
  
  @JSName("MSHTML.HTMLStyleFontFace_typekey")
  var MSHTMLDotHTMLStyleFontFace_typekey: HTMLStyleFontFace = js.native
  
  var cssText: String = js.native
  
  var fontsrc: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val style: IHTMLRuleStyle = js.native
  
  val `type`: Double = js.native
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
  
  @scala.inline
  implicit class HTMLStyleFontFaceMutableBuilder[Self <: HTMLStyleFontFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsrc(value: String): Self = StObject.set(x, "fontsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLStyleFontFace_typekey(value: HTMLStyleFontFace): Self = StObject.set(x, "MSHTML.HTMLStyleFontFace_typekey", value.asInstanceOf[js.Any])
    
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
