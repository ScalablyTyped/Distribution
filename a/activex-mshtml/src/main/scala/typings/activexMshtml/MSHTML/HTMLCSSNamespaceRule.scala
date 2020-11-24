package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCSSNamespaceRule extends js.Object {
  
  @JSName("MSHTML.HTMLCSSNamespaceRule_typekey")
  var MSHTMLDotHTMLCSSNamespaceRule_typekey: HTMLCSSNamespaceRule = js.native
  
  var cssText: String = js.native
  
  val namespaceURI: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val prefix: String = js.native
  
  val `type`: Double = js.native
}
object HTMLCSSNamespaceRule {
  
  @scala.inline
  def apply(
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
  implicit class HTMLCSSNamespaceRuleOps[Self <: HTMLCSSNamespaceRule] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLCSSNamespaceRule_typekey(value: HTMLCSSNamespaceRule): Self = this.set("MSHTML.HTMLCSSNamespaceRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssText(value: String): Self = this.set("cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = this.set("parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = this.set("parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
