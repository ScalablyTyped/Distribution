package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesApplied extends StObject {
  
  /* private */ @JSName("MSHTML.RulesApplied_typekey")
  var MSHTMLDotRulesApplied_typekey: RulesApplied
  
  def appliedRules(index: Double): IHTMLStyleSheetRule
  @JSName("appliedRules")
  val appliedRules_Original: IHTMLStyleSheetRulesAppliedCollection
  
  val element: IHTMLElement
  
  def hasInheritableProperty(): Boolean
  
  val inlineStyles: IHTMLStyle
  
  def propertyIsInheritable(name: String): Boolean
  
  def propertyIsInline(name: String): Boolean
}
object RulesApplied {
  
  inline def apply(
    MSHTMLDotRulesApplied_typekey: RulesApplied,
    appliedRules: IHTMLStyleSheetRulesAppliedCollection,
    element: IHTMLElement,
    hasInheritableProperty: () => Boolean,
    inlineStyles: IHTMLStyle,
    propertyIsInheritable: String => Boolean,
    propertyIsInline: String => Boolean
  ): RulesApplied = {
    val __obj = js.Dynamic.literal(appliedRules = appliedRules.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hasInheritableProperty = js.Any.fromFunction0(hasInheritableProperty), inlineStyles = inlineStyles.asInstanceOf[js.Any], propertyIsInheritable = js.Any.fromFunction1(propertyIsInheritable), propertyIsInline = js.Any.fromFunction1(propertyIsInline))
    __obj.updateDynamic("MSHTML.RulesApplied_typekey")(MSHTMLDotRulesApplied_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesApplied]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RulesApplied] (val x: Self) extends AnyVal {
    
    inline def setAppliedRules(value: IHTMLStyleSheetRulesAppliedCollection): Self = StObject.set(x, "appliedRules", value.asInstanceOf[js.Any])
    
    inline def setElement(value: IHTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHasInheritableProperty(value: () => Boolean): Self = StObject.set(x, "hasInheritableProperty", js.Any.fromFunction0(value))
    
    inline def setInlineStyles(value: IHTMLStyle): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotRulesApplied_typekey(value: RulesApplied): Self = StObject.set(x, "MSHTML.RulesApplied_typekey", value.asInstanceOf[js.Any])
    
    inline def setPropertyIsInheritable(value: String => Boolean): Self = StObject.set(x, "propertyIsInheritable", js.Any.fromFunction1(value))
    
    inline def setPropertyIsInline(value: String => Boolean): Self = StObject.set(x, "propertyIsInline", js.Any.fromFunction1(value))
  }
}
