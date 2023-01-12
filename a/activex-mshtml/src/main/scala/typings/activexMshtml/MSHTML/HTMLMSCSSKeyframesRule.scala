package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLMSCSSKeyframesRule extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLMSCSSKeyframesRule_typekey")
  var MSHTMLDotHTMLMSCSSKeyframesRule_typekey: HTMLMSCSSKeyframesRule
  
  def appendRule(bstrRule: String): Unit
  
  def cssRules(index: Double): IHTMLStyleSheetRule
  @JSName("cssRules")
  val cssRules_Original: IHTMLStyleSheetRulesCollection
  
  var cssText: String
  
  def deleteRule(bstrKey: String): Unit
  
  def findRule(bstrKey: String): IHTMLMSCSSKeyframeRule
  
  var name: String
  
  val parentRule: IHTMLCSSRule
  
  val parentStyleSheet: IHTMLStyleSheet
  
  val `type`: Double
}
object HTMLMSCSSKeyframesRule {
  
  inline def apply(
    MSHTMLDotHTMLMSCSSKeyframesRule_typekey: HTMLMSCSSKeyframesRule,
    appendRule: String => Unit,
    cssRules: IHTMLStyleSheetRulesCollection,
    cssText: String,
    deleteRule: String => Unit,
    findRule: String => IHTMLMSCSSKeyframeRule,
    name: String,
    parentRule: IHTMLCSSRule,
    parentStyleSheet: IHTMLStyleSheet,
    `type`: Double
  ): HTMLMSCSSKeyframesRule = {
    val __obj = js.Dynamic.literal(appendRule = js.Any.fromFunction1(appendRule), cssRules = cssRules.asInstanceOf[js.Any], cssText = cssText.asInstanceOf[js.Any], deleteRule = js.Any.fromFunction1(deleteRule), findRule = js.Any.fromFunction1(findRule), name = name.asInstanceOf[js.Any], parentRule = parentRule.asInstanceOf[js.Any], parentStyleSheet = parentStyleSheet.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLMSCSSKeyframesRule_typekey")(MSHTMLDotHTMLMSCSSKeyframesRule_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLMSCSSKeyframesRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTMLMSCSSKeyframesRule] (val x: Self) extends AnyVal {
    
    inline def setAppendRule(value: String => Unit): Self = StObject.set(x, "appendRule", js.Any.fromFunction1(value))
    
    inline def setCssRules(value: IHTMLStyleSheetRulesCollection): Self = StObject.set(x, "cssRules", value.asInstanceOf[js.Any])
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setDeleteRule(value: String => Unit): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1(value))
    
    inline def setFindRule(value: String => IHTMLMSCSSKeyframeRule): Self = StObject.set(x, "findRule", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotHTMLMSCSSKeyframesRule_typekey(value: HTMLMSCSSKeyframesRule): Self = StObject.set(x, "MSHTML.HTMLMSCSSKeyframesRule_typekey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentRule(value: IHTMLCSSRule): Self = StObject.set(x, "parentRule", value.asInstanceOf[js.Any])
    
    inline def setParentStyleSheet(value: IHTMLStyleSheet): Self = StObject.set(x, "parentStyleSheet", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
