package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLCSSRule extends StObject {
  
  @JSName("MSHTML.IHTMLCSSRule_typekey")
  var MSHTMLDotIHTMLCSSRule_typekey: IHTMLCSSRule = js.native
  
  var cssText: String = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val `type`: Double = js.native
}
object IHTMLCSSRule {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLCSSRule_typekey: IHTMLCSSRule,
    cssText: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): IHTMLCSSRule = {
    val __obj = js.Dynamic.literal(cssText = cssText.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLCSSRule_typekey")(MSHTMLDotIHTMLCSSRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLCSSRule]
  }
  
  @scala.inline
  implicit class IHTMLCSSRuleMutableBuilder[Self <: IHTMLCSSRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLCSSRule_typekey(value: IHTMLCSSRule): Self = StObject.set(x, "MSHTML.IHTMLCSSRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
