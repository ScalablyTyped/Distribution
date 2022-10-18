package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the deleted transit gateway multicast domain.
    */
  var TransitGatewayMulticastDomain: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayMulticastDomain] = js.undefined
}
object DeleteTransitGatewayMulticastDomainResult {
  
  inline def apply(): DeleteTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayMulticastDomainResult]
  }
  
  extension [Self <: DeleteTransitGatewayMulticastDomainResult](x: Self) {
    
    inline def setTransitGatewayMulticastDomain(value: TransitGatewayMulticastDomain): Self = StObject.set(x, "TransitGatewayMulticastDomain", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayMulticastDomainUndefined: Self = StObject.set(x, "TransitGatewayMulticastDomain", js.undefined)
  }
}
