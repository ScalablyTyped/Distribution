package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressRuleCondition extends js.Object {
  var Address: js.Any
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  @JSName("Outlook.AddressRuleCondition_typekey")
  var OutlookDotAddressRuleCondition_typekey: AddressRuleCondition
  val Parent: js.Any
  val Session: NameSpace
}

object AddressRuleCondition {
  @scala.inline
  def apply(
    Address: js.Any,
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotAddressRuleCondition_typekey: AddressRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): AddressRuleCondition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressRuleCondition_typekey")(OutlookDotAddressRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressRuleCondition]
  }
}

