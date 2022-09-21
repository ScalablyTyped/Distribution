package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlRuleConditionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.SenderInAddressListRuleCondition")
@js.native
/* private */ open class SenderInAddressListRuleCondition ()
  extends StObject
     with typings.activexOutlook.Outlook.SenderInAddressListRuleCondition {
  
  /* CompleteClass */
  var AddressList: typings.activexOutlook.Outlook.AddressList = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val ConditionType: OlRuleConditionType = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.SenderInAddressListRuleCondition_typekey")
  var OutlookDotSenderInAddressListRuleCondition_typekey: typings.activexOutlook.Outlook.SenderInAddressListRuleCondition = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
}
