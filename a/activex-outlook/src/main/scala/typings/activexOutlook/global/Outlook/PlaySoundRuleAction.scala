package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.PlaySoundRuleAction")
@js.native
class PlaySoundRuleAction protected ()
  extends StObject
     with typings.activexOutlook.Outlook.PlaySoundRuleAction {
  
  /* CompleteClass */
  override val ActionType: OlRuleActionType = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  var FilePath: String = js.native
  
  /* CompleteClass */
  @JSName("Outlook.PlaySoundRuleAction_typekey")
  var OutlookDotPlaySoundRuleAction_typekey: typings.activexOutlook.Outlook.PlaySoundRuleAction = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
