package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Rule")
@js.native
class Rule protected () extends js.Object {
  val Actions: RuleActions = js.native
  val Application: Application = js.native
  val Class: OlObjectClass = js.native
  val Conditions: RuleConditions = js.native
  var Enabled: scala.Boolean = js.native
  val Exceptions: RuleConditions = js.native
  var ExecutionOrder: scala.Double = js.native
  val IsLocalRule: scala.Boolean = js.native
  var Name: java.lang.String = js.native
  var `Outlook.Rule_typekey`: Rule = js.native
  val Parent: js.Any = js.native
  val RuleType: OlRuleType = js.native
  val Session: NameSpace = js.native
  def Execute(): scala.Unit = js.native
  def Execute(ShowProgress: js.Any): scala.Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any): scala.Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any, IncludeSubfolders: js.Any): scala.Unit = js.native
  def Execute(ShowProgress: js.Any, Folder: js.Any, IncludeSubfolders: js.Any, RuleExecuteOption: js.Any): scala.Unit = js.native
}

