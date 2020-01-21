package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IRulesApplied")
@js.native
class IRulesApplied protected () extends js.Object {
  @JSName("MSHTML.IRulesApplied_typekey")
  var MSHTMLDotIRulesApplied_typekey: IRulesApplied = js.native
  @JSName("appliedRules")
  val appliedRules_Original: IHTMLStyleSheetRulesAppliedCollection = js.native
  val element: IHTMLElement = js.native
  val inlineStyles: IHTMLStyle = js.native
  def appliedRules(index: Double): IHTMLStyleSheetRule = js.native
  def hasInheritableProperty(): Boolean = js.native
  def propertyIsInheritable(name: String): Boolean = js.native
  def propertyIsInline(name: String): Boolean = js.native
}

