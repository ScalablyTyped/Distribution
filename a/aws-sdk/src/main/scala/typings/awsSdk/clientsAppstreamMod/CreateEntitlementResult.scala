package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEntitlementResult extends StObject {
  
  /**
    * The entitlement.
    */
  var Entitlement: js.UndefOr[typings.awsSdk.clientsAppstreamMod.Entitlement] = js.undefined
}
object CreateEntitlementResult {
  
  inline def apply(): CreateEntitlementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEntitlementResult]
  }
  
  extension [Self <: CreateEntitlementResult](x: Self) {
    
    inline def setEntitlement(value: Entitlement): Self = StObject.set(x, "Entitlement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementUndefined: Self = StObject.set(x, "Entitlement", js.undefined)
  }
}
