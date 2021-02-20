package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCSSImportRule extends StObject {
  
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
  implicit class HTMLCSSImportRuleMutableBuilder[Self <: HTMLCSSImportRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLCSSImportRule_typekey(value: HTMLCSSImportRule): Self = StObject.set(x, "MSHTML.HTMLCSSImportRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: js.Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "styleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
