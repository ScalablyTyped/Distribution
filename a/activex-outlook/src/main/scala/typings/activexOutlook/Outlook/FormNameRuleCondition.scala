package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  var FormName: js.Any
  @JSName("Outlook.FormNameRuleCondition_typekey")
  var OutlookDotFormNameRuleCondition_typekey: FormNameRuleCondition
  val Parent: js.Any
  val Session: NameSpace
}

object FormNameRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    FormName: js.Any,
    OutlookDotFormNameRuleCondition_typekey: FormNameRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): FormNameRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FormName = FormName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FormNameRuleCondition_typekey")(OutlookDotFormNameRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormNameRuleCondition]
  }
}

