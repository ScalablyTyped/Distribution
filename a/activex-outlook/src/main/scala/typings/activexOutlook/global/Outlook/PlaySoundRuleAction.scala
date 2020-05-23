package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.PlaySoundRuleAction")
@js.native
class PlaySoundRuleAction protected ()
  extends typings.activexOutlook.Outlook.PlaySoundRuleAction {
  /* CompleteClass */
  override val ActionType: OlRuleActionType = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  override var FilePath: String = js.native
  /* CompleteClass */
  @JSName("Outlook.PlaySoundRuleAction_typekey")
  override var OutlookDotPlaySoundRuleAction_typekey: typings.activexOutlook.Outlook.PlaySoundRuleAction = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

