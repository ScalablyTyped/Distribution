package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCSSRule extends StObject {
  
  @JSName("MSHTML.HTMLCSSRule_typekey")
  var MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule = js.native
  
  var cssText: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val `type`: Double = js.native
}
object HTMLCSSRule {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSRule_typekey: HTMLCSSRule,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLCSSRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSRule_typekey")(MSHTMLDotHTMLCSSRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSRule]
  }
  
  @scala.inline
  implicit class HTMLCSSRuleMutableBuilder[Self <: HTMLCSSRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLCSSRule_typekey(value: HTMLCSSRule): Self = StObject.set(x, "MSHTML.HTMLCSSRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
