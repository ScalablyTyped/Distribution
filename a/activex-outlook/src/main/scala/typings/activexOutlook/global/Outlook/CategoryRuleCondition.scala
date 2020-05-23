package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleConditionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.CategoryRuleCondition")
@js.native
class CategoryRuleCondition protected ()
  extends typings.activexOutlook.Outlook.CategoryRuleCondition {
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override var Categories: js.Any = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  /* CompleteClass */
  override var Enabled: Boolean = js.native
  /* CompleteClass */
  @JSName("Outlook.CategoryRuleCondition_typekey")
  override var OutlookDotCategoryRuleCondition_typekey: typings.activexOutlook.Outlook.CategoryRuleCondition = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}

