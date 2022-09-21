package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEntitlementResult extends StObject {
  
  /**
    * The entitlement.
    */
  var Entitlement: js.UndefOr[typings.awsSdk.appstreamMod.Entitlement] = js.undefined
}
object UpdateEntitlementResult {
  
  inline def apply(): UpdateEntitlementResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEntitlementResult]
  }
  
  extension [Self <: UpdateEntitlementResult](x: Self) {
    
    inline def setEntitlement(value: Entitlement): Self = StObject.set(x, "Entitlement", value.asInstanceOf[js.Any])
    
    inline def setEntitlementUndefined: Self = StObject.set(x, "Entitlement", js.undefined)
  }
}
