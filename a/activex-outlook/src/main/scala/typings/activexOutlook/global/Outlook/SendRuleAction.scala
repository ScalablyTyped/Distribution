package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.SendRuleAction")
@js.native
class SendRuleAction protected ()
  extends typings.activexOutlook.Outlook.SendRuleAction {
  /* CompleteClass */
  override val ActionType: OlRuleActionType = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.SendRuleAction_typekey")
  override var OutlookDotSendRuleAction_typekey: typings.activexOutlook.Outlook.SendRuleAction = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

