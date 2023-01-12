package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressRuleCondition extends StObject {
  
  var Address: Any
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  /* private */ @JSName("Outlook.AddressRuleCondition_typekey")
  var OutlookDotAddressRuleCondition_typekey: AddressRuleCondition
  
  val Parent: Any
  
  val Session: NameSpace
}
object AddressRuleCondition {
  
  inline def apply(
    Address: Any,
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotAddressRuleCondition_typekey: AddressRuleCondition,
    Parent: Any,
    Session: NameSpace
  ): AddressRuleCondition = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AddressRuleCondition_typekey")(OutlookDotAddressRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressRuleCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressRuleCondition] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Any): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotAddressRuleCondition_typekey(value: AddressRuleCondition): Self = StObject.set(x, "Outlook.AddressRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
