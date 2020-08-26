package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SenderInAddressListRuleCondition extends js.Object {
  var AddressList: typings.activexOutlook.Outlook.AddressList = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConditionType: OlRuleConditionType = js.native
  var Enabled: Boolean = js.native
  @JSName("Outlook.SenderInAddressListRuleCondition_typekey")
  var OutlookDotSenderInAddressListRuleCondition_typekey: SenderInAddressListRuleCondition = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object SenderInAddressListRuleCondition {
  @scala.inline
  def apply(
    AddressList: AddressList,
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotSenderInAddressListRuleCondition_typekey: SenderInAddressListRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): SenderInAddressListRuleCondition = {
    val __obj = js.Dynamic.literal(AddressList = AddressList.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SenderInAddressListRuleCondition_typekey")(OutlookDotSenderInAddressListRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderInAddressListRuleCondition]
  }
  @scala.inline
  implicit class SenderInAddressListRuleConditionOps[Self <: SenderInAddressListRuleCondition] (val x: Self) extends AnyVal {
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
    def setAddressList(value: AddressList): Self = this.set("AddressList", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = this.set("ConditionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotSenderInAddressListRuleCondition_typekey(value: SenderInAddressListRuleCondition): Self = this.set("Outlook.SenderInAddressListRuleCondition_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

