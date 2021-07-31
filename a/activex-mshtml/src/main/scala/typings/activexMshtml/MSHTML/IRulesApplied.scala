package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRulesApplied extends StObject {
  
  @JSName("MSHTML.IRulesApplied_typekey")
  var MSHTMLDotIRulesApplied_typekey: IRulesApplied
  
  def appliedRules(index: Double): IHTMLStyleSheetRule
  @JSName("appliedRules")
  val appliedRules_Original: IHTMLStyleSheetRulesAppliedCollection
  
  val element: IHTMLElement
  
  def hasInheritableProperty(): Boolean
  
  val inlineStyles: IHTMLStyle
  
  def propertyIsInheritable(name: String): Boolean
  
  def propertyIsInline(name: String): Boolean
}
object IRulesApplied {
  
  @scala.inline
  def apply(
    MSHTMLDotIRulesApplied_typekey: IRulesApplied,
    appliedRules: IHTMLStyleSheetRulesAppliedCollection,
    element: IHTMLElement,
    hasInheritableProperty: () => Boolean,
    inlineStyles: IHTMLStyle,
    propertyIsInheritable: String => Boolean,
    propertyIsInline: String => Boolean
  ): IRulesApplied = {
    val __obj = js.Dynamic.literal(appliedRules = appliedRules.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hasInheritableProperty = js.Any.fromFunction0(hasInheritableProperty), inlineStyles = inlineStyles.asInstanceOf[js.Any], propertyIsInheritable = js.Any.fromFunction1(propertyIsInheritable), propertyIsInline = js.Any.fromFunction1(propertyIsInline))
    __obj.updateDynamic("MSHTML.IRulesApplied_typekey")(MSHTMLDotIRulesApplied_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRulesApplied]
  }
  
  @scala.inline
  implicit class IRulesAppliedMutableBuilder[Self <: IRulesApplied] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedRules(value: IHTMLStyleSheetRulesAppliedCollection): Self = StObject.set(x, "appliedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IHTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasInheritableProperty(value: () => Boolean): Self = StObject.set(x, "hasInheritableProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInlineStyles(value: IHTMLStyle): Self = StObject.set(x, "inlineStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIRulesApplied_typekey(value: IRulesApplied): Self = StObject.set(x, "MSHTML.IRulesApplied_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyIsInheritable(value: String => Boolean): Self = StObject.set(x, "propertyIsInheritable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropertyIsInline(value: String => Boolean): Self = StObject.set(x, "propertyIsInline", js.Any.fromFunction1(value))
  }
}
