package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionLimits extends StObject {
  
  /**
    * Limits settings on protection groups for your subscription. 
    */
  var ProtectionGroupLimits: typings.awsSdk.clientsShieldMod.ProtectionGroupLimits
  
  /**
    * Limits settings on protections for your subscription. 
    */
  var ProtectionLimits: typings.awsSdk.clientsShieldMod.ProtectionLimits
}
object SubscriptionLimits {
  
  inline def apply(ProtectionGroupLimits: ProtectionGroupLimits, ProtectionLimits: ProtectionLimits): SubscriptionLimits = {
    val __obj = js.Dynamic.literal(ProtectionGroupLimits = ProtectionGroupLimits.asInstanceOf[js.Any], ProtectionLimits = ProtectionLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionLimits]
  }
  
  extension [Self <: SubscriptionLimits](x: Self) {
    
    inline def setProtectionGroupLimits(value: ProtectionGroupLimits): Self = StObject.set(x, "ProtectionGroupLimits", value.asInstanceOf[js.Any])
    
    inline def setProtectionLimits(value: ProtectionLimits): Self = StObject.set(x, "ProtectionLimits", value.asInstanceOf[js.Any])
  }
}
