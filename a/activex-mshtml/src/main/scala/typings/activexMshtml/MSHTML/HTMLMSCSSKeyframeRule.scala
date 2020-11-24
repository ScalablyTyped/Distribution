package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLMSCSSKeyframeRule extends js.Object {
  
  @JSName("MSHTML.HTMLMSCSSKeyframeRule_typekey")
  var MSHTMLDotHTMLMSCSSKeyframeRule_typekey: HTMLMSCSSKeyframeRule = js.native
  
  var cssText: String = js.native
  
  var keyText: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val style: IHTMLRuleStyle = js.native
  
  val `type`: Double = js.native
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
  implicit class HTMLMSCSSKeyframeRuleOps[Self <: HTMLMSCSSKeyframeRule] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLMSCSSKeyframeRule_typekey(value: HTMLMSCSSKeyframeRule): Self = this.set("MSHTML.HTMLMSCSSKeyframeRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssText(value: String): Self = this.set("cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyText(value: String): Self = this.set("keyText", value.asInstanceOf[js.Any])
    
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
