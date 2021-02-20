package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SenderInAddressListRuleCondition extends StObject {
  
  var AddressList: typings.activexOutlook.Outlook.AddressList = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val ConditionType: OlRuleConditionType = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Outlook.SenderInAddressListRuleCondition_typekey")
  var OutlookDotSenderInAddressListRuleCondition_typekey: SenderInAddressListRuleCondition = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object SenderInAddressListRuleCondition {
  
  @scala.inline
  def apply(
    AddressList: AddressList,
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotSenderInAddressListRuleCondition_typekey: SenderInAddressListRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): SenderInAddressListRuleCondition = {
    val __obj = js.Dynamic.literal(AddressList = AddressList.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SenderInAddressListRuleCondition_typekey")(OutlookDotSenderInAddressListRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderInAddressListRuleCondition]
  }
  
  @scala.inline
  implicit class SenderInAddressListRuleConditionMutableBuilder[Self <: SenderInAddressListRuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressList(value: AddressList): Self = StObject.set(x, "AddressList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotSenderInAddressListRuleCondition_typekey(value: SenderInAddressListRuleCondition): Self = StObject.set(x, "Outlook.SenderInAddressListRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
