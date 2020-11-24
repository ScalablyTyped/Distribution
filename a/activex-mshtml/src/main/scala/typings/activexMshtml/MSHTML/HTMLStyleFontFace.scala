package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLStyleFontFace extends js.Object {
  
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
  implicit class HTMLStyleFontFaceOps[Self <: HTMLStyleFontFace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMSHTMLDotHTMLStyleFontFace_typekey(value: HTMLStyleFontFace): Self = this.set("MSHTML.HTMLStyleFontFace_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssText(value: String): Self = this.set("cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsrc(value: String): Self = this.set("fontsrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = this.set("parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = this.set("parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
