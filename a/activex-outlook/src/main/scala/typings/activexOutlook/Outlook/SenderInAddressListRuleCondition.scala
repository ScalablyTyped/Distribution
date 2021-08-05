package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SenderInAddressListRuleCondition extends StObject {
  
  var AddressList: typings.activexOutlook.Outlook.AddressList
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  /* private */ @JSName("Outlook.SenderInAddressListRuleCondition_typekey")
  var OutlookDotSenderInAddressListRuleCondition_typekey: SenderInAddressListRuleCondition
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object SenderInAddressListRuleCondition {
  
  inline def apply(
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
  
  extension [Self <: SenderInAddressListRuleCondition](x: Self) {
    
    inline def setAddressList(value: AddressList): Self = StObject.set(x, "AddressList", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotSenderInAddressListRuleCondition_typekey(value: SenderInAddressListRuleCondition): Self = StObject.set(x, "Outlook.SenderInAddressListRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
