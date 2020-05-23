package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlMarkInterval
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.MarkAsTaskRuleAction")
@js.native
class MarkAsTaskRuleAction protected ()
  extends typings.activexOutlook.Outlook.MarkAsTaskRuleAction {
  /* CompleteClass */
  override val ActionType: OlRuleActionType = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var FlagTo: String = js.native
  /* CompleteClass */
  override var MarkInterval: OlMarkInterval = js.native
  /* CompleteClass */
  @JSName("Outlook.MarkAsTaskRuleAction_typekey")
  override var OutlookDotMarkAsTaskRuleAction_typekey: typings.activexOutlook.Outlook.MarkAsTaskRuleAction = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

