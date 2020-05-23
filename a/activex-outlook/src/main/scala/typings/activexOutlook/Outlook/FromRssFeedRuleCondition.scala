package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromRssFeedRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  var FromRssFeed: js.Any
  @JSName("Outlook.FromRssFeedRuleCondition_typekey")
  var OutlookDotFromRssFeedRuleCondition_typekey: FromRssFeedRuleCondition
  val Parent: js.Any
  val Session: NameSpace
}

object FromRssFeedRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    FromRssFeed: js.Any,
    OutlookDotFromRssFeedRuleCondition_typekey: FromRssFeedRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): FromRssFeedRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FromRssFeed = FromRssFeed.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FromRssFeedRuleCondition_typekey")(OutlookDotFromRssFeedRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromRssFeedRuleCondition]
  }
}

