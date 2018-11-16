package typings
package activexDashMshtmlLib.MSHTMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.IRulesApplied")
@js.native
class IRulesApplied protected () extends js.Object {
  var `MSHTML.IRulesApplied_typekey`: IRulesApplied = js.native
  @JSName("appliedRules")
  val appliedRules_Original: IHTMLStyleSheetRulesAppliedCollection = js.native
  val element: IHTMLElement = js.native
  val inlineStyles: IHTMLStyle = js.native
  def appliedRules(index: scala.Double): IHTMLStyleSheetRule = js.native
  def hasInheritableProperty(): scala.Boolean = js.native
  def propertyIsInheritable(name: java.lang.String): scala.Boolean = js.native
  def propertyIsInline(name: java.lang.String): scala.Boolean = js.native
}

