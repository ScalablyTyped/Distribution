package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressRuleCondition")
@js.native
class AddressRuleCondition protected ()
  extends typings.activexOutlook.Outlook.AddressRuleCondition {
  /* CompleteClass */
  override var Address: js.Any = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.AddressRuleCondition_typekey")
  override var OutlookDotAddressRuleCondition_typekey: typings.activexOutlook.Outlook.AddressRuleCondition = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

