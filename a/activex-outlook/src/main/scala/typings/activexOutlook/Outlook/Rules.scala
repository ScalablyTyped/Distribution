package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Rules")
@js.native
class Rules protected () extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Count: Double = js.native
  var IsRssRulesProcessingEnabled: Boolean = js.native
  @JSName("Outlook.Rules_typekey")
  var OutlookDotRules_typekey: Rules = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  def Create(Name: String, RuleType: OlRuleType): Rule = js.native
  def Item(Index: js.Any): Rule = js.native
  def Remove(Index: js.Any): Unit = js.native
  def Save(): Unit = js.native
  def Save(ShowProgress: js.Any): Unit = js.native
}

