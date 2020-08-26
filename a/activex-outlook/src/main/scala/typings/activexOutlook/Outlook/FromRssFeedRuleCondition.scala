package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromRssFeedRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConditionType: OlRuleConditionType = js.native
  var Enabled: Boolean = js.native
  var FromRssFeed: js.Any = js.native
  @JSName("Outlook.FromRssFeedRuleCondition_typekey")
  var OutlookDotFromRssFeedRuleCondition_typekey: FromRssFeedRuleCondition = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
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
  @scala.inline
  implicit class FromRssFeedRuleConditionOps[Self <: FromRssFeedRuleCondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = this.set("ConditionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromRssFeed(value: js.Any): Self = this.set("FromRssFeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotFromRssFeedRuleCondition_typekey(value: FromRssFeedRuleCondition): Self = this.set("Outlook.FromRssFeedRuleCondition_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

