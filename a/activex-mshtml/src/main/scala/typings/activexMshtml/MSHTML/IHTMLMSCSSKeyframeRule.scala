package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLMSCSSKeyframeRule extends js.Object {
  
  @JSName("MSHTML.IHTMLMSCSSKeyframeRule_typekey")
  var MSHTMLDotIHTMLMSCSSKeyframeRule_typekey: IHTMLMSCSSKeyframeRule = js.native
  
  var keyText: String = js.native
  
  val style: IHTMLRuleStyle = js.native
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
  implicit class IHTMLMSCSSKeyframeRuleOps[Self <: IHTMLMSCSSKeyframeRule] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIHTMLMSCSSKeyframeRule_typekey(value: IHTMLMSCSSKeyframeRule): Self = this.set("MSHTML.IHTMLMSCSSKeyframeRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyText(value: String): Self = this.set("keyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
