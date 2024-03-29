package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlImportance
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleConditionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.ImportanceRuleCondition")
@js.native
/* private */ open class ImportanceRuleCondition ()
  extends StObject
     with typings.activexOutlook.Outlook.ImportanceRuleCondition {
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  var Importance: OlImportance = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.ImportanceRuleCondition_typekey")
  var OutlookDotImportanceRuleCondition_typekey: typings.activexOutlook.Outlook.ImportanceRuleCondition = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
