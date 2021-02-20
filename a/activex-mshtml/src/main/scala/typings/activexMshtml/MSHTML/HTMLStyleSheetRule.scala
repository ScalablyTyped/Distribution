package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLStyleSheetRule extends StObject {
  
  @JSName("MSHTML.HTMLStyleSheetRule_typekey")
  var MSHTMLDotHTMLStyleSheetRule_typekey: HTMLStyleSheetRule = js.native
  
  val constructor: js.Any = js.native
  
  var cssText: String = js.native
  
  var ie9_selectorText: String = js.native
  
  def msGetSpecificity(index: Double): Double = js.native
  
  val parentRule: IHTMLCSSRule = js.native
  
  val parentStyleSheet: IHTMLStyleSheet = js.native
  
  val readOnly: Boolean = js.native
  
  var selectorText: String = js.native
  
  val style: IHTMLRuleStyle = js.native
  
  val `type`: Double = js.native
}
object HTMLStyleSheetRule {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLStyleSheetRule_typekey: HTMLStyleSheetRule,
    constructor: js.Any,
    cssText: String,
    ie9_selectorText: String,
    msGetSpecificity: Double => Double,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    readOnly: Boolean,
    selectorText: String,
    style: IHTMLRuleStyle,
    `type`: Double
  ): HTMLStyleSheetRule = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], ie9_selectorText = ie9_selectorText.asInstanceOf[js.Any], msGetSpecificity = js.Any.fromFunction1(msGetSpecificity), parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], selectorText = selectorText.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLStyleSheetRule_typekey")(MSHTMLDotHTMLStyleSheetRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLStyleSheetRule]
  }
  
  @scala.inline
  implicit class HTMLStyleSheetRuleMutableBuilder[Self <: HTMLStyleSheetRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIe9_selectorText(value: String): Self = StObject.set(x, "ie9_selectorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLStyleSheetRule_typekey(value: HTMLStyleSheetRule): Self = StObject.set(x, "MSHTML.HTMLStyleSheetRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsGetSpecificity(value: Double => Double): Self = StObject.set(x, "msGetSpecificity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorText(value: String): Self = StObject.set(x, "selectorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
