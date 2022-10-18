package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entitlement extends StObject {
  
  /**
    * Indicates whether check-ins are allowed.
    */
  var AllowCheckIn: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Maximum entitlement count. Use if the unit is not None.
    */
  var MaxCount: js.UndefOr[Long] = js.undefined
  
  /**
    * Entitlement name.
    */
  var Name: String
  
  /**
    * Indicates whether overages are allowed.
    */
  var Overage: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Entitlement unit.
    */
  var Unit: EntitlementUnit
  
  /**
    * Entitlement resource. Use only if the unit is None.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object Entitlement {
  
  inline def apply(Name: String, Unit: EntitlementUnit): Entitlement = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Unit = Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entitlement]
  }
  
  extension [Self <: Entitlement](x: Self) {
    
    inline def setAllowCheckIn(value: BoxBoolean): Self = StObject.set(x, "AllowCheckIn", value.asInstanceOf[js.Any])
    
    inline def setAllowCheckInUndefined: Self = StObject.set(x, "AllowCheckIn", js.undefined)
    
    inline def setMaxCount(value: Long): Self = StObject.set(x, "MaxCount", value.asInstanceOf[js.Any])
    
    inline def setMaxCountUndefined: Self = StObject.set(x, "MaxCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOverage(value: BoxBoolean): Self = StObject.set(x, "Overage", value.asInstanceOf[js.Any])
    
    inline def setOverageUndefined: Self = StObject.set(x, "Overage", js.undefined)
    
    inline def setUnit(value: EntitlementUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
