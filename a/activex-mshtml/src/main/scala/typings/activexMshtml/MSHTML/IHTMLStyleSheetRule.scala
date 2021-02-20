package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLStyleSheetRule extends StObject {
  
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
  implicit class IHTMLStyleSheetRuleMutableBuilder[Self <: IHTMLStyleSheetRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotIHTMLStyleSheetRule_typekey(value: IHTMLStyleSheetRule): Self = StObject.set(x, "MSHTML.IHTMLStyleSheetRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorText(value: String): Self = StObject.set(x, "selectorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: IHTMLRuleStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
