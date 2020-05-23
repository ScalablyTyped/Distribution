package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  var Categories: js.Any
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  @JSName("Outlook.CategoryRuleCondition_typekey")
  var OutlookDotCategoryRuleCondition_typekey: CategoryRuleCondition
  val Parent: js.Any
  val Session: NameSpace
}

object CategoryRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Categories: js.Any,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotCategoryRuleCondition_typekey: CategoryRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): CategoryRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CategoryRuleCondition_typekey")(OutlookDotCategoryRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryRuleCondition]
  }
}

