package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.NewItemAlertRuleAction")
@js.native
class NewItemAlertRuleAction protected ()
  extends typings.activexOutlook.Outlook.NewItemAlertRuleAction {
  /* CompleteClass */
  override val ActionType: OlRuleActionType = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.NewItemAlertRuleAction_typekey")
  override var OutlookDotNewItemAlertRuleAction_typekey: typings.activexOutlook.Outlook.NewItemAlertRuleAction = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override var Text: String = js.native
}

