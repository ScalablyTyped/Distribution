package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportanceRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  var Importance: OlImportance
  @JSName("Outlook.ImportanceRuleCondition_typekey")
  var OutlookDotImportanceRuleCondition_typekey: ImportanceRuleCondition
  val Parent: js.Any
  val Session: NameSpace
}

object ImportanceRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    Importance: OlImportance,
    OutlookDotImportanceRuleCondition_typekey: ImportanceRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): ImportanceRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Importance = Importance.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ImportanceRuleCondition_typekey")(OutlookDotImportanceRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportanceRuleCondition]
  }
}

