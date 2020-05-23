package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SenderInAddressListRuleCondition extends js.Object {
  var AddressList: typings.activexOutlook.Outlook.AddressList
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  @JSName("Outlook.SenderInAddressListRuleCondition_typekey")
  var OutlookDotSenderInAddressListRuleCondition_typekey: SenderInAddressListRuleCondition
  val Parent: js.Any
  val Session: NameSpace
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
}

