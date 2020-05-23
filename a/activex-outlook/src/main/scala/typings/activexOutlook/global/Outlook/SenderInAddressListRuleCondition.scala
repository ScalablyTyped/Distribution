package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SenderInAddressListRuleCondition")
@js.native
class SenderInAddressListRuleCondition protected ()
  extends typings.activexOutlook.Outlook.SenderInAddressListRuleCondition {
  /* CompleteClass */
  override var AddressList: typings.activexOutlook.Outlook.AddressList = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.SenderInAddressListRuleCondition_typekey")
  override var OutlookDotSenderInAddressListRuleCondition_typekey: typings.activexOutlook.Outlook.SenderInAddressListRuleCondition = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

