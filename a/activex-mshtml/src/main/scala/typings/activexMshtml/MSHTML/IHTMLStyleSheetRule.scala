package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLStyleSheetRule extends js.Object {
  
  @JSName("MSHTML.IHTMLStyleSheetRule_typekey")
  var MSHTMLDotIHTMLStyleSheetRule_typekey: IHTMLStyleSheetRule = js.native
  
  val readOnly: Boolean = js.native
  
  var selectorText: String = js.native
  
  val style: IHTMLRuleStyle = js.native
}
object IHTMLStyleSheetRule {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLStyleSheetRule_typekey: IHTMLStyleSheetRule,
    readOnly: Boolean,
    selectorText: String,
    style: IHTMLRuleStyle
  ): IHTMLStyleSheetRule = {
    val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLStyleSheetRule_typekey")(MSHTMLDotIHTMLStyleSheetRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleSheetRule]
  }
  
  @scala.inline
  implicit class IHTMLStyleSheetRuleOps[Self <: IHTMLStyleSheetRule] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIHTMLStyleSheetRule_typekey(value: IHTMLStyleSheetRule): Self = this.set("MSHTML.IHTMLStyleSheetRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorText(value: String): Self = this.set("selectorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
