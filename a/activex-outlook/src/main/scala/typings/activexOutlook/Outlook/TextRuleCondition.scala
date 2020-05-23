package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  @JSName("Outlook.TextRuleCondition_typekey")
  var OutlookDotTextRuleCondition_typekey: TextRuleCondition
  val Parent: js.Any
  val Session: NameSpace
  var Text: js.Any
}

object TextRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotTextRuleCondition_typekey: TextRuleCondition,
    Parent: js.Any,
    Session: NameSpace,
    Text: js.Any
  ): TextRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TextRuleCondition_typekey")(OutlookDotTextRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRuleCondition]
  }
}

