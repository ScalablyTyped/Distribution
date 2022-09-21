package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.RuleAction")
@js.native
/* private */ open class RuleAction ()
  extends StObject
     with typings.activexOutlook.Outlook.RuleAction {
  
  /* CompleteClass */
  override val ActionType: OlRuleActionType = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.RuleAction_typekey")
  var OutlookDotRuleAction_typekey: typings.activexOutlook.Outlook.RuleAction = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
