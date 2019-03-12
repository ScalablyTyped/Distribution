package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Rules")
@js.native
class Rules protected () extends js.Object {
  val Application: activexDashOutlookLib.OutlookNs.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: scala.Double = js.native
  var IsRssRulesProcessingEnabled: scala.Boolean = js.native
  var `Outlook.Rules_typekey`: Rules = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Create(Name: java.lang.String, RuleType: OlRuleType): Rule = js.native
  def Item(Index: js.Any): Rule = js.native
  def Remove(Index: js.Any): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  def Save(ShowProgress: js.Any): scala.Unit = js.native
}

