package typings.activexMshtml.global.MSHTML

import typings.activexMshtml.MSHTML.IHTMLStyleSheetRulesAppliedCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.RulesApplied")
@js.native
class RulesApplied protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.RulesApplied {
  
  /* CompleteClass */
  @JSName("MSHTML.RulesApplied_typekey")
  var MSHTMLDotRulesApplied_typekey: typings.activexMshtml.MSHTML.RulesApplied = js.native
  
  /* CompleteClass */
  override def appliedRules(index: Double): typings.activexMshtml.MSHTML.IHTMLStyleSheetRule = js.native
  /* CompleteClass */
  @JSName("appliedRules")
  override val appliedRules_Original: IHTMLStyleSheetRulesAppliedCollection = js.native
  
  /* CompleteClass */
  override val element: typings.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override def hasInheritableProperty(): Boolean = js.native
  
  /* CompleteClass */
  override val inlineStyles: typings.activexMshtml.MSHTML.IHTMLStyle = js.native
  
  /* CompleteClass */
  override def propertyIsInheritable(name: String): Boolean = js.native
  
  /* CompleteClass */
  override def propertyIsInline(name: String): Boolean = js.native
}
