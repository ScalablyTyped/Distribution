package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLStyleSheetPage extends js.Object {
  
  @JSName("MSHTML.HTMLStyleSheetPage_typekey")
  var MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage = js.native
  
  val constructor: js.Any = js.native
  
  var cssText: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val pseudoClass: String = js.native
  
  val selector: String = js.native
  
  var selectorText: String = js.native
  
  val style: IHTMLRuleStyle = js.native
  
  val `type`: Double = js.native
}
object HTMLStyleSheetPage {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleSheetPage_typekey: HTMLStyleSheetPage,
    constructor: js.Any,
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
  implicit class HTMLStyleSheetPageOps[Self <: HTMLStyleSheetPage] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLStyleSheetPage_typekey(value: HTMLStyleSheetPage): Self = this.set("MSHTML.HTMLStyleSheetPage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssText(value: String): Self = this.set("cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = this.set("parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = this.set("parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoClass(value: String): Self = this.set("pseudoClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorText(value: String): Self = this.set("selectorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
