package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AccountRuleCondition")
@js.native
class AccountRuleCondition protected ()
  extends typings.activexOutlook.Outlook.AccountRuleCondition {
  /* CompleteClass */
  override var Account: typings.activexOutlook.Outlook.Account = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.AccountRuleCondition_typekey")
  override var OutlookDotAccountRuleCondition_typekey: typings.activexOutlook.Outlook.AccountRuleCondition = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

