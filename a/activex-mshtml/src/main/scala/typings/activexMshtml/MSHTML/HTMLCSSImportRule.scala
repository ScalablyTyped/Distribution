package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCSSImportRule extends js.Object {
  
  @JSName("MSHTML.HTMLCSSImportRule_typekey")
  var MSHTMLDotHTMLCSSImportRule_typekey: HTMLCSSImportRule = js.native
  
  var cssText: String = js.native
  
  val href: String = js.native
  
  var media: js.Any = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val styleSheet: IHTMLStyleSheet = js.native
  
  val `type`: Double = js.native
}
object HTMLCSSImportRule {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSImportRule_typekey: HTMLCSSImportRule,
    cssText: String,
    href: String,
    media: js.Any,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    styleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLCSSImportRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], styleSheet = styleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSImportRule_typekey")(MSHTMLDotHTMLCSSImportRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSImportRule]
  }
  
  @scala.inline
  implicit class HTMLCSSImportRuleOps[Self <: HTMLCSSImportRule] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLCSSImportRule_typekey(value: HTMLCSSImportRule): Self = this.set("MSHTML.HTMLCSSImportRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssText(value: String): Self = this.set("cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: js.Any): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = this.set("parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = this.set("parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheet(value: IHTMLStyleSheet): Self = this.set("styleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
